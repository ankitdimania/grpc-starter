package com.grootstock.helloworld;

import io.grpc.stub.StreamObserver;

import javax.inject.Inject;

public class GreeterImpl extends GreeterGrpc.GreeterImplBase {

  @Inject
  public GreeterImpl() {
  }

  @Override
  public void sayHello(HelloRequest req, StreamObserver<HelloReply> responseObserver) {
    HelloReply reply = HelloReply.newBuilder().setMessage("Hello " + req.getName()).build();
    responseObserver.onNext(reply);
    responseObserver.onCompleted();
  }
}
