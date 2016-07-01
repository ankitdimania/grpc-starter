package com.grootstock.math.service.handler;

import com.google.common.base.Preconditions;
import lombok.Getter;

public class BaseWorker {
  @Getter
  String requestId;

  public BaseWorker(String requestId) {
    Preconditions.checkNotNull(requestId);
    this.requestId = requestId;
  }
}
