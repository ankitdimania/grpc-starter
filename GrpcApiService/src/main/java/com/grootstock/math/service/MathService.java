package com.grootstock.math.service;

import com.grootstock.math.AddRequest;
import com.grootstock.math.AddResponse;
import com.grootstock.math.DivideRequest;
import com.grootstock.math.DivideResponse;
import com.grootstock.math.MathServiceGrpc;
import com.grootstock.math.MultiplyRequest;
import com.grootstock.math.MultiplyResponse;
import com.grootstock.math.service.activity.Activity;
import io.grpc.stub.StreamObserver;

import javax.inject.Inject;
import javax.inject.Named;

public class MathService extends MathServiceGrpc.AbstractMathService {
  private Activity<AddRequest, AddResponse> addActivity;
  private Activity<MultiplyRequest, MultiplyResponse> multiplyActivity;
  private Activity<DivideRequest, DivideResponse> divideActivity;

  /**
   * Create new MathService.
   * @param addActivity Add Activity
   * @param multiplyActivity Multiply Activity
   * @param divideActivity Divide Activity
   */
  @Inject
  public MathService(
          @Named("AddActivity") Activity<AddRequest, AddResponse> addActivity,
          @Named("MultiplyActivity") Activity<MultiplyRequest, MultiplyResponse> multiplyActivity,
          @Named("DivideActivity") Activity<DivideRequest, DivideResponse> divideActivity) {
    this.addActivity = addActivity;
    this.multiplyActivity = multiplyActivity;
    this.divideActivity = divideActivity;
  }

  @Override
  public void add(AddRequest request,
                  StreamObserver<AddResponse> responseObserver) {
    addActivity.perform(request, responseObserver);
  }

  @Override
  public void multiply(MultiplyRequest request,
                       StreamObserver<MultiplyResponse> responseObserver) {
    multiplyActivity.perform(request, responseObserver);
  }

  @Override
  public void divide(DivideRequest request,
                     StreamObserver<DivideResponse> responseObserver) {
    divideActivity.perform(request, responseObserver);
  }
}
