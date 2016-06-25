package com.grootstock.helloworld.service.activity;

import com.grootstock.helloworld.service.validator.Validator;
import io.grpc.Status;
import io.grpc.StatusException;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;

import java.util.List;

/**
 * This class does the basic operation.
 *
 * @param <ReqT> Request Type
 * @param <ResT> Response Type
 */
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
      performValidations(request);
      ResT response = performInternal(request);
      performPostValidation(request, response);
      responseObserver.onNext(response);
      responseObserver.onCompleted();
    } catch (StatusException ex) {
      responseObserver.onError(ex);
    } catch (StatusRuntimeException ex) {
      responseObserver.onError(ex);
    } catch (Exception ex) {
      Status status = Status.INTERNAL
              .withDescription("Server Issue: [" + ex.getClass() + "] " + ex.getMessage());
      responseObserver.onError(status.asException());
    }
  }

  protected abstract ResT performInternal(ReqT request)
          throws StatusException;

  private void performValidations(ReqT request) throws StatusException {
    for (Validator<ReqT, ResT> validator : validators) {
      validator.requestValidate(request);
    }
  }

  private void performPostValidation(ReqT request, ResT response) throws StatusException {
    for (Validator<ReqT, ResT> validator : validators) {
      validator.responseValidate(request, response);
    }
  }
}
