package com.grootstock.math.di;

import com.grootstock.di.CommonsModule;
import com.grootstock.math.service.di.MathCoreModule;
import dagger.Component;
import io.grpc.ServerServiceDefinition;

@Component(modules = {CommonsModule.class, MathCoreModule.class, MathServiceModule.class})
public interface MathServiceComponent {
  ServerServiceDefinition createMathService();
}
