import { WebPlugin } from '@capacitor/core';

import type { NativeSettingsPlugin } from './definitions';

export class NativeSettingsWeb extends WebPlugin implements NativeSettingsPlugin {
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }
}
