package com.grootstock.config;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

import static org.apache.commons.lang3.StringUtils.isBlank;

public class AppEnvConfig {

  private String environment;
  private Map<String, String> envConfigs;
  private Map<String, String> envProperties = new HashMap<>();

  /**
   * Construct Config based on Env.
   */
  public AppEnvConfig() {
    environment = System.getenv("ENV");

    if (isBlank(environment)) {
      environment = "devo";
    }

    System.getProperties().forEach((key, value) -> {
      envProperties.put(key.toString(), value.toString());
    });
    envConfigs = System.getenv();
  }

  public String getEnvironment() {
    return environment;
  }

  public boolean isProduction() {
    return StringUtils.equalsIgnoreCase("prod", environment);
  }

  public Map<String, String> getEnvConfigs() {
    return envConfigs;
  }

  public Map<String, String> getEnvProperties() {
    return envProperties;
  }
}
