package com.grootstock.math.service.activity;

import com.grootstock.math.service.validator.Validator;
import io.grpc.Status;
import io.grpc.StatusException;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * This class does the basic operation.
 *
 * @param <ReqT> Request Type
 * @param <ResT> Response Type
 */
@Slf4j
public abstract class BaseActivity<ReqT, ResT> implements Activity<ReqT, ResT> {

  private List<Validator<ReqT, ResT>> validators;

  protected BaseActivity(List<Validator<ReqT, ResT>> validators) {
    this.validators = validators;
  }

  /**
   * Base operations.
   *
   * @param request          Request
   * @param responseObserver Response Observer
   */
  public void perform(ReqT request, StreamObserver<ResT> responseObserver) {
    try {
      log.info("Processing " + getClass().getSimpleName());
      performValidations(request);
      log.trace("processing request");
      ResT response = performInternal(request);
      performPostValidation(request, response);
      responseObserver.onNext(response);
      responseObserver.onCompleted();
      log.info("Processing Completed!!!");
    } catch (StatusException | StatusRuntimeException ex) {
      log.error("Exception thrown", ex);
      responseObserver.onError(ex);
    } catch (Exception ex) {
      log.error("Exception thrown", ex);
      Status status = Status.INTERNAL
              .withDescription("Server Issue: [" + ex.getClass() + "] " + ex.getMessage());
      responseObserver.onError(status.asException());
    }
  }

  protected abstract ResT performInternal(ReqT request)
          throws StatusException;

  private void performValidations(ReqT request) throws StatusException {
    log.trace("performing request validations");
    for (Validator<ReqT, ResT> validator : validators) {
      validator.requestValidate(request);
    }
  }

  private void performPostValidation(ReqT request, ResT response) throws StatusException {
    log.trace("performing post validations");
    for (Validator<ReqT, ResT> validator : validators) {
      validator.responseValidate(request, response);
    }
  }
}
