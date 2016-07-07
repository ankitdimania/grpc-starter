package com.grootstock.helloworld.interceptors;

import io.grpc.CallOptions;
import io.grpc.Channel;
import io.grpc.ClientCall;
import io.grpc.ClientInterceptor;
import io.grpc.ForwardingClientCall.SimpleForwardingClientCall;
import io.grpc.Metadata;
import io.grpc.MethodDescriptor;

public class ClientCompressorInterceptor implements ClientInterceptor {
  @Override
  public <ReqT, RespT> ClientCall<ReqT, RespT> interceptCall(
          MethodDescriptor<ReqT, RespT> method, CallOptions callOptions, Channel next) {
    callOptions = callOptions.withCompression("gzip");
    ClientCall<ReqT, RespT> call = next.newCall(method, callOptions);

    return new SimpleForwardingClientCall<ReqT, RespT>(call) {
      @Override
      public void start(io.grpc.ClientCall.Listener<RespT> responseListener, Metadata headers) {
        super.start(responseListener, headers);
        setMessageCompression(true);
      }
    };
  }
}
