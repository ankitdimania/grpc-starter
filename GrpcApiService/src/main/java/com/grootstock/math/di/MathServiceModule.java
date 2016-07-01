package com.grootstock.math.di;

import com.grootstock.interceptors.ContextHolderInterceptor;
import com.grootstock.math.AddRequest;
import com.grootstock.math.AddResponse;
import com.grootstock.math.DivideRequest;
import com.grootstock.math.DivideResponse;
import com.grootstock.math.MultiplyRequest;
import com.grootstock.math.MultiplyResponse;
import com.grootstock.math.service.MathService;
import com.grootstock.math.service.activity.Activity;
import com.grootstock.math.service.activity.AddActivity;
import com.grootstock.math.service.activity.DivideActivity;
import com.grootstock.math.service.activity.MultiplyActivity;
import com.grootstock.math.service.interceptors.AuthInterceptor;
import com.grootstock.math.service.validator.DivideDivisorValidator;
import com.grootstock.math.service.validator.Validator;
import dagger.Module;
import dagger.Provides;
import io.grpc.ServerInterceptors;
import io.grpc.ServerServiceDefinition;

import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

@Module
public class MathServiceModule {

  @Provides
  ServerServiceDefinition provideMathService(MathService mathService) {
    ServerServiceDefinition mathServiceDef = ServerInterceptors.intercept(mathService,
            new AuthInterceptor(),
            new ContextHolderInterceptor());
    return mathServiceDef;
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
