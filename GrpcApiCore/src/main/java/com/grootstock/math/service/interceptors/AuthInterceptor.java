package com.grootstock.math.service.interceptors;

import com.grootstock.ContextHolder;
import io.grpc.Metadata;
import io.grpc.Metadata.Key;
import io.grpc.ServerCall;
import io.grpc.ServerCallHandler;
import io.grpc.ServerInterceptor;
import io.grpc.Status;
import lombok.extern.slf4j.Slf4j;

import java.util.Optional;

import static io.grpc.Metadata.ASCII_STRING_MARSHALLER;
import static io.grpc.Metadata.Key.of;

@Slf4j
public class AuthInterceptor implements ServerInterceptor {

  private static final String AUTH_KEY = "authorization";
  private static final Key<String> AUTH_META_KEY = of(AUTH_KEY, ASCII_STRING_MARSHALLER);
  private static final ServerCall.Listener<?> EMPTY_LISTENER = new EmptyServerCallListener<>();

  @SuppressWarnings("unchecked")
  @Override
  public <ReqT, RespT> ServerCall.Listener<ReqT> interceptCall(
          ServerCall<ReqT, RespT> call,
          Metadata headers,
          ServerCallHandler<ReqT, RespT> next) {
    log.info("Authenticating");
    Optional<String> apiKeyOpt = getApiKey(headers);

    if (apiKeyOpt.isPresent()) {
      String apiKey = apiKeyOpt.get();
      if (apiKey.equals("abcde")) { // insert isAuthenticated logic
        ContextHolder contextHolder = ContextHolder.get();
        contextHolder.setAccount("random account" /*insert account*/);
        return next.startCall(call, headers);
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
