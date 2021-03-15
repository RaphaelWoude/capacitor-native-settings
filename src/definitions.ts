export interface NativeSettingsPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
}
