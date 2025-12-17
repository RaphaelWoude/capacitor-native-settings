import Foundation
import Capacitor
import UIKit

/// Capacitor bridge for the NativeSettings plugin.
///
/// This class exposes native iOS functionality to JavaScript,
/// delegating all business logic to the `NativeSettings` class.
@objc(NativeSettingsPlugin)
public class NativeSettingsPlugin: CAPPlugin, CAPBridgedPlugin {

    public let identifier = "NativeSettingsPlugin"
    public let jsName = "NativeSettings"

    public let pluginMethods: [CAPPluginMethod] = [
        CAPPluginMethod(name: "openIOS", returnType: CAPPluginReturnPromise),
        CAPPluginMethod(name: "open", returnType: CAPPluginReturnPromise)
    ]

    private let implementation = NativeSettings()

    override public func load() {
        log("Plugin loaded")
    }

    /// Opens a system settings page (legacy key).
    @objc func open(_ call: CAPPluginCall) {
        let option = call.getString("optionIOS", "")
        handleOpen(call: call, option: option)
    }

    /// Opens a system settings page.
    @objc func openIOS(_ call: CAPPluginCall) {
        let option = call.getString("option", "")
        handleOpen(call: call, option: option)
    }

    private func handleOpen(call: CAPPluginCall, option: String) {
        log("Requested option:", option)

        guard let url = implementation.resolveSettingsURL(for: option),
              UIApplication.shared.canOpenURL(url) else {
            log("Invalid or unsupported option:", option)
            call.resolve([
                "success": false,
                "error": "Requested setting '\(option)' is not available on iOS."
            ])
            return
        }

        DispatchQueue.main.async {
            UIApplication.shared.open(url, options: [:]) { success in
                log("Open result:", success)
                call.resolve([
                    "success": success
                ])
            }
        }
    }
}
