package com.grootstock.math.service.handler;

import com.grootstock.math.AddRequest;
import com.grootstock.math.AddResponse;

import javax.inject.Inject;
import javax.inject.Named;

public class AddWorker extends BaseWorker {

  @Inject
  public AddWorker(@Named("RequestId") String requestId) {
    super(requestId);
  }

  /**
   * Perform the add operation.
   *
   * @param request valid add request
   * @return Division response
   */
  public AddResponse add(AddRequest request) {
    // instance variables are thread safe. here you may wanna set
    // state variables like ids, progress, etc.

    double a = request.getA();
    double b = request.getB();
    double sum = a + b;

    AddResponse addResponse = AddResponse.newBuilder().setSum(sum).build();
    return addResponse;
  }

}
