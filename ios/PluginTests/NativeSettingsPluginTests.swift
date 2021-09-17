import XCTest
import Capacitor
@testable import Plugin

class NativeSettingsTests: XCTestCase {
    override func setUp() {
        super.setUp()
    }

    override func tearDown() {
        super.tearDown()
    }

    func test_pluginProvidesRequiredMethod() {
        let sut = NativeSettingsPlugin()
        sut.conforms(to: NativeSettingsPluginProtocol.self)
    }
}

@objc protocol NativeSettingsPluginProtocol {
    @objc func openIOS(_ call: CAPPluginCall)
}

extension NativeSettingsPlugin: NativeSettingsPluginProtocol { }
