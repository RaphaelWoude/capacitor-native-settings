import { registerPlugin } from '@capacitor/core';

import type { NativeSettingsPlugin } from './definitions';

const NativeSettings = registerPlugin<NativeSettingsPlugin>('NativeSettings', {
  web: () => import('./web').then(m => new m.NativeSettingsWeb()),
});

export * from './definitions';
export { NativeSettings };
