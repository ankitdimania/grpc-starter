package com.grootstock.helloworld.service.validator;

import com.grootstock.math.DivideRequest;
import com.grootstock.math.DivideResponse;
import io.grpc.Status;
import io.grpc.StatusException;

public class DivideDivisorValidator extends BaseValidator<DivideRequest, DivideResponse>
        implements Validator<DivideRequest, DivideResponse> {

  @Override
  public void requestValidate(DivideRequest request) throws StatusException {
    if (request.getDivisor() == 0) {
      throw Status.INVALID_ARGUMENT.withDescription("Divisor can't be zero.").asException();
    }
  }
}
