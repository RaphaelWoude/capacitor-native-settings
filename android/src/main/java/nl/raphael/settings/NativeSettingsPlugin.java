package nl.raphael.settings;

import static android.provider.Settings.ACTION_APPLICATION_DETAILS_SETTINGS;

import android.content.Intent;
import android.net.Uri;
import com.getcapacitor.JSObject;
import android.content.Context;
import androidx.core.app.NotificationManagerCompat;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;
import android.net.ConnectivityManager;
import  android.app.ActivityManager;
@CapacitorPlugin(name = "NativeSettings")
public class NativeSettingsPlugin extends Plugin {
    @PluginMethod
    public void checkPermission(PluginCall call) {
      Context context = getContext();
      NotificationManagerCompat notificationManager = NotificationManagerCompat.from(context);
      ConnectivityManager connMgr = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
      ActivityManager activityManager = (ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE);
      JSObject js = new JSObject();
      js.put("BatteryOptimizations", activityManager.isBackgroundRestricted());
      js.put("Connectivity", connMgr.getRestrictBackgroundStatus());
      js.put("Notification", notificationManager.areNotificationsEnabled());
    js.put("status", true);
    call.resolve(js);
    }

  @PluginMethod
  public void openNotification(PluginCall call) {
    Context context = getContext();
    Intent intent = new Intent();
    intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
    intent.putExtra("app_package",    getActivity().getPackageName());
    intent.putExtra("app_uid", context.getApplicationInfo().uid);
    intent.putExtra("android.provider.extra.APP_PACKAGE",    getActivity().getPackageName());
    getActivity().startActivity(intent);
    JSObject js = new JSObject();
    js.put("status", true);
    call.resolve(js);
  }

  @PluginMethod
  public void openBackground(PluginCall call) {
    Context context = getContext();
    Intent intent = new Intent();
    intent.setAction("android.settings.IGNORE_BACKGROUND_DATA_RESTRICTIONS_SETTINGS");
    intent.setData(Uri.parse("package:" + getActivity().getPackageName()));  getActivity().startActivity(intent);
    JSObject js = new JSObject();
    js.put("status", true);
    call.resolve(js);
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
