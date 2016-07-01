package com.grootstock.helloworld.interceptors;

import io.grpc.CallOptions;
import io.grpc.Channel;
import io.grpc.ClientCall;
import io.grpc.ClientInterceptor;
import io.grpc.ForwardingClientCall.SimpleForwardingClientCall;
import io.grpc.Metadata;
import io.grpc.Metadata.AsciiMarshaller;
import io.grpc.MethodDescriptor;

import static io.grpc.Metadata.Key.of;

public class MathClientAuthInterceptorBuilder {

  private static final String AUTH_KEY = "authorization";
  private static final AsciiMarshaller<String> AUTH_KEY_MARSHLER = new AsciiMarshaller<String>() {
    @Override
    public String toAsciiString(String s) {
      return s;
    }

    @Override
    public String parseAsciiString(String s) {
      return s;
    }
  };
  private static final Metadata.Key<String> AUTH_META_KEY = of(AUTH_KEY, AUTH_KEY_MARSHLER);

  /**
   * Create a new {@link ClientInterceptor} for authentication.
   *
   * @param apiKey ApiKey for authentication
   * @return {@link ClientInterceptor} implementation
   */
  public static ClientInterceptor buildAuthInterceptor(String apiKey) {
    return new ClientInterceptor() {
      @Override
      public <ReqT, RespT> ClientCall<ReqT, RespT> interceptCall(
              MethodDescriptor<ReqT, RespT> method,
              CallOptions callOptions,
              Channel next) {
        return new SimpleForwardingClientCall<ReqT, RespT>(next.newCall(method, callOptions)) {
          @Override
          public void start(Listener<RespT> responseListener, Metadata headers) {
            if (headers.containsKey(AUTH_META_KEY)) {
              headers.remove(AUTH_META_KEY, headers.get(AUTH_META_KEY));
            }
            headers.put(AUTH_META_KEY, apiKey);
            super.start(responseListener, headers);
          }
        };
      }
    };
  }
}
