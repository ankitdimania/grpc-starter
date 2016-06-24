package com.grootstock.helloworld.service.activity;

import io.grpc.stub.StreamObserver;

public interface Activity<ReqT, ResT> {
  void perform(ReqT request, StreamObserver<ResT> responseObserver);
}
