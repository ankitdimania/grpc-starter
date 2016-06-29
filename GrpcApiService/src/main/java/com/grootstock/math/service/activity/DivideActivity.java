package com.grootstock.math.service.activity;

import com.grootstock.math.DivideRequest;
import com.grootstock.math.DivideResponse;
import com.grootstock.math.service.handler.DivideWorker;
import com.grootstock.math.service.validator.Validator;
import io.grpc.StatusException;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Provider;
import java.util.List;

/**
 * This class does the divide operation.
 */
public class DivideActivity extends BaseActivity<DivideRequest, DivideResponse> {
  private Provider<DivideWorker> workerProvider;

  @Inject
  public DivideActivity(
          @Named("DivideActivityValidators")
                  List<Validator<DivideRequest, DivideResponse>> validators,
          Provider<DivideWorker> workerProvider) {
    super(validators);
    this.workerProvider = workerProvider;
  }

  @Override
  protected DivideResponse performInternal(DivideRequest request)
          throws StatusException {
    DivideWorker worker = workerProvider.get();
    return worker.divide(request);
  }
}
