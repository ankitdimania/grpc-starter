package com.grootstock.helloworld.service.activity;

import com.grootstock.helloworld.service.validator.Validator;
import com.grootstock.math.AddRequest;
import com.grootstock.math.AddResponse;
import com.grootstock.math.service.handler.AddWorker;
import io.grpc.StatusException;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Provider;
import java.util.List;

/**
 * This class does the sum operation.
 */
public class AddActivity extends BaseActivity<AddRequest, AddResponse> {
  private Provider<AddWorker> workerProvider;

  @Inject
  public AddActivity(
          @Named("AddActivityValidators")
                  List<Validator<AddRequest, AddResponse>> validators,
          Provider<AddWorker> workerProvider) {
    super(validators);
    this.workerProvider = workerProvider;
  }

  @Override
  protected AddResponse performInternal(AddRequest request)
          throws StatusException {
    AddWorker worker = workerProvider.get();
    return worker.add(request);
  }
}
