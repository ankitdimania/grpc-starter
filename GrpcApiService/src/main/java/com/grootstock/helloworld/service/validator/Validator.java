package com.grootstock.helloworld.service.validator;

import io.grpc.StatusException;

public interface Validator<ReqT> {
  void validate(ReqT request) throws StatusException;
}
