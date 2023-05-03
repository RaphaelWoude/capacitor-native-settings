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

@CapacitorPlugin(name = "NativeSettings")
public class NativeSettingsPlugin extends Plugin {

    @PluginMethod
    public void open(PluginCall call) {
        String option = call.getString("optionAndroid");
        String setting = AndroidSettings.getAction(option);

        // Check if settings is available.
        if (setting == null) {
            call.reject("Could not find native android setting: " + option);
            return;
        }

        this.openOption(call, setting);
    }

    @PluginMethod
    public void openAndroid(PluginCall call) {
        String option = call.getString("option");
        String setting = AndroidSettings.getAction(option);

        // Check if settings is available.
        if (setting == null) {
            call.reject("Could not find native android setting: " + option);
            return;
        }

        this.openOption(call, setting);
    }

    private void openOption(PluginCall call, String setting) {
        Intent intent = new Intent();

        // Application details requires package name as URI.
        if (ACTION_APPLICATION_DETAILS_SETTINGS.equals(setting)) {
            intent.setAction(setting);
            intent.setData(Uri.parse("package:" + getActivity().getPackageName()));
        } else if (ACTION_APP_NOTIFICATION_SETTINGS.equals(setting)) { // App notification settings requires package name as extra app package.
            intent.setAction(setting);
            intent.putExtra(EXTRA_APP_PACKAGE, getActivity().getPackageName());
        } else {
            intent.setAction(setting);
        }

        startActivityForResult(call, intent, "activityResult");
    }

    /**
     * Send response on activityResult (when intent closes)
     */
    @ActivityCallback
    private void activityResult(PluginCall call, ActivityResult result) {
        JSObject js = new JSObject();
        js.put("status", true);
        call.resolve(js);
    }
}
