import { WebPlugin } from '@capacitor/core';
import type { NativeSettingsPlugin, NativeSettingsResult } from './definitions';

/**
 * Web implementation of the NativeSettings plugin.
 *
 * @remarks
 * This plugin is not supported on the web platform.
 */
export class NativeSettingsWeb
  extends WebPlugin
  implements NativeSettingsPlugin
{
  async open(): Promise<NativeSettingsResult> {
    return {
      success: false,
      error: 'NativeSettings is not supported on the web platform.',
    };
  }

  async openAndroid(): Promise<NativeSettingsResult> {
    return {
      success: false,
      error: 'NativeSettings is not supported on the web platform.',
    };
  }

  async openIOS(): Promise<NativeSettingsResult> {
    return {
      success: false,
      error: 'NativeSettings is not supported on the web platform.',
    };
  }
}
