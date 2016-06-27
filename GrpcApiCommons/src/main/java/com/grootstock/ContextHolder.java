package com.grootstock;

import java.util.UUID;

public class ContextHolder {
  private static ThreadLocal<ContextHolder> storage = new ThreadLocal<>();
  private String requestId;
  private long threadId;

  public static ContextHolder get() {
    return storage.get();
  }

  /**
   * Initialize a new ContextHolder.
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
    requestId = UUID.randomUUID().toString();
    threadId = Thread.currentThread().getId();
  }

  public String getRequestId() {
    return requestId;
  }

  public long getThreadId() {
    return threadId;
  }
}
