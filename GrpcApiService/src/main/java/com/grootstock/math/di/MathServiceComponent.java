package com.grootstock.math.di;

import com.grootstock.di.CommonsModule;
import com.grootstock.math.service.di.MathCoreModule;
import dagger.Component;
import io.grpc.BindableService;
import io.grpc.ServerServiceDefinition;

import javax.inject.Named;

@Component(modules = {CommonsModule.class, MathCoreModule.class, MathServiceModule.class})
public interface MathServiceComponent {
  @Named("math_service")
  ServerServiceDefinition createMathService();

  @Named("ping_service")
  BindableService createPingService();
}
