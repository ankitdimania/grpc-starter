package com.grootstock.helloworld.di;

import com.grootstock.helloworld.service.MathService;
import com.grootstock.helloworld.service.activity.Activity;
import com.grootstock.helloworld.service.activity.AddActivity;
import com.grootstock.helloworld.service.activity.DivideActivity;
import com.grootstock.helloworld.service.activity.MultiplyActivity;
import com.grootstock.helloworld.service.validator.DivideDivisorValidator;
import com.grootstock.helloworld.service.validator.Validator;
import com.grootstock.math.AddRequest;
import com.grootstock.math.AddResponse;
import com.grootstock.math.DivideRequest;
import com.grootstock.math.DivideResponse;
import com.grootstock.math.MultiplyRequest;
import com.grootstock.math.MultiplyResponse;
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
  @Named("AddActivity")
  static Activity<AddRequest, AddResponse> provideAddActivity(AddActivity addActivity) {
    return addActivity;
  }

  @Provides
  @Named("MultiplyActivity")
  static Activity<MultiplyRequest, MultiplyResponse> provideMultiplyActivity(
          MultiplyActivity multiplyActivity) {
    return multiplyActivity;
  }

  @Provides
  @Named("DivideActivity")
  static Activity<DivideRequest, DivideResponse> provideDivideActivity(
          DivideActivity divideActivity) {
    return divideActivity;
  }

  @Provides
  @Named("AddActivityValidators")
  static List<Validator<AddRequest, AddResponse>> getAddActivityValidators() {
    List<Validator<AddRequest, AddResponse>> validators = new ArrayList<>();
    // pre-validators

    // post-validators
    // none

    return validators;
  }

  @Provides
  @Named("MultiplyActivityValidators")
  static List<Validator<MultiplyRequest, MultiplyResponse>> getMultiplyActivityValidators() {
    List<Validator<MultiplyRequest, MultiplyResponse>> validators = new ArrayList<>();
    // pre-validators

    // post-validators
    // none

    return validators;
  }

  @Provides
  @Named("DivideActivityValidators")
  static List<Validator<DivideRequest, DivideResponse>> getDivideActivityValidators() {
    List<Validator<DivideRequest, DivideResponse>> validators = new ArrayList<>();
    // pre-validators
    validators.add(new DivideDivisorValidator());

    // post-validators
    // none

    return validators;
  }

}
