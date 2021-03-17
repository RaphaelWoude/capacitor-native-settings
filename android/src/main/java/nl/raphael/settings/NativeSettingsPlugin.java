package nl.raphael.settings;

import static android.provider.Settings.ACTION_APPLICATION_DETAILS_SETTINGS;

import android.content.Intent;
import android.net.Uri;
import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin(name = "NativeSettings")
public class NativeSettingsPlugin extends Plugin {

    @PluginMethod
    public void openAndroid(PluginCall call) {
        String option = call.getString("option");
        String setting = AndroidSettings.getAction(option);

        // Check if settings is available.
        if (setting == null) {
            call.reject("Could not find native android setting: " + option);
            return;
        }

        Intent intent = new Intent();

        // Application details requires package name as URI.
        if (ACTION_APPLICATION_DETAILS_SETTINGS.equals(setting)) {
            intent.setAction(setting);
            intent.setData(Uri.parse("package:" + getActivity().getPackageName()));
        } else {
            intent.setAction(setting);
        }

        // Start intent in activity.
        getActivity().startActivity(intent);

        // Send response.
        JSObject js = new JSObject();
        js.put("status", true);
        call.resolve(js);
    }
}
