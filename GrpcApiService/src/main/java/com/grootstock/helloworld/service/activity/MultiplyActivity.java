package com.grootstock.helloworld.service.activity;

import com.grootstock.helloworld.service.validator.Validator;
import com.grootstock.math.MultiplyRequest;
import com.grootstock.math.MultiplyResponse;
import com.grootstock.math.service.handler.MultiplyWorker;
import io.grpc.StatusException;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Provider;
import java.util.List;

/**
 * This class does the multiply operation.
 */
public class MultiplyActivity extends BaseActivity<MultiplyRequest, MultiplyResponse> {
  private Provider<MultiplyWorker> workerProvider;

  @Inject
  public MultiplyActivity(
          @Named("MultiplyActivityValidators")
                  List<Validator<MultiplyRequest, MultiplyResponse>> validators,
          Provider<MultiplyWorker> workerProvider) {
    super(validators);
    this.workerProvider = workerProvider;
  }

  @Override
  protected MultiplyResponse performInternal(MultiplyRequest request)
          throws StatusException {
    MultiplyWorker worker = workerProvider.get();
    return worker.multiply(request);
  }
}
