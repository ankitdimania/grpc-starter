package com.grootstock.math.service.handler;

import com.grootstock.math.service.response.DivideResponseBuilder;
import com.grootstock.math.DivideRequest;
import com.grootstock.math.DivideResponse;
import lombok.extern.slf4j.Slf4j;

import javax.inject.Inject;
import javax.inject.Named;

@Slf4j
public class DivideWorker extends BaseWorker {
  // Instance variables are thread safe
  long dividend;
  long divisor;


  @Inject
  public DivideWorker(@Named("RequestId") String requestId) {
    super(requestId);
  }

  /**
   * Perform the divide operation.
   *
   * @param request valid divide request
   * @return Division response
   */
  public DivideResponse divide(DivideRequest request) {
    log.info("Processing divide request");
    // instance variables are thread safe. here you may wanna set
    // state variables like ids, progress, etc.
    dividend = request.getDividend();
    divisor = request.getDivisor();

    return performOperation();
  }

  /**
   * Perform the Divide operation.
   *
   * @return DivideResponse
   */
  private DivideResponse performOperation() {
    log.info("Processing divide operation with dividend:" + dividend + ", divisor:" + divisor);
    long quotient = dividend / divisor;
    long remainder = dividend % divisor;

    veryComplicatedOperation();

    return DivideResponseBuilder.build(quotient, remainder);
  }

  private void veryComplicatedOperation() {
    try {
      Thread.sleep(9000);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
  }
}
