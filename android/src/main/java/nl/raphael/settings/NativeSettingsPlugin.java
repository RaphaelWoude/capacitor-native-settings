package nl.raphael.settings;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
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

        if (setting == null) {
            call.reject("Could not find native android setting: " + option);
            return;
        }

        getActivity().startActivity(new Intent(setting));
        JSObject js = new JSObject();
        js.put("status", true);
        call.resolve(js);
    }
}
