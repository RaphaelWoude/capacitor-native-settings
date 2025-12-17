import { registerPlugin } from '@capacitor/core';

import type { NativeSettingsPlugin } from './definitions';

/**
 * NativeSettings Capacitor plugin instance.
 */
const NativeSettings = registerPlugin<NativeSettingsPlugin>('NativeSettings', {
  web: () => import('./web').then((m) => new m.NativeSettingsWeb()),
});

export * from './definitions';
export { NativeSettings };
