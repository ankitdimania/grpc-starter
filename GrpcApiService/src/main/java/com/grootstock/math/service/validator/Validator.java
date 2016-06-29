package com.grootstock.math.service.validator;

import io.grpc.StatusException;

public interface Validator<ReqT, ResT> {
  void requestValidate(ReqT request) throws StatusException;

  void responseValidate(ReqT request, ResT response) throws StatusException;
}
