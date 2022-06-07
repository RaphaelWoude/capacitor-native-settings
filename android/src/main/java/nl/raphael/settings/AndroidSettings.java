package nl.raphael.settings;

import static android.provider.Settings.ACTION_ACCESSIBILITY_SETTINGS;
import static android.provider.Settings.ACTION_ADD_ACCOUNT;
import static android.provider.Settings.ACTION_AIRPLANE_MODE_SETTINGS;
import static android.provider.Settings.ACTION_APN_SETTINGS;
import static android.provider.Settings.ACTION_APPLICATION_DETAILS_SETTINGS;
import static android.provider.Settings.ACTION_APPLICATION_DEVELOPMENT_SETTINGS;
import static android.provider.Settings.ACTION_APPLICATION_SETTINGS;
import static android.provider.Settings.ACTION_APP_NOTIFICATION_SETTINGS;
import static android.provider.Settings.ACTION_BLUETOOTH_SETTINGS;
import static android.provider.Settings.ACTION_CAPTIONING_SETTINGS;
import static android.provider.Settings.ACTION_CAST_SETTINGS;
import static android.provider.Settings.ACTION_DATA_ROAMING_SETTINGS;
import static android.provider.Settings.ACTION_DATE_SETTINGS;
import static android.provider.Settings.ACTION_DISPLAY_SETTINGS;
import static android.provider.Settings.ACTION_DREAM_SETTINGS;
import static android.provider.Settings.ACTION_HOME_SETTINGS;
import static android.provider.Settings.ACTION_IGNORE_BATTERY_OPTIMIZATION_SETTINGS;
import static android.provider.Settings.ACTION_INPUT_METHOD_SETTINGS;
import static android.provider.Settings.ACTION_INPUT_METHOD_SUBTYPE_SETTINGS;
import static android.provider.Settings.ACTION_INTERNAL_STORAGE_SETTINGS;
import static android.provider.Settings.ACTION_LOCALE_SETTINGS;
import static android.provider.Settings.ACTION_LOCATION_SOURCE_SETTINGS;
import static android.provider.Settings.ACTION_MANAGE_ALL_APPLICATIONS_SETTINGS;
import static android.provider.Settings.ACTION_MANAGE_APPLICATIONS_SETTINGS;
import static android.provider.Settings.ACTION_MEMORY_CARD_SETTINGS;
import static android.provider.Settings.ACTION_NETWORK_OPERATOR_SETTINGS;
import static android.provider.Settings.ACTION_NFCSHARING_SETTINGS;
import static android.provider.Settings.ACTION_NFC_PAYMENT_SETTINGS;
import static android.provider.Settings.ACTION_NFC_SETTINGS;
import static android.provider.Settings.ACTION_PRINT_SETTINGS;
import static android.provider.Settings.ACTION_PRIVACY_SETTINGS;
import static android.provider.Settings.ACTION_QUICK_LAUNCH_SETTINGS;
import static android.provider.Settings.ACTION_SEARCH_SETTINGS;
import static android.provider.Settings.ACTION_SECURITY_SETTINGS;
import static android.provider.Settings.ACTION_SETTINGS;
import static android.provider.Settings.ACTION_SHOW_REGULATORY_INFO;
import static android.provider.Settings.ACTION_SOUND_SETTINGS;
import static android.provider.Settings.ACTION_SYNC_SETTINGS;
import static android.provider.Settings.ACTION_USAGE_ACCESS_SETTINGS;
import static android.provider.Settings.ACTION_USER_DICTIONARY_SETTINGS;
import static android.provider.Settings.ACTION_VOICE_INPUT_SETTINGS;
import static android.provider.Settings.ACTION_WIFI_IP_SETTINGS;
import static android.provider.Settings.ACTION_WIFI_SETTINGS;
import static android.provider.Settings.ACTION_WIRELESS_SETTINGS;

public enum AndroidSettings {
    Accessibility("accessibility", ACTION_ACCESSIBILITY_SETTINGS),
    Account("account", ACTION_ADD_ACCOUNT),
    AirplaneMode("airplane_mode", ACTION_AIRPLANE_MODE_SETTINGS),
    Apn("apn", ACTION_APN_SETTINGS),
    ApplicationDetails("application_details", ACTION_APPLICATION_DETAILS_SETTINGS),
    ApplicationDevelopment("application_development", ACTION_APPLICATION_DEVELOPMENT_SETTINGS),
    Application("application", ACTION_APPLICATION_SETTINGS),
    AppNotification("app_notification", ACTION_APP_NOTIFICATION_SETTINGS),
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
    Usage("usage", ACTION_USAGE_ACCESS_SETTINGS),
    UserDictionary("user_dictionary", ACTION_USER_DICTIONARY_SETTINGS),
    VoiceInput("voice_input", ACTION_VOICE_INPUT_SETTINGS),
    Wifi("wifi", ACTION_WIFI_SETTINGS),
    WifiIp("wifi_ip", ACTION_WIFI_IP_SETTINGS),
    Wireless("wireless", ACTION_WIRELESS_SETTINGS);

    private final String value;
    private final String setting;

    AndroidSettings(String value, String setting) {
        this.value = value;
        this.setting = setting;
    }

    public static String getAction(String value) {
        for (AndroidSettings setting : AndroidSettings.values()) {
            if (setting.value.equals(value)) {
                return setting.setting;
            }
        }
        return null;
    }
}
