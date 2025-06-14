import Foundation
import Capacitor

@objc(NativeSettingsPlugin)
public class NativeSettingsPlugin: CAPPlugin, CAPBridgedPlugin {

    /// The unique identifier for the plugin.
    public let identifier = "NativeSettingsPlugin"

    /// The name used to reference this plugin in JavaScript.
    public let jsName = "NativeSettings"

    public let pluginMethods: [CAPPluginMethod] = [
        CAPPluginMethod(name: "openIOS", returnType: CAPPluginReturnPromise),
        CAPPluginMethod(name: "open", returnType: CAPPluginReturnPromise)
    ]

    let settingsPaths = [
        "about": "App-prefs:General&path=About",
        "autoLock": "App-prefs:General&path=AUTOLOCK",
        "bluetooth": "App-prefs:Bluetooth",
        "dateTime": "App-prefs:General&path=DATE_AND_TIME",
        "facetime": "App-prefs:FACETIME",
        "general": "App-prefs:General",
        "keyboard": "App-prefs:General&path=Keyboard",
        "iCloud": "App-prefs:CASTLE",
        "iCloudStorageBackup": "App-prefs:CASTLE&path=STORAGE_AND_BACKUP",
        "international": "App-prefs:General&path=INTERNATIONAL",
        "locationServices": "App-prefs:Privacy&path=LOCATION",
        "music": "App-prefs:MUSIC",
        "notes": "App-prefs:NOTES",
        "notifications": "App-prefs:NOTIFICATIONS_ID",
        "phone": "App-prefs:Phone",
        "photos": "App-prefs:Photos",
        "managedConfigurationList": "App-prefs:General&path=ManagedConfigurationList",
        "reset": "App-prefs:General&path=Reset",
        "ringtone": "App-prefs:Sounds&path=Ringtone",
        "sounds": "App-prefs:Sounds",
        "softwareUpdate": "App-prefs:General&path=SOFTWARE_UPDATE_LINK",
        "store": "App-prefs:STORE",
        "tracking": "App-prefs:Privacy&path=USER_TRACKING",
        "wallpaper": "App-prefs:Wallpaper",
        "wifi": "App-prefs:WIFI",
        "tethering": "App-prefs:INTERNET_TETHERING",
        "doNotDisturb": "App-prefs:DO_NOT_DISTURB",
        "touchIdPasscode": "App-prefs:TOUCHID_PASSCODE",
        "screenTime": "App-prefs:SCREEN_TIME",
        "accessibility": "App-prefs:ACCESSIBILITY",
        "vpn": "App-prefs:VPN"
    ]

    @objc func open(_ call: CAPPluginCall) {
        let option = call.getString("optionIOS") ?? ""
        handleOpen(call: call, option: option)
    }

    @objc func openIOS(_ call: CAPPluginCall) {
        let option = call.getString("option") ?? ""
        handleOpen(call: call, option: option)
    }

    @objc private func handleOpen(call: CAPPluginCall, option: String) {
        var settingsUrl: URL?

        if let path = settingsPaths[option], let url = URL(string: path) {
            settingsUrl = url
        } else if option == "app" {
            settingsUrl = URL(string: UIApplication.openSettingsURLString)
        } else if option == "appNotification" {
            if #available(iOS 16.0, *) {
                settingsUrl = URL(string: UIApplication.openNotificationSettingsURLString)
            } else {
                settingsUrl = URL(string: UIApplication.openSettingsURLString)
            }
        } else {
            call.reject("Requested setting \"" + option + "\" is not available on iOS.")
            return
        }

        guard let validUrl = settingsUrl, UIApplication.shared.canOpenURL(validUrl) else {
            call.reject("Cannot open settings or invalid URL")
            return
        }

        DispatchQueue.main.async {
            UIApplication.shared.open(validUrl) { success in
                if success {
                    call.resolve(["status": success])
                } else {
                    call.reject("Failed to open settings")
                }
            }
        }
    }
}
