package com.grootstock.helloworld.service.validator;

import io.grpc.StatusException;

public abstract class BaseValidator<ReqT, ResT> implements Validator<ReqT, ResT> {

  @Override
  public void requestValidate(ReqT request) throws StatusException {
    // No-Op
  }

  @Override
  public void responseValidate(ReqT request, ResT response) throws StatusException {
    // No-Op
  }
}
