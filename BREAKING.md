## Versions

- [Version 8.1.0](#version-810)
- [Version 8.0.0](#version-800)
- [Version 4.x.x](#version-4xx)

---

## Version 8.1.0

### ⚠️ Breaking Change: Error Handling Strategy
We have reverted the previous changes for error handling. Capacitor has since been updated and resolved its issues, allowing us to restore the original error handling behavior.
```javascript
// Old behavior (v8.0.0)
const result = await NativeSettings.open(...);
if (!result.status) {
  console.error(result.error);
}

// New behavior (v8.1.0)
try {
  await NativeSettings.open(...);
} catch (error) {
  console.error(error);
}
```

## Version 8.0.0

### ⚠️ Breaking Change: Error Handling Strategy

**Starting from Capacitor 8, this plugin no longer rejects promises from native code.**

This is a consequence of changes in Capacitor’s native plugin APIs (specifically regarding Swift Package Manager on iOS), which removed or restricted direct promise rejection in iOS plugins.

**What changed:**
All plugin methods now always **resolve** and report errors via the returned object, following this pattern:

```javascript
// Old behavior (v4/v5/v6/v7)
try {
  await NativeSettings.open(...);
} catch (error) {
  console.error(error);
}

// New behavior (v8)
const result = await NativeSettings.open(...);
if (!result.success) {
  console.error(result.error);
}

```

**Key Note:**

* Starting from **v8**, plugin methods **never reject promises**.
* Errors are returned in the resolved object as `{ success: false, error: "message" }`.

See: [Updating Plugins to Capacitor 8](https://capacitorjs.com/docs/updating/plugins/8-0)

---

## Version 4.x.x

### ⚠️ Breaking Change: Capacitor 4

This plugin now supports Capacitor 4 only. Please run `npx cap sync` after updating this package.

If you want to use this plugin with Capacitor 3, please install version `0.2.1`:

```bash
npm i capacitor-native-settings@0.2.1

```
