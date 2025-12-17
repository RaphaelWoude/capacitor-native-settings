package nl.raphael.settings;

import static android.provider.Settings.*;

/**
 * Enumeration of supported Android system settings.
 *
 * <p>Each enum constant maps a public JavaScript-facing key to a corresponding
 * Android {@link android.provider.Settings} intent action.</p>
 *
 * <p>This enum is used to resolve a requested settings option into a concrete
 * Android intent action string.</p>
 */
public enum AndroidSettings {
    Accessibility("accessibility", ACTION_ACCESSIBILITY_SETTINGS),
    Account("account", ACTION_ADD_ACCOUNT),
    AirplaneMode("airplane_mode", ACTION_AIRPLANE_MODE_SETTINGS),
    Apn("apn", ACTION_APN_SETTINGS),
    ApplicationDetails("application_details", ACTION_APPLICATION_DETAILS_SETTINGS),
    ApplicationDevelopment("application_development", ACTION_APPLICATION_DEVELOPMENT_SETTINGS),
    Application("application", ACTION_APPLICATION_SETTINGS),
    AppNotification("app_notification", ACTION_APP_NOTIFICATION_SETTINGS),
    AppNotificationPolicy("app_notification_policy", ACTION_NOTIFICATION_POLICY_ACCESS_SETTINGS),
    BatteryOptimization("battery_optimization", ACTION_IGNORE_BATTERY_OPTIMIZATION_SETTINGS),
    Bluetooth("bluetooth", ACTION_BLUETOOTH_SETTINGS),
    Captioning("captioning", ACTION_CAPTIONING_SETTINGS),
    Cast("cast", ACTION_CAST_SETTINGS),
    DataRoaming("data_roaming", ACTION_DATA_ROAMING_SETTINGS),
    Date("date", ACTION_DATE_SETTINGS),
    Display("display", ACTION_DISPLAY_SETTINGS),
    Dream("dream", ACTION_DREAM_SETTINGS),
    Home("home", ACTION_HOME_SETTINGS),
    Keyboard("keyboard", ACTION_INPUT_METHOD_SETTINGS),
    KeyboardSubType("keyboard_subtype", ACTION_INPUT_METHOD_SUBTYPE_SETTINGS),
    Locale("locale", ACTION_LOCALE_SETTINGS),
    Location("location", ACTION_LOCATION_SOURCE_SETTINGS),
    ManageApplications("manage_applications", ACTION_MANAGE_APPLICATIONS_SETTINGS),
    ManageAllApplications("manage_all_applications", ACTION_MANAGE_ALL_APPLICATIONS_SETTINGS),
    MemoryCard("memory_card", ACTION_MEMORY_CARD_SETTINGS),
    Network("network", ACTION_NETWORK_OPERATOR_SETTINGS),
    NfcSharing("nfcsharing", ACTION_NFCSHARING_SETTINGS),
    NfcPayment("nfc_payment", ACTION_NFC_PAYMENT_SETTINGS),
    NfcSettings("nfc_settings", ACTION_NFC_SETTINGS),
    Print("print", ACTION_PRINT_SETTINGS),
    Privacy("privacy", ACTION_PRIVACY_SETTINGS),
    QuickLaunch("quick_launch", ACTION_QUICK_LAUNCH_SETTINGS),
    Search("search", ACTION_SEARCH_SETTINGS),
    Security("security", ACTION_SECURITY_SETTINGS),
    Settings("settings", ACTION_SETTINGS),
    ShowRegulatoryInfo("show_regulatory_info", ACTION_SHOW_REGULATORY_INFO),
    Sound("sound", ACTION_SOUND_SETTINGS),
    Storage("storage", ACTION_INTERNAL_STORAGE_SETTINGS),
    Sync("sync", ACTION_SYNC_SETTINGS),
    TextToSpeech("text_to_speech", CustomAndroidSettings.ACTION_TTS_SETTINGS),
    Usage("usage", ACTION_USAGE_ACCESS_SETTINGS),
    UserDictionary("user_dictionary", ACTION_USER_DICTIONARY_SETTINGS),
    VoiceInput("voice_input", ACTION_VOICE_INPUT_SETTINGS),
    VPN("vpn", ACTION_VPN_SETTINGS),
    Wifi("wifi", ACTION_WIFI_SETTINGS),
    WifiIp("wifi_ip", ACTION_WIFI_IP_SETTINGS),
    Wireless("wireless", ACTION_WIRELESS_SETTINGS),
    ZenMode("zen_mode", CustomAndroidSettings.ACTION_ZEN_MODE_SETTINGS),
    ZenModePriority("zen_mode_priority", ACTION_ZEN_MODE_PRIORITY_SETTINGS),
    ZenModeBlockedEffects("zen_mode_blocked_effects", CustomAndroidSettings.ACTION_ZEN_MODE_BLOCKED_EFFECTS_SETTINGS);

    /** JavaScript-facing option key */
    private final String value;

    /** Android intent action */
    private final String setting;

    AndroidSettings(String value, String setting) {
        this.value = value;
        this.setting = setting;
    }

    /**
     * Resolves a JavaScript option key to an Android settings intent action.
     *
     * @param value the option key provided by JavaScript
     * @return the Android intent action string, or {@code null} if not supported
     */
    public static String getAction(String value) {
        for (AndroidSettings setting : values()) {
            if (setting.value.equals(value)) {
                return setting.setting;
            }
        }
        return null;
    }
}
