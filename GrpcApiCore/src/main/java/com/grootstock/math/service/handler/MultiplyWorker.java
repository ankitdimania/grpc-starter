package com.grootstock.math.service.handler;

import com.grootstock.math.MultiplyRequest;
import com.grootstock.math.MultiplyResponse;

public class MultiplyWorker extends BaseWorker {
  // Instance variables are thread safe
  String requestId;

  /**
   * Perform the multiply operation.
   *
   * @param request valid add request
   * @return Division response
   */
  public MultiplyResponse multiply(MultiplyRequest request) {
    // instance variables are thread safe. here you may wanna set
    // state variables like ids, progress, etc.

    double a = request.getA();
    double b = request.getB();
    double product = a * b;

    MultiplyResponse multiplyResponse = MultiplyResponse.newBuilder().setProduct(product).build();
    return multiplyResponse;
  }

}
