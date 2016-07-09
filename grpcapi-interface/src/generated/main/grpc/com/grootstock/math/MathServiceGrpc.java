package com.grootstock.math;

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
 * The greeting service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 0.15.0)",
    comments = "Source: math.proto")
public class MathServiceGrpc {

  private MathServiceGrpc() {}

  public static final String SERVICE_NAME = "math.MathService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.grootstock.math.AddRequest,
      com.grootstock.math.AddResponse> METHOD_ADD =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "math.MathService", "Add"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.grootstock.math.AddRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.grootstock.math.AddResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.grootstock.math.MultiplyRequest,
      com.grootstock.math.MultiplyResponse> METHOD_MULTIPLY =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "math.MathService", "multiply"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.grootstock.math.MultiplyRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.grootstock.math.MultiplyResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.grootstock.math.DivideRequest,
      com.grootstock.math.DivideResponse> METHOD_DIVIDE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "math.MathService", "divide"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.grootstock.math.DivideRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.grootstock.math.DivideResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MathServiceStub newStub(io.grpc.Channel channel) {
    return new MathServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MathServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new MathServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static MathServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new MathServiceFutureStub(channel);
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  @java.lang.Deprecated public static interface MathService {

    /**
     * <pre>
     * Adds the numbers
     * </pre>
     */
    public void add(com.grootstock.math.AddRequest request,
        io.grpc.stub.StreamObserver<com.grootstock.math.AddResponse> responseObserver);

    /**
     * <pre>
     * Multiplies the numbers
     * </pre>
     */
    public void multiply(com.grootstock.math.MultiplyRequest request,
        io.grpc.stub.StreamObserver<com.grootstock.math.MultiplyResponse> responseObserver);

    /**
     * <pre>
     * Divides the numbers
     * </pre>
     */
    public void divide(com.grootstock.math.DivideRequest request,
        io.grpc.stub.StreamObserver<com.grootstock.math.DivideResponse> responseObserver);
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1469")
  public static abstract class MathServiceImplBase implements MathService, io.grpc.BindableService {

    @java.lang.Override
    public void add(com.grootstock.math.AddRequest request,
        io.grpc.stub.StreamObserver<com.grootstock.math.AddResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_ADD, responseObserver);
    }

    @java.lang.Override
    public void multiply(com.grootstock.math.MultiplyRequest request,
        io.grpc.stub.StreamObserver<com.grootstock.math.MultiplyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_MULTIPLY, responseObserver);
    }

    @java.lang.Override
    public void divide(com.grootstock.math.DivideRequest request,
        io.grpc.stub.StreamObserver<com.grootstock.math.DivideResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DIVIDE, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return MathServiceGrpc.bindService(this);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  @java.lang.Deprecated public static interface MathServiceBlockingClient {

    /**
     * <pre>
     * Adds the numbers
     * </pre>
     */
    public com.grootstock.math.AddResponse add(com.grootstock.math.AddRequest request);

    /**
     * <pre>
     * Multiplies the numbers
     * </pre>
     */
    public com.grootstock.math.MultiplyResponse multiply(com.grootstock.math.MultiplyRequest request);

    /**
     * <pre>
     * Divides the numbers
     * </pre>
     */
    public com.grootstock.math.DivideResponse divide(com.grootstock.math.DivideRequest request);
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  @java.lang.Deprecated public static interface MathServiceFutureClient {

    /**
     * <pre>
     * Adds the numbers
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grootstock.math.AddResponse> add(
        com.grootstock.math.AddRequest request);

    /**
     * <pre>
     * Multiplies the numbers
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grootstock.math.MultiplyResponse> multiply(
        com.grootstock.math.MultiplyRequest request);

    /**
     * <pre>
     * Divides the numbers
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grootstock.math.DivideResponse> divide(
        com.grootstock.math.DivideRequest request);
  }

  public static class MathServiceStub extends io.grpc.stub.AbstractStub<MathServiceStub>
      implements MathService {
    private MathServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MathServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MathServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MathServiceStub(channel, callOptions);
    }

    @java.lang.Override
    public void add(com.grootstock.math.AddRequest request,
        io.grpc.stub.StreamObserver<com.grootstock.math.AddResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ADD, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void multiply(com.grootstock.math.MultiplyRequest request,
        io.grpc.stub.StreamObserver<com.grootstock.math.MultiplyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_MULTIPLY, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void divide(com.grootstock.math.DivideRequest request,
        io.grpc.stub.StreamObserver<com.grootstock.math.DivideResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DIVIDE, getCallOptions()), request, responseObserver);
    }
  }

  public static class MathServiceBlockingStub extends io.grpc.stub.AbstractStub<MathServiceBlockingStub>
      implements MathServiceBlockingClient {
    private MathServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MathServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MathServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MathServiceBlockingStub(channel, callOptions);
    }

    @java.lang.Override
    public com.grootstock.math.AddResponse add(com.grootstock.math.AddRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ADD, getCallOptions(), request);
    }

    @java.lang.Override
    public com.grootstock.math.MultiplyResponse multiply(com.grootstock.math.MultiplyRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_MULTIPLY, getCallOptions(), request);
    }

    @java.lang.Override
    public com.grootstock.math.DivideResponse divide(com.grootstock.math.DivideRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DIVIDE, getCallOptions(), request);
    }
  }

  public static class MathServiceFutureStub extends io.grpc.stub.AbstractStub<MathServiceFutureStub>
      implements MathServiceFutureClient {
    private MathServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MathServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MathServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MathServiceFutureStub(channel, callOptions);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<com.grootstock.math.AddResponse> add(
        com.grootstock.math.AddRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ADD, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<com.grootstock.math.MultiplyResponse> multiply(
        com.grootstock.math.MultiplyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_MULTIPLY, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<com.grootstock.math.DivideResponse> divide(
        com.grootstock.math.DivideRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DIVIDE, getCallOptions()), request);
    }
  }

  @java.lang.Deprecated public static abstract class AbstractMathService extends MathServiceImplBase {}

  private static final int METHODID_ADD = 0;
  private static final int METHODID_MULTIPLY = 1;
  private static final int METHODID_DIVIDE = 2;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MathService serviceImpl;
    private final int methodId;

    public MethodHandlers(MathService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD:
          serviceImpl.add((com.grootstock.math.AddRequest) request,
              (io.grpc.stub.StreamObserver<com.grootstock.math.AddResponse>) responseObserver);
          break;
        case METHODID_MULTIPLY:
          serviceImpl.multiply((com.grootstock.math.MultiplyRequest) request,
              (io.grpc.stub.StreamObserver<com.grootstock.math.MultiplyResponse>) responseObserver);
          break;
        case METHODID_DIVIDE:
          serviceImpl.divide((com.grootstock.math.DivideRequest) request,
              (io.grpc.stub.StreamObserver<com.grootstock.math.DivideResponse>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    return new io.grpc.ServiceDescriptor(SERVICE_NAME,
        METHOD_ADD,
        METHOD_MULTIPLY,
        METHOD_DIVIDE);
  }

  @java.lang.Deprecated public static io.grpc.ServerServiceDefinition bindService(
      final MathService serviceImpl) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          METHOD_ADD,
          asyncUnaryCall(
            new MethodHandlers<
              com.grootstock.math.AddRequest,
              com.grootstock.math.AddResponse>(
                serviceImpl, METHODID_ADD)))
        .addMethod(
          METHOD_MULTIPLY,
          asyncUnaryCall(
            new MethodHandlers<
              com.grootstock.math.MultiplyRequest,
              com.grootstock.math.MultiplyResponse>(
                serviceImpl, METHODID_MULTIPLY)))
        .addMethod(
          METHOD_DIVIDE,
          asyncUnaryCall(
            new MethodHandlers<
              com.grootstock.math.DivideRequest,
              com.grootstock.math.DivideResponse>(
                serviceImpl, METHODID_DIVIDE)))
        .build();
  }
}
