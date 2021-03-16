# capacitor-native-settings

Capacitor plugin to open native settings screens for android and iOS

## Install

```bash
npm install capacitor-native-settings
npx cap sync
```

## API

<docgen-index>

* [`openAndroid(...)`](#openandroid)
* [`openIOS(...)`](#openios)
* [Interfaces](#interfaces)
* [Enums](#enums)

</docgen-index>

<docgen-api>
<!--Update the source file JSDoc comments and rerun docgen to update the docs below-->

### openAndroid(...)

```typescript
openAndroid(option: AndroidOptions) => any
```

Opens the specified option in android.

| Param        | Type                                                      | Description                                  |
| ------------ | --------------------------------------------------------- | -------------------------------------------- |
| **`option`** | <code><a href="#androidoptions">AndroidOptions</a></code> | <a href="#androidoptions">AndroidOptions</a> |

**Returns:** <code>any</code>

--------------------


### openIOS(...)

```typescript
openIOS(option: IOSOptions) => any
```

Opens the specified option in android.

| Param        | Type                                              | Description                          |
| ------------ | ------------------------------------------------- | ------------------------------------ |
| **`option`** | <code><a href="#iosoptions">IOSOptions</a></code> | <a href="#iosoptions">IOSOptions</a> |

**Returns:** <code>any</code>

--------------------


### Interfaces


#### AndroidOptions

| Prop         | Type                                                        |
| ------------ | ----------------------------------------------------------- |
| **`option`** | <code><a href="#androidsettings">AndroidSettings</a></code> |


#### IOSOptions

| Prop         | Type                                                |
| ------------ | --------------------------------------------------- |
| **`option`** | <code><a href="#iossettings">IOSSettings</a></code> |


### Enums


#### AndroidSettings

| Members                      | Value                                  | Description                                                                                            |
| ---------------------------- | -------------------------------------- | ------------------------------------------------------------------------------------------------------ |
| **`Accessibility`**          | <code>'accessibility'</code>           | Show settings for accessibility modules                                                                |
| **`Account`**                | <code>'account'</code>                 | Show add account screen for creating a new account                                                     |
| **`AirplaneMode`**           | <code>'airplane_mode'</code>           | Show settings to allow entering/exiting airplane mode                                                  |
| **`Apn`**                    | <code>'apn'</code>                     | Show settings to allow configuration of APNs                                                           |
| **`ApplicationDetails`**     | <code>'application_details'</code>     | Show screen of details about a particular application                                                  |
| **`ApplicationDevelopment`** | <code>'application_development'</code> | Show settings to allow configuration of application development-related settings                       |
| **`Application`**            | <code>'application'</code>             | Show settings to allow configuration of application-related settings                                   |
| **`BatteryOptimization`**    | <code>'battery_optimization'</code>    | Show screen for controlling which apps can ignore battery optimizations                                |
| **`Bluetooth`**              | <code>'bluetooth'</code>               | Show settings to allow configuration of Bluetooth                                                      |
| **`Captioning`**             | <code>'captioning'</code>              | Show settings for video captioning                                                                     |
| **`Cast`**                   | <code>'cast'</code>                    | Show settings to allow configuration of cast endpoints                                                 |
| **`DataRoaming`**            | <code>'data_roaming'</code>            | Show settings for selection of 2G/3G/4G                                                                |
| **`Date`**                   | <code>'date'</code>                    | Show settings to allow configuration of date and time                                                  |
| **`Display`**                | <code>'display'</code>                 | Show settings to allow configuration of display                                                        |
| **`Dream`**                  | <code>'dream'</code>                   | Show Daydream settings                                                                                 |
| **`Home`**                   | <code>'home'</code>                    | Show Home selection settings                                                                           |
| **`Keyboard`**               | <code>'keyboard'</code>                | Show settings to configure input methods, in particular allowing the user to enable input methods      |
| **`KeyboardSubType`**        | <code>'keyboard_subtype'</code>        | Show settings to enable/disable input method subtypes                                                  |
| **`Locale`**                 | <code>'locale'</code>                  | Show settings to allow configuration of locale                                                         |
| **`Location`**               | <code>'location'</code>                | Show settings to allow configuration of current location sources                                       |
| **`ManageApplications`**     | <code>'manage_applications'</code>     | Show settings to manage installed applications                                                         |
| **`ManageAllApplications`**  | <code>'manage_all_applications'</code> | Show settings to manage all applications                                                               |
| **`MemoryCard`**             | <code>'memory_card'</code>             | Show settings for memory card storage                                                                  |
| **`Network`**                | <code>'network'</code>                 | Show settings for selecting the network operator                                                       |
| **`NfcSharing`**             | <code>'nfcsharing'</code>              | Show NFC Sharing settings                                                                              |
| **`NfcPayment`**             | <code>'nfc_payment'</code>             | Show NFC Tap & Pay settings                                                                            |
| **`NfcSettings`**            | <code>'nfc_settings'</code>            | Show NFC settings                                                                                      |
| **`Print`**                  | <code>'print'</code>                   | Show the top level print settings                                                                      |
| **`Privacy`**                | <code>'privacy'</code>                 | Show settings to allow configuration of privacy options                                                |
| **`QuickLaunch`**            | <code>'quick_launch'</code>            | Show settings to allow configuration of quick launch shortcuts                                         |
| **`Search`**                 | <code>'search'</code>                  | Show settings for global search                                                                        |
| **`Security`**               | <code>'security'</code>                | Show settings to allow configuration of security and location privacy                                  |
| **`Settings`**               | <code>'settings'</code>                | Show system settings                                                                                   |
| **`ShowRegulatoryInfo`**     | <code>'show_regulatory_info'</code>    | Show the regulatory information screen for the device                                                  |
| **`Sound`**                  | <code>'sound'</code>                   | Show settings to a llow configuration of sound and volume                                              |
| **`Storage`**                | <code>'storage'</code>                 | Show settings for internal storage                                                                     |
| **`Sync`**                   | <code>'sync'</code>                    | Show settings to allow configuration of sync settings                                                  |
| **`Usage`**                  | <code>'usage'</code>                   | Show settings to control access to usage information                                                   |
| **`UserDictionary`**         | <code>'user_dictionary'</code>         | Show settings to manage the user input dictionary                                                      |
| **`VoiceInput`**             | <code>'voice_input'</code>             | Show settings to configure input methods, in particular allowing the user to enable input methods      |
| **`Wifi`**                   | <code>'wifi'</code>                    | Show settings to allow configuration of Wi-Fi                                                          |
| **`WifiIp`**                 | <code>'wifi_ip'</code>                 | Show settings to allow configuration of a static IP address for Wi-Fi                                  |
| **`Wireless`**               | <code>'wireless'</code>                | Show settings to allow configuration of wireless controls such as Wi-Fi, Bluetooth and Mobile networks |


#### IOSSettings

| Members       | Value                  | Description                              |
| ------------- | ---------------------- | ---------------------------------------- |
| **`General`** | <code>'general'</code> | Opens iOS' general settings screen.      |
| **`App`**     | <code>'app'</code>     | Opens your app-specific settings screen. |

</docgen-api>
