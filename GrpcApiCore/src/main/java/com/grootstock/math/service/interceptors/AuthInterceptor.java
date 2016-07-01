package com.grootstock.math.service.interceptors;

import com.grootstock.ContextHolder;
import io.grpc.Metadata;
import io.grpc.Metadata.AsciiMarshaller;
import io.grpc.MethodDescriptor;
import io.grpc.ServerCall;
import io.grpc.ServerCallHandler;
import io.grpc.ServerInterceptor;
import io.grpc.Status;
import lombok.extern.slf4j.Slf4j;

import java.util.Optional;

import static io.grpc.Metadata.Key.of;

@Slf4j
public class AuthInterceptor implements ServerInterceptor {

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
  private static final ServerCall.Listener<?> EMPTY_LISTENER = new EmptyServerCallListener<>();

  @SuppressWarnings("unchecked")
  @Override
  public <ReqT, RespT> ServerCall.Listener<ReqT> interceptCall(
          MethodDescriptor<ReqT, RespT> method,
          ServerCall<RespT> call,
          Metadata headers,
          ServerCallHandler<ReqT, RespT> next) {
    log.info("Authenticating");
    Optional<String> apiKeyOpt = getApiKey(headers);

    if (apiKeyOpt.isPresent()) {
      String apiKey = apiKeyOpt.get();
      if (apiKey.equals("abcde")) { // insert isAuthenticated logic
        ContextHolder contextHolder = ContextHolder.get();
        contextHolder.setAccount("random account" /*insert account*/);
        return next.startCall(method, call, headers);
      }
    }

    log.error("Authentication failed!!!");
    call.close(Status.UNAUTHENTICATED, new Metadata());
    return (ServerCall.Listener<ReqT>) EMPTY_LISTENER;
  }

  private Optional<String> getApiKey(Metadata metadata) {
    if (metadata.containsKey(AUTH_META_KEY)) {
      return Optional.of(metadata.get(AUTH_META_KEY));
    } else {
      return Optional.empty();
    }
  }

  private static class EmptyServerCallListener<ReqT> extends ServerCall.Listener<ReqT> {

  }
}
