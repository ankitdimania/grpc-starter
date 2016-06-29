package com.grootstock.math.service.handler;

import com.grootstock.math.MultiplyRequest;
import com.grootstock.math.MultiplyResponse;
import lombok.extern.slf4j.Slf4j;

import javax.inject.Inject;
import javax.inject.Named;

@Slf4j
public class MultiplyWorker extends BaseWorker {

  @Inject
  public MultiplyWorker(@Named("RequestId") String requestId) {
    super(requestId);
  }

  /**
   * Perform the multiply operation.
   *
   * @param request valid add request
   * @return Division response
   */
  public MultiplyResponse multiply(MultiplyRequest request) {
    log.info("Processing multiply request");
    // instance variables are thread safe. here you may wanna set
    // state variables like ids, progress, etc.

    double a = request.getA();
    double b = request.getB();

    log.info("Processing multiply operation with a:" + a + ", b:" + b);
    double product = a * b;

    MultiplyResponse multiplyResponse = MultiplyResponse.newBuilder().setProduct(product).build();
    return multiplyResponse;
  }

}
