package com.grootstock;

import lombok.Getter;

import java.security.SecureRandom;
import java.util.Base64;

public class ContextHolder {
  private static ThreadLocal<ContextHolder> storage = new ThreadLocal<>();

  @Getter private String requestId = generateGuid();
  @Getter private long threadId = Thread.currentThread().getId();

  static SecureRandom numberGenerator = new SecureRandom();

  public static ContextHolder get() {
    return storage.get();
  }

  private static String generateGuid() {
    byte[] randomBytes = new byte[16];
    numberGenerator.nextBytes(randomBytes);

    return Base64.getUrlEncoder().encodeToString(randomBytes).replaceAll("=", "");
  }

  /**
   * Initialize a new ContextHolder.
   *
   * @return new ContextHolder
   */
  public static ContextHolder init() {
    ContextHolder previousContextHolder = get();
    if (previousContextHolder != null) {
      throw new IllegalStateException("ContextHolder already present:" + previousContextHolder);
    }
    ContextHolder contextHolder = new ContextHolder();
    storage.set(contextHolder);
    return contextHolder;
  }

  public static void remove() {
    storage.remove();
  }

  private ContextHolder() {
  }
}
