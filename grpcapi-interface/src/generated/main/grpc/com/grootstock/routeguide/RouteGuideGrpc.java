package com.grootstock.routeguide;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 * <pre>
 * Interface exported by the server.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 0.15.0)",
    comments = "Source: route_guide.proto")
public class RouteGuideGrpc {

  private RouteGuideGrpc() {}

  public static final String SERVICE_NAME = "routeguide.RouteGuide";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.grootstock.routeguide.Point,
      com.grootstock.routeguide.Feature> METHOD_GET_FEATURE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "routeguide.RouteGuide", "GetFeature"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.grootstock.routeguide.Point.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.grootstock.routeguide.Feature.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.grootstock.routeguide.Rectangle,
      com.grootstock.routeguide.Feature> METHOD_LIST_FEATURES =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING,
          generateFullMethodName(
              "routeguide.RouteGuide", "ListFeatures"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.grootstock.routeguide.Rectangle.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.grootstock.routeguide.Feature.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.grootstock.routeguide.Point,
      com.grootstock.routeguide.RouteSummary> METHOD_RECORD_ROUTE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING,
          generateFullMethodName(
              "routeguide.RouteGuide", "RecordRoute"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.grootstock.routeguide.Point.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.grootstock.routeguide.RouteSummary.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.grootstock.routeguide.RouteNote,
      com.grootstock.routeguide.RouteNote> METHOD_ROUTE_CHAT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING,
          generateFullMethodName(
              "routeguide.RouteGuide", "RouteChat"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.grootstock.routeguide.RouteNote.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.grootstock.routeguide.RouteNote.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RouteGuideStub newStub(io.grpc.Channel channel) {
    return new RouteGuideStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RouteGuideBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new RouteGuideBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static RouteGuideFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new RouteGuideFutureStub(channel);
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  @java.lang.Deprecated public static interface RouteGuide {

    /**
     * <pre>
     * A simple RPC.
     * Obtains the feature at a given position.
     * A feature with an empty name is returned if there's no feature at the given
     * position.
     * </pre>
     */
    public void getFeature(com.grootstock.routeguide.Point request,
        io.grpc.stub.StreamObserver<com.grootstock.routeguide.Feature> responseObserver);

    /**
     * <pre>
     * A server-to-client streaming RPC.
     * Obtains the Features available within the given Rectangle.  Results are
     * streamed rather than returned at once (e.g. in a response message with a
     * repeated field), as the rectangle may cover a large area and contain a
     * huge number of features.
     * </pre>
     */
    public void listFeatures(com.grootstock.routeguide.Rectangle request,
        io.grpc.stub.StreamObserver<com.grootstock.routeguide.Feature> responseObserver);

    /**
     * <pre>
     * A client-to-server streaming RPC.
     * Accepts a stream of Points on a route being traversed, returning a
     * RouteSummary when traversal is completed.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.grootstock.routeguide.Point> recordRoute(
        io.grpc.stub.StreamObserver<com.grootstock.routeguide.RouteSummary> responseObserver);

    /**
     * <pre>
     * A Bidirectional streaming RPC.
     * Accepts a stream of RouteNotes sent while a route is being traversed,
     * while receiving other RouteNotes (e.g. from other users).
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.grootstock.routeguide.RouteNote> routeChat(
        io.grpc.stub.StreamObserver<com.grootstock.routeguide.RouteNote> responseObserver);
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1469")
  public static abstract class RouteGuideImplBase implements RouteGuide, io.grpc.BindableService {

    @java.lang.Override
    public void getFeature(com.grootstock.routeguide.Point request,
        io.grpc.stub.StreamObserver<com.grootstock.routeguide.Feature> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_FEATURE, responseObserver);
    }

    @java.lang.Override
    public void listFeatures(com.grootstock.routeguide.Rectangle request,
        io.grpc.stub.StreamObserver<com.grootstock.routeguide.Feature> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_FEATURES, responseObserver);
    }

    @java.lang.Override
    public io.grpc.stub.StreamObserver<com.grootstock.routeguide.Point> recordRoute(
        io.grpc.stub.StreamObserver<com.grootstock.routeguide.RouteSummary> responseObserver) {
      return asyncUnimplementedStreamingCall(METHOD_RECORD_ROUTE, responseObserver);
    }

    @java.lang.Override
    public io.grpc.stub.StreamObserver<com.grootstock.routeguide.RouteNote> routeChat(
        io.grpc.stub.StreamObserver<com.grootstock.routeguide.RouteNote> responseObserver) {
      return asyncUnimplementedStreamingCall(METHOD_ROUTE_CHAT, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return RouteGuideGrpc.bindService(this);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  @java.lang.Deprecated public static interface RouteGuideBlockingClient {

    /**
     * <pre>
     * A simple RPC.
     * Obtains the feature at a given position.
     * A feature with an empty name is returned if there's no feature at the given
     * position.
     * </pre>
     */
    public com.grootstock.routeguide.Feature getFeature(com.grootstock.routeguide.Point request);

    /**
     * <pre>
     * A server-to-client streaming RPC.
     * Obtains the Features available within the given Rectangle.  Results are
     * streamed rather than returned at once (e.g. in a response message with a
     * repeated field), as the rectangle may cover a large area and contain a
     * huge number of features.
     * </pre>
     */
    public java.util.Iterator<com.grootstock.routeguide.Feature> listFeatures(
        com.grootstock.routeguide.Rectangle request);
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  @java.lang.Deprecated public static interface RouteGuideFutureClient {

    /**
     * <pre>
     * A simple RPC.
     * Obtains the feature at a given position.
     * A feature with an empty name is returned if there's no feature at the given
     * position.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grootstock.routeguide.Feature> getFeature(
        com.grootstock.routeguide.Point request);
  }

  public static class RouteGuideStub extends io.grpc.stub.AbstractStub<RouteGuideStub>
      implements RouteGuide {
    private RouteGuideStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RouteGuideStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RouteGuideStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RouteGuideStub(channel, callOptions);
    }

    @java.lang.Override
    public void getFeature(com.grootstock.routeguide.Point request,
        io.grpc.stub.StreamObserver<com.grootstock.routeguide.Feature> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_FEATURE, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void listFeatures(com.grootstock.routeguide.Rectangle request,
        io.grpc.stub.StreamObserver<com.grootstock.routeguide.Feature> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_LIST_FEATURES, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public io.grpc.stub.StreamObserver<com.grootstock.routeguide.Point> recordRoute(
        io.grpc.stub.StreamObserver<com.grootstock.routeguide.RouteSummary> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(METHOD_RECORD_ROUTE, getCallOptions()), responseObserver);
    }

    @java.lang.Override
    public io.grpc.stub.StreamObserver<com.grootstock.routeguide.RouteNote> routeChat(
        io.grpc.stub.StreamObserver<com.grootstock.routeguide.RouteNote> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(METHOD_ROUTE_CHAT, getCallOptions()), responseObserver);
    }
  }

  public static class RouteGuideBlockingStub extends io.grpc.stub.AbstractStub<RouteGuideBlockingStub>
      implements RouteGuideBlockingClient {
    private RouteGuideBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RouteGuideBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RouteGuideBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RouteGuideBlockingStub(channel, callOptions);
    }

    @java.lang.Override
    public com.grootstock.routeguide.Feature getFeature(com.grootstock.routeguide.Point request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_FEATURE, getCallOptions(), request);
    }

    @java.lang.Override
    public java.util.Iterator<com.grootstock.routeguide.Feature> listFeatures(
        com.grootstock.routeguide.Rectangle request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_LIST_FEATURES, getCallOptions(), request);
    }
  }

  public static class RouteGuideFutureStub extends io.grpc.stub.AbstractStub<RouteGuideFutureStub>
      implements RouteGuideFutureClient {
    private RouteGuideFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RouteGuideFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RouteGuideFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RouteGuideFutureStub(channel, callOptions);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<com.grootstock.routeguide.Feature> getFeature(
        com.grootstock.routeguide.Point request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_FEATURE, getCallOptions()), request);
    }
  }

  @java.lang.Deprecated public static abstract class AbstractRouteGuide extends RouteGuideImplBase {}

  private static final int METHODID_GET_FEATURE = 0;
  private static final int METHODID_LIST_FEATURES = 1;
  private static final int METHODID_RECORD_ROUTE = 2;
  private static final int METHODID_ROUTE_CHAT = 3;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RouteGuide serviceImpl;
    private final int methodId;

    public MethodHandlers(RouteGuide serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_FEATURE:
          serviceImpl.getFeature((com.grootstock.routeguide.Point) request,
              (io.grpc.stub.StreamObserver<com.grootstock.routeguide.Feature>) responseObserver);
          break;
        case METHODID_LIST_FEATURES:
          serviceImpl.listFeatures((com.grootstock.routeguide.Rectangle) request,
              (io.grpc.stub.StreamObserver<com.grootstock.routeguide.Feature>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_RECORD_ROUTE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.recordRoute(
              (io.grpc.stub.StreamObserver<com.grootstock.routeguide.RouteSummary>) responseObserver);
        case METHODID_ROUTE_CHAT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.routeChat(
              (io.grpc.stub.StreamObserver<com.grootstock.routeguide.RouteNote>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    return new io.grpc.ServiceDescriptor(SERVICE_NAME,
        METHOD_GET_FEATURE,
        METHOD_LIST_FEATURES,
        METHOD_RECORD_ROUTE,
        METHOD_ROUTE_CHAT);
  }

  @java.lang.Deprecated public static io.grpc.ServerServiceDefinition bindService(
      final RouteGuide serviceImpl) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          METHOD_GET_FEATURE,
          asyncUnaryCall(
            new MethodHandlers<
              com.grootstock.routeguide.Point,
              com.grootstock.routeguide.Feature>(
                serviceImpl, METHODID_GET_FEATURE)))
        .addMethod(
          METHOD_LIST_FEATURES,
          asyncServerStreamingCall(
            new MethodHandlers<
              com.grootstock.routeguide.Rectangle,
              com.grootstock.routeguide.Feature>(
                serviceImpl, METHODID_LIST_FEATURES)))
        .addMethod(
          METHOD_RECORD_ROUTE,
          asyncClientStreamingCall(
            new MethodHandlers<
              com.grootstock.routeguide.Point,
              com.grootstock.routeguide.RouteSummary>(
                serviceImpl, METHODID_RECORD_ROUTE)))
        .addMethod(
          METHOD_ROUTE_CHAT,
          asyncBidiStreamingCall(
            new MethodHandlers<
              com.grootstock.routeguide.RouteNote,
              com.grootstock.routeguide.RouteNote>(
                serviceImpl, METHODID_ROUTE_CHAT)))
        .build();
  }
}
