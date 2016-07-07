package com.grootstock.interceptors;

import io.grpc.Metadata;
import io.grpc.MethodDescriptor;
import io.grpc.ServerCall;
import io.grpc.ServerCallHandler;
import io.grpc.ServerInterceptor;

public class ServerCompressorInterceptor implements ServerInterceptor {
  @Override
  public <ReqT, RespT> ServerCall.Listener<ReqT> interceptCall(
          MethodDescriptor<ReqT, RespT> method,
          ServerCall<RespT> call,
          Metadata headers,
          ServerCallHandler<ReqT, RespT> next) {
//    call.setCompression("gzip");
    call.setMessageCompression(true);
    return next.startCall(method, call, headers);
  }
}
