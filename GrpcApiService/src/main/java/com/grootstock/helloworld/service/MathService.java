/*
 * Copyright 2015, Google Inc. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are
 * met:
 *
 *    * Redistributions of source code must retain the above copyright
 * notice, this list of conditions and the following disclaimer.
 *    * Redistributions in binary form must reproduce the above
 * copyright notice, this list of conditions and the following disclaimer
 * in the documentation and/or other materials provided with the
 * distribution.
 *
 *    * Neither the name of Google Inc. nor the names of its
 * contributors may be used to endorse or promote products derived from
 * this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
 * A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
 * OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 * THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

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

public class MathService extends MathServiceGrpc.AbstractMathService {
  private DivideActivity divideActivity = new DivideActivity();

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
