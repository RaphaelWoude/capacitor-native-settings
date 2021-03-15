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
    Accessibility = 'accessibility',
    Account = 'account',
    AirplaneMode = 'airplane_mode',
    Apn = 'apn',
    ApplicationDetails = 'application_details',
    ApplicationDevelopment = 'application_development',
    Application = 'application',
    BatteryOptimization = 'battery_optimization',
    Bluetooth = 'bluetooth',
    Captioning = 'captioning',
    Cast = 'cast',
    DataRoaming = 'data_roaming',
    Date = 'date',
    Display = 'display',
    Dream = 'dream',
    Home = 'home',
    Keyboard = 'keyboard',
    KeyboardSubType = 'keyboard_subtype',
    Locale = 'locale',
    Location = 'location',
    ManageApplications = 'manage_applications',
    ManageAllApplications = 'manage_all_applications',
    MemoryCard = 'memory_card',
    Network = 'network',
    NfcSharing = 'nfcsharing',
    NfcPayment = 'nfc_payment',
    NfcSettings = 'nfc_settings',
    Print = 'print',
    Privacy = 'privacy',
    QuickLaunch = 'quick_launch',
    Search = 'search',
    Security = 'security',
    Settings = 'settings',
    ShowRegulatoryInfo = 'show_regulatory_info',
    Sound = 'sound',
    Storage = 'storage',
    Sync = 'sync',
    Usage = 'usage',
    UserDictionary = 'user_dictionary',
    VoiceInput = 'voice_input',
    Wifi = 'wifi',
    WifiIp = 'wifi_ip',
    Wireless = 'wireless'
}

export enum IOSSettings {
    About = 'about',
    Accessibility = 'accessibility',
    Account = 'account',
    AirplaneMode = 'airplane_mode',
    ApplicationDetails = 'application_details',
    AutoLock = 'autolock',
    Battery = 'battery',
    Bluetooth = 'bluetooth',
    Browser = 'browser',
    Castle = 'castle',
    Cellularusage = 'cellular_usage',
    ConfigurationList = 'configuration_list',
    Date = 'date',
    Display = 'display',
    DoNotDisturb = 'do_not_disturb',
    Facetime = 'facetime',
    Keyboard = 'keyboard',
    Keyboards = 'keyboards',
    Locale = 'locale',
    Location = 'location',
    Locations = 'locations',
    MobileData = 'mobile_data',
    Music = 'music',
    MusicEqualizer = 'music_equalizer',
    MusicVolume = 'music_volume',
    Network = 'network',
    NikeIpod = 'nike_ipod',
    Notes = 'notes',
    NotificationId = 'notification_id',
    Passbook = 'passbook',
    Phone = 'phone',
    Photos = 'photos',
    Privacy = 'privacy',
    Reset = 'reset',
    Ringtone = 'ringtone',
    Search = 'search',
    Settings = 'settings',
    Sound = 'sound',
    SoftwareUpdate = 'software_update',
    Storage = 'storage',
    Store = 'store',
    Tethering = 'tethering',
    Touch = 'touch',
    Twitter = 'twitter',
    Usage = 'usage',
    Video = 'video',
    VPN = 'vpn',
    Wallpaper = 'wallpaper',
    Wifi = 'wifi'
}

