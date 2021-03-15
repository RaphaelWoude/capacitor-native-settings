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

| Members                      | Value                                  |
| ---------------------------- | -------------------------------------- |
| **`Accessibility`**          | <code>'accessibility'</code>           |
| **`Account`**                | <code>'account'</code>                 |
| **`AirplaneMode`**           | <code>'airplane_mode'</code>           |
| **`Apn`**                    | <code>'apn'</code>                     |
| **`ApplicationDetails`**     | <code>'application_details'</code>     |
| **`ApplicationDevelopment`** | <code>'application_development'</code> |
| **`Application`**            | <code>'application'</code>             |
| **`BatteryOptimization`**    | <code>'battery_optimization'</code>    |
| **`Bluetooth`**              | <code>'bluetooth'</code>               |
| **`Captioning`**             | <code>'captioning'</code>              |
| **`Cast`**                   | <code>'cast'</code>                    |
| **`DataRoaming`**            | <code>'data_roaming'</code>            |
| **`Date`**                   | <code>'date'</code>                    |
| **`Display`**                | <code>'display'</code>                 |
| **`Dream`**                  | <code>'dream'</code>                   |
| **`Home`**                   | <code>'home'</code>                    |
| **`Keyboard`**               | <code>'keyboard'</code>                |
| **`KeyboardSubType`**        | <code>'keyboard_subtype'</code>        |
| **`Locale`**                 | <code>'locale'</code>                  |
| **`Location`**               | <code>'location'</code>                |
| **`ManageApplications`**     | <code>'manage_applications'</code>     |
| **`ManageAllApplications`**  | <code>'manage_all_applications'</code> |
| **`MemoryCard`**             | <code>'memory_card'</code>             |
| **`Network`**                | <code>'network'</code>                 |
| **`NfcSharing`**             | <code>'nfcsharing'</code>              |
| **`NfcPayment`**             | <code>'nfc_payment'</code>             |
| **`NfcSettings`**            | <code>'nfc_settings'</code>            |
| **`NotificationId`**         | <code>'notification_id'</code>         |
| **`Print`**                  | <code>'print'</code>                   |
| **`Privacy`**                | <code>'privacy'</code>                 |
| **`QuickLaunch`**            | <code>'quick_launch'</code>            |
| **`Search`**                 | <code>'search'</code>                  |
| **`Security`**               | <code>'security'</code>                |
| **`Settings`**               | <code>'settings'</code>                |
| **`ShowRegulatoryInfo`**     | <code>'show_regulatory_info'</code>    |
| **`Sound`**                  | <code>'sound'</code>                   |
| **`Storage`**                | <code>'storage'</code>                 |
| **`Store`**                  | <code>'store'</code>                   |
| **`Sync`**                   | <code>'sync'</code>                    |
| **`Usage`**                  | <code>'usage'</code>                   |
| **`UserDictionary`**         | <code>'user_dictionary'</code>         |
| **`VoiceInput`**             | <code>'voice_input'</code>             |
| **`Wifi`**                   | <code>'wifi'</code>                    |
| **`WifiIp`**                 | <code>'wifi_ip'</code>                 |
| **`Wireless`**               | <code>'wireless'</code>                |


#### IOSSettings

| Members                  | Value                              |
| ------------------------ | ---------------------------------- |
| **`About`**              | <code>'about'</code>               |
| **`Accessibility`**      | <code>'accessibility'</code>       |
| **`Account`**            | <code>'account'</code>             |
| **`AirplaneMode`**       | <code>'airplane_mode'</code>       |
| **`ApplicationDetails`** | <code>'application_details'</code> |
| **`AutoLock`**           | <code>'autolock'</code>            |
| **`Battery`**            | <code>'battery'</code>             |
| **`Bluetooth`**          | <code>'bluetooth'</code>           |
| **`Browser`**            | <code>'browser'</code>             |
| **`Castle`**             | <code>'castle'</code>              |
| **`Cellularusage`**      | <code>'cellular_usage'</code>      |
| **`ConfigurationList`**  | <code>'configuration_list'</code>  |
| **`Date`**               | <code>'date'</code>                |
| **`Display`**            | <code>'display'</code>             |
| **`DoNotDisturb`**       | <code>'do_not_disturb'</code>      |
| **`Facetime`**           | <code>'facetime'</code>            |
| **`Keyboard`**           | <code>'keyboard'</code>            |
| **`Keyboards`**          | <code>'keyboards'</code>           |
| **`Locale`**             | <code>'locale'</code>              |
| **`Location`**           | <code>'location'</code>            |
| **`Locations`**          | <code>'locations'</code>           |
| **`MobileData`**         | <code>'mobile_data'</code>         |
| **`Music`**              | <code>'music'</code>               |
| **`MusicEqualizer`**     | <code>'music_equalizer'</code>     |
| **`MusicVolume`**        | <code>'music_volume'</code>        |
| **`Network`**            | <code>'network'</code>             |
| **`NikeIpod`**           | <code>'nike_ipod'</code>           |
| **`Notes`**              | <code>'notes'</code>               |
| **`NotificationId`**     | <code>'notification_id'</code>     |
| **`Passbook`**           | <code>'passbook'</code>            |
| **`Phone`**              | <code>'phone'</code>               |
| **`Photos`**             | <code>'photos'</code>              |
| **`Privacy`**            | <code>'privacy'</code>             |
| **`Reset`**              | <code>'reset'</code>               |
| **`Ringtone`**           | <code>'ringtone'</code>            |
| **`Search`**             | <code>'search'</code>              |
| **`Settings`**           | <code>'settings'</code>            |
| **`Sound`**              | <code>'sound'</code>               |
| **`SoftwareUpdate`**     | <code>'software_update'</code>     |
| **`Storage`**            | <code>'storage'</code>             |
| **`Store`**              | <code>'store'</code>               |
| **`Tethering`**          | <code>'tethering'</code>           |
| **`Touch`**              | <code>'touch'</code>               |
| **`Twitter`**            | <code>'twitter'</code>             |
| **`Usage`**              | <code>'usage'</code>               |
| **`Video`**              | <code>'video'</code>               |
| **`VPN`**                | <code>'vpn'</code>                 |
| **`Wallpaper`**          | <code>'wallpaper'</code>           |
| **`Wifi`**               | <code>'wifi'</code>                |

</docgen-api>
