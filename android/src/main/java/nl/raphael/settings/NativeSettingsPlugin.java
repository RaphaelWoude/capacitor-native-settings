package nl.raphael.settings;

import static android.provider.Settings.ACTION_APPLICATION_DETAILS_SETTINGS;
import static android.provider.Settings.ACTION_APP_NOTIFICATION_SETTINGS;
import static android.provider.Settings.EXTRA_APP_PACKAGE;

import android.content.Intent;
import android.net.Uri;
import androidx.activity.result.ActivityResult;
import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.ActivityCallback;
import com.getcapacitor.annotation.CapacitorPlugin;

/**
 * Capacitor plugin that opens Android system settings screens.
 *
 * <p>This plugin acts as a bridge between JavaScript and native Android
 * settings intents.</p>
 */
@CapacitorPlugin(name = "NativeSettings")
public class NativeSettingsPlugin extends Plugin {

    /**
     * Opens an Android system settings screen (legacy key).
     *
     * @param call Capacitor plugin call
     */
    @PluginMethod
    public void open(PluginCall call) {
        openInternal(call, call.getString("optionAndroid"));
    }

    /**
     * Opens an Android system settings screen.
     *
     * @param call Capacitor plugin call
     */
    @PluginMethod
    public void openAndroid(PluginCall call) {
        openInternal(call, call.getString("option"));
    }

    private void openInternal(PluginCall call, String option) {
        if (option == null) {
            resolveError(call, "Missing option parameter");
            return;
        }

        String setting = AndroidSettings.getAction(option);
        if (setting == null) {
            resolveError(call, "Unsupported Android setting: " + option);
            return;
        }

        openOption(call, setting);
    }

    private void openOption(PluginCall call, String setting) {
        Intent intent = new Intent();

        if (ACTION_APPLICATION_DETAILS_SETTINGS.equals(setting)) {
            intent.setAction(setting);
            intent.setData(Uri.parse("package:" + getActivity().getPackageName()));
        } else if (ACTION_APP_NOTIFICATION_SETTINGS.equals(setting)) {
            intent.setAction(setting);
            intent.putExtra(EXTRA_APP_PACKAGE, getActivity().getPackageName());
        } else {
            intent.setAction(setting);
        }

        startActivityForResult(call, intent, "activityResult");
    }

    /**
     * Called when the launched settings activity is closed.
     */
    @ActivityCallback
    private void activityResult(PluginCall call, ActivityResult result) {
        JSObject response = new JSObject();
        response.put("success", true);
        call.resolve(response);
    }

    private void resolveError(PluginCall call, String message) {
        JSObject response = new JSObject();
        response.put("success", false);
        response.put("error", message);
        call.resolve(response);
    }
}
