package com.grootstock.config;

import org.yaml.snakeyaml.Yaml;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class AppYamlConfig {
  private static final String DEFAULT_CONFIG_KEY = "default";

  private final AppEnvConfig envConfig;
  private final Map<String, Object> serviceConfigs;

  public AppYamlConfig(AppEnvConfig appEnvConfig) {
    this.envConfig = appEnvConfig;
    try {
      final Yaml yaml = new Yaml();

      Map<String, Map<String, Object>> serviceConfigs = new HashMap<>();
      AppConfigFiles.getResources().forEach(configFileIs -> {
        Map<String, Map<String, Object>> configs = yaml.loadAs(configFileIs, Map.class);
        add(serviceConfigs, configs);
      });

      this.serviceConfigs = serviceConfigs.get(DEFAULT_CONFIG_KEY);
      if (serviceConfigs.containsKey(getEnvironment())) {
        this.serviceConfigs.putAll(serviceConfigs.get(getEnvironment()));
      }
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  private String getEnvironment() {
    return envConfig.getEnvironment();
  }

  private void add(Map<String, Map<String, Object>> serviceConfigs, Map<String, Map<String, Object>> configs) {
    configs.forEach((envKey, config) -> {
      Map<String, Object> serviceConfig = serviceConfigs.get(envKey);
      if (serviceConfig == null) {
        serviceConfigs.put(envKey, config);
      } else {
        merge(envKey, serviceConfig, config);
      }
    });
  }

  private void merge(String env, Map<String, Object> store, Map<String, Object> configs) {
    if (configs == null) {
      return;
    }
    configs.forEach((configKey, config) -> {
      if (store.containsKey(configKey)) {
        throw new IllegalStateException("Config with configKey:" + configKey
                + " is already defined in env:" + env);
      }
      store.put(configKey, config);
    });
  }

  public Map<String, Object> getServiceConfigs() {
    return serviceConfigs;
  }
}
