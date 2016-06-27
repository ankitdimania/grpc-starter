package com.grootstock;

import lombok.Data;

import java.util.UUID;

@Data
public class ContextHolder {
  private static ThreadLocal<ContextHolder> storage = new ThreadLocal<>();

  private String requestId = UUID.randomUUID().toString();
  private long threadId = Thread.currentThread().getId();

  public static ContextHolder get() {
    return storage.get();
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
