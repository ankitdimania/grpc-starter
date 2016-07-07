package com.grootstock.interceptors;

import com.grootstock.ContextHolder;
import io.grpc.Metadata;
import io.grpc.ServerCall;
import io.grpc.ServerCallHandler;
import io.grpc.ServerInterceptor;

public class ContextHolderInterceptor implements ServerInterceptor {

  @Override
  public <ReqT, RespT> ServerCall.Listener<ReqT> interceptCall(
          ServerCall<ReqT, RespT> call,
          Metadata headers,
          ServerCallHandler<ReqT, RespT> next) {
    ContextHolder contextHolder = ContextHolder.init();
    //TODO: Metric Setup

    return next.startCall(call, headers);
  }
}
