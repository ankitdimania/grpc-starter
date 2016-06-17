package com.grootstock.helloworld.service.validator;

import com.grootstock.math.DivideRequest;
import io.grpc.Status;
import io.grpc.StatusException;

public class DivideDivisorValidator extends BaseValidator<DivideRequest>
        implements Validator<DivideRequest> {

  @Override
  public void validate(DivideRequest request) throws StatusException {
    if (request.getDivisor() == 0) {
      throw Status.FAILED_PRECONDITION.withDescription("Divisor can't be zero.").asException();
    }
  }
}
