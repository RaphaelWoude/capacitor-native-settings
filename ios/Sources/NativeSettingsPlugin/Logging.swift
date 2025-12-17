import Capacitor

/// Logs messages prefixed with the NativeSettings plugin identifier.
///
/// This utility function standardizes logging across the NativeSettings plugin,
/// ensuring all log entries are easily identifiable.
///
/// - Parameters:
///   - items: A variadic list of items to log.
///   - separator: A string used to separate items. Defaults to a single space.
///   - terminator: A string appended after the last item. Defaults to a newline.
func log(_ items: Any..., separator: String = " ", terminator: String = "\n") {
    CAPLog.print("⚡️ NativeSettings -", terminator: separator)

    for (index, item) in items.enumerated() {
        CAPLog.print(item, terminator: index == items.count - 1 ? terminator : separator)
    }
}
