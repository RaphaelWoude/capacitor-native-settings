export interface NativeSettingsPlugin {

    /**
     * Opens the specified option in android.
     * @param option AndroidOptions
     * @see AndroidOptions
     */
    openAndroid(option: AndroidOptions): Promise<{ status: boolean }>;

    /**
     * Opens the specified option in android.
     * @param option IOSOptions
     * @see IOSOptions
     */
    openIOS(option: IOSOptions): Promise<{ status: boolean }>;

}

export interface AndroidOptions {
    option: AndroidSettings;
}

export interface IOSOptions {
    option: IOSSettings;
}

export enum AndroidSettings {
    /**
     * Show settings for accessibility modules
     */
    Accessibility = 'accessibility',

    /**
     * Show add account screen for creating a new account
     */
    Account = 'account',

    /**
     * Show settings to allow entering/exiting airplane mode
     */
    AirplaneMode = 'airplane_mode',

    /**
     * Show settings to allow configuration of APNs
     */
    Apn = 'apn',

    /**
     * Show screen of details about a particular application
     */
    ApplicationDetails = 'application_details',
    
    /**
     * Show settings to allow configuration of application development-related settings
     */
    ApplicationDevelopment = 'application_development',

    /**
     * Show settings to allow configuration of application-related settings
     */
    Application = 'application',

    /**
     * Show screen for controlling which apps can ignore battery optimizations
     */
    BatteryOptimization = 'battery_optimization',

    /**
     * Show settings to allow configuration of Bluetooth
     */
    Bluetooth = 'bluetooth',

    /**
     * Show settings for video captioning
     */
    Captioning = 'captioning',

    /**
     * Show settings to allow configuration of cast endpoints
     */
    Cast = 'cast',

    /**
     * Show settings for selection of 2G/3G/4G
     */
    DataRoaming = 'data_roaming',

    /**
     * Show settings to allow configuration of date and time
     */
    Date = 'date',

    /**
     * Show settings to allow configuration of display
     */
    Display = 'display',

    /**
     * Show Daydream settings
     */
    Dream = 'dream',

    /**
     * Show Home selection settings
     */
    Home = 'home',

    /**
     * 	Show settings to configure input methods, in particular allowing the user to enable input methods
     */
    Keyboard = 'keyboard',

    /**
     * Show settings to enable/disable input method subtypes
     */
    KeyboardSubType = 'keyboard_subtype',

    /**
     * Show settings to allow configuration of locale
     */
    Locale = 'locale',

    /**
     * Show settings to allow configuration of current location sources
     */
    Location = 'location',

    /**
     * 	Show settings to manage installed applications
     */
    ManageApplications = 'manage_applications',

    /**
     * Show settings to manage all applications
     */
    ManageAllApplications = 'manage_all_applications',

    /**
     * Show settings for memory card storage
     */
    MemoryCard = 'memory_card',

    /**
     * Show settings for selecting the network operator
     */
    Network = 'network',

    /**
     * Show NFC Sharing settings
     */
    NfcSharing = 'nfcsharing',

    /**
     * Show NFC Tap & Pay settings
     */
    NfcPayment = 'nfc_payment',

    /**
     * Show NFC settings
     */
    NfcSettings = 'nfc_settings',

    /**
     * Show the top level print settings
     */
    Print = 'print',

    /**
     * Show settings to allow configuration of privacy options
     */
    Privacy = 'privacy',

    /**
     * Show settings to allow configuration of quick launch shortcuts
     */
    QuickLaunch = 'quick_launch',

    /**
     * Show settings for global search
     */
    Search = 'search',

    /**
     * Show settings to allow configuration of security and location privacy
     */
    Security = 'security',

    /**
     * Show system settings
     */
    Settings = 'settings',

    /**
     * Show the regulatory information screen for the device
     */
    ShowRegulatoryInfo = 'show_regulatory_info',

    /**
     * Show settings to a llow configuration of sound and volume
     */
    Sound = 'sound',

    /**
     * Show settings for internal storage
     */
    Storage = 'storage',

    /**
     * Show settings to allow configuration of sync settings
     */
    Sync = 'sync',

    /**
     * Show settings to control access to usage information
     */
    Usage = 'usage',

    /**
     * Show settings to manage the user input dictionary
     */
    UserDictionary = 'user_dictionary',

    /**
     * Show settings to configure input methods, in particular allowing the user to enable input methods
     */
    VoiceInput = 'voice_input',

    /**
     * Show settings to allow configuration of Wi-Fi
     */
    Wifi = 'wifi',

    /**
     * Show settings to allow configuration of a static IP address for Wi-Fi
     */
    WifiIp = 'wifi_ip',

    /**
     * Show settings to allow configuration of wireless controls such as Wi-Fi, Bluetooth and Mobile networks
     */
    Wireless = 'wireless'
}

export enum IOSSettings {
    /**
     * Opens iOS' general settings screen.
     */
    General = 'general',

    /**
     * Opens your app-specific settings screen.
     */
    App = 'app'
}

