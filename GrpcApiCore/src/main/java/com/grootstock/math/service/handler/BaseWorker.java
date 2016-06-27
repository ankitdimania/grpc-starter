package com.grootstock.math.service.handler;

import lombok.Getter;

public class BaseWorker {
  @Getter
  String requestId;

  public BaseWorker(String requestId) {
    this.requestId = requestId;
  }
}
