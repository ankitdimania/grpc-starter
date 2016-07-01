package com.grootstock;

import lombok.Getter;
import lombok.Setter;

import java.security.SecureRandom;
import java.util.Base64;

public class ContextHolder {
  private static ThreadLocal<ContextHolder> storage = new ThreadLocal<>();

  @Getter private String requestId = generateGuid();
  @Getter private long threadId = Thread.currentThread().getId();
  @Getter @Setter private String account;

  static SecureRandom numberGenerator = new SecureRandom();

  public static ContextHolder get() {
    return storage.get();
  }

  private static String generateGuid() {
    // byte[15] should generate guid of length 20
    // byte[16] will generate guid of length 22, which is then appended with '=='
    byte[] randomBytes = new byte[15];
    numberGenerator.nextBytes(randomBytes);

    String guid = Base64.getUrlEncoder().encodeToString(randomBytes);
    return guid.replaceAll("=", "");
  }

  /**
   * Initialize a new ContextHolder.
   *
   * @return new ContextHolder
   */
  public static ContextHolder init() {
    ContextHolder contextHolder = new ContextHolder();
    storage.set(contextHolder);
    return contextHolder;
  }

  private ContextHolder() {
  }
}
