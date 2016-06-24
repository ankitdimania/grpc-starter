package com.grootstock.helloworld.service;

import com.grootstock.helloworld.service.activity.DivideActivity;
import com.grootstock.math.AddRequest;
import com.grootstock.math.AddResponse;
import com.grootstock.math.DivideRequest;
import com.grootstock.math.DivideResponse;
import com.grootstock.math.MathServiceGrpc;
import com.grootstock.math.MultiplyRequest;
import com.grootstock.math.MultiplyResponse;
import io.grpc.stub.StreamObserver;

import javax.inject.Inject;
import javax.inject.Named;

public class MathService extends MathServiceGrpc.AbstractMathService {
  private DivideActivity divideActivity;

  @Inject
  public MathService(
          @Named("DivideActivity") DivideActivity divideActivity) {
    this.divideActivity = divideActivity;
  }

  @Override
  public void add(AddRequest request,
                  StreamObserver<AddResponse> responseObserver) {
    double a = request.getA();
    double b = request.getB();
    double sum = a + b;

    AddResponse addResponse = AddResponse.newBuilder().setSum(sum).build();
    responseObserver.onNext(addResponse);
    responseObserver.onCompleted();
  }

  @Override
  public void multiply(MultiplyRequest request,
                       StreamObserver<MultiplyResponse> responseObserver) {
    double a = request.getA();
    double b = request.getB();
    double product = a * b;

    MultiplyResponse addResponse = MultiplyResponse.newBuilder().setProduct(product).build();
    responseObserver.onNext(addResponse);
    responseObserver.onCompleted();
  }

  @Override
  public void divide(DivideRequest request,
                     StreamObserver<DivideResponse> responseObserver) {
    divideActivity.perform(request, responseObserver);
  }
}
