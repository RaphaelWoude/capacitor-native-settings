import { WebPlugin } from '@capacitor/core';

import type { NativeSettingsPlugin } from './definitions';

export class NativeSettingsWeb
  extends WebPlugin
  implements NativeSettingsPlugin {
  /**
   * Open iOS & Android settings.
   * Not implemented for web!
   */
  async open(): Promise<{ status: boolean }> {
    return new Promise<any>((_resolve, reject) => {
      reject(new Error('Not implemented for web.'));
    });
  }

  /**
   * Open android settings.
   * Not implemented for web!
   */
  async openAndroid(): Promise<{ status: boolean }> {
    return new Promise<any>((_resolve, reject) => {
      reject(new Error('Not implemented for web.'));
    });
  }

  /**
   * Open iOS settings.
   * Not implemented for web!
   */
  async openIOS(): Promise<{ status: boolean }> {
    return new Promise<any>((_resolve, reject) => {
      reject(new Error('Not implemented for web.'));
    });
  }
}
