package nl.raphael.settings;

/**
 * Collection of Android settings intent actions that are not part of the
 * public {@link android.provider.Settings} API.
 *
 * <p>These actions may not be available on all devices or Android versions.</p>
 */
public final class CustomAndroidSettings {

    private CustomAndroidSettings() {
        // Utility class
    }

    /** Activity Action: Show Zen Mode configuration settings. */
    public static final String ACTION_ZEN_MODE_SETTINGS =
        "android.settings.ZEN_MODE_SETTINGS";

    /** Activity Action: Show Zen Mode visual effects configuration settings. */
    public static final String ACTION_ZEN_MODE_BLOCKED_EFFECTS_SETTINGS =
        "android.settings.ZEN_MODE_BLOCKED_EFFECTS_SETTINGS";

    /** Activity Action: Show Text-to-Speech settings. */
    public static final String ACTION_TTS_SETTINGS =
        "com.android.settings.TTS_SETTINGS";
}
