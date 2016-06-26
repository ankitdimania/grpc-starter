package com.grootstock.math.service.handler;

import com.grootstock.math.service.response.DivideResponseBuilder;
import com.grootstock.math.DivideRequest;
import com.grootstock.math.DivideResponse;

public class DivideWorker extends BaseWorker {
  // Instance variables are thread safe
  String requestId;
  long dividend;
  long divisor;

  /**
   * Perform the divide operation.
   *
   * @param request valid divide request
   * @return Division response
   */
  public DivideResponse divide(DivideRequest request) {
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
  public DivideResponse performOperation() {
    long quotient = dividend / divisor;
    long remainder = dividend % divisor;

    return DivideResponseBuilder.build(quotient, remainder);
  }
}
