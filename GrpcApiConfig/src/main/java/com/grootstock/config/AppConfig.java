package com.grootstock.config;

import java.util.Map;

public class AppConfig {
  private static final AppEnvConfig ENV_CONFIG_INSTANCE = new AppEnvConfig();
  private static final AppYamlConfig YAML_CONFIG_INSTANCE = new AppYamlConfig(ENV_CONFIG_INSTANCE);
  private static final Map<String, Object> CONFIGS;

  static {
    CONFIGS = YAML_CONFIG_INSTANCE.getServiceConfigs();
    CONFIGS.putAll(ENV_CONFIG_INSTANCE.getEnvConfigs());
    CONFIGS.putAll(ENV_CONFIG_INSTANCE.getEnvProperties());
  }

  private AppConfig() {
  }

  /**
   * Get Environment.
   *
   * @return Environment
   */
  public static String getEnvironment() {
    return ENV_CONFIG_INSTANCE.getEnvironment();
  }

  public static boolean isProduction() {
    return ENV_CONFIG_INSTANCE.isProduction();
  }

  public static String getConfig(String key) {
    return (String) CONFIGS.get(key);
  }

}
