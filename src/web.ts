import { WebPlugin } from '@capacitor/core';

import type { NativeSettingsPlugin } from './definitions';

/**
 * Web implementation of the NativeSettings plugin.
 *
 * @remarks
 * This plugin is not supported on the web platform.
 */
export class NativeSettingsWeb extends WebPlugin implements NativeSettingsPlugin {
  async open(): Promise<{ status: boolean }> {
    return new Promise<any>((_resolve, reject) => {
      reject(new Error('Not implemented for web.'));
    });
  }

  async openAndroid(): Promise<{ status: boolean }> {
    return new Promise<any>((_resolve, reject) => {
      reject(new Error('Not implemented for web.'));
    });
  }

  async openIOS(): Promise<{ status: boolean }> {
    return new Promise<any>((_resolve, reject) => {
      reject(new Error('Not implemented for web.'));
    });
  }
}
