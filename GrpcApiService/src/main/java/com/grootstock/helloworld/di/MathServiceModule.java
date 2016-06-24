package com.grootstock.helloworld.di;

import com.grootstock.helloworld.service.MathService;
import com.grootstock.helloworld.service.activity.DivideActivity;
import com.grootstock.helloworld.service.validator.DivideDivisorValidator;
import com.grootstock.helloworld.service.validator.Validator;
import com.grootstock.math.DivideRequest;
import com.grootstock.math.DivideResponse;
import dagger.Module;
import dagger.Provides;
import io.grpc.BindableService;

import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

@Module
public class MathServiceModule {

  @Provides
  BindableService provideMathService(MathService mathService) {
    return mathService;
  }

  @Provides
  @Named("DivideActivity")
  static DivideActivity provideDivideActivity() {
    List<Validator<DivideRequest, DivideResponse>> validators = getDivideActivityValidators();
    return new DivideActivity(validators);
  }

  static List<Validator<DivideRequest, DivideResponse>> getDivideActivityValidators() {
    List<Validator<DivideRequest, DivideResponse>> validators = new ArrayList<>();
    // pre-validators
    validators.add(new DivideDivisorValidator());

    // post-validators
    // none

    return validators;
  }
}
