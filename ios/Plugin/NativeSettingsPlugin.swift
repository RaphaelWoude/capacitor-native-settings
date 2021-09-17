import Foundation
import Capacitor

/**
 * Please read the Capacitor iOS Plugin Development Guide
 * here: https://capacitorjs.com/docs/plugins/ios
 */
@objc(NativeSettingsPlugin)
public class NativeSettingsPlugin: CAPPlugin {
    @objc func openIOS(_ call: CAPPluginCall) {
        guard let value = call.getString("option") else {
            call.reject("Requested empty setting is not available on iOS.")
            return
        }

        var settingsUrl: URL!

        switch value {
        case "general":
            settingsUrl = URL(string: "App-Prefs:root=General")
        case "app":
            settingsUrl = URL(string: UIApplication.openSettingsURLString)
        default:
            call.reject("Requested setting \"" + value + "\" is not available on iOS.")
            return
        }

        DispatchQueue.main.sync {
            if UIApplication.shared.canOpenURL(settingsUrl) {
                UIApplication.shared.open(settingsUrl, completionHandler: { (success) in
                    call.resolve([
                        "status": success
                    ])
                })
            } else {
                call.reject("Cannot open settings")
            }
        }
    }
}
