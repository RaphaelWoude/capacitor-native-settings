import Foundation
import Capacitor

/**
 * Please read the Capacitor iOS Plugin Development Guide
 * here: https://capacitorjs.com/docs/plugins/ios
 */
@objc(NativeSettingsPlugin)
public class NativeSettingsPlugin: CAPPlugin {
    @objc func openIOS(_ call: CAPPluginCall) {
        let value = call.getString("option") ?? ""
        var settingsUrl:URL!
        
        if (value == "general") {
            settingsUrl = URL(string: "App-Prefs:root=General")
        } else if (value == "app") {
            settingsUrl = URL(string: UIApplication.openSettingsURLString)
        } else {
            call.reject("Requested setting \"" + value + "\" is not available on iOS.");
            return
        }

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
