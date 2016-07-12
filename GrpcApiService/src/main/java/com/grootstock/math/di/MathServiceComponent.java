package com.grootstock.math.di;

import com.grootstock.adapter.di.AdapterModule;
import com.grootstock.di.CommonsModule;
import com.grootstock.math.service.di.MathCoreModule;
import dagger.Component;
import io.grpc.ServerServiceDefinition;

import javax.inject.Named;
import javax.inject.Singleton;

@Singleton
@Component(
        modules = {
                CommonsModule.class,
                MathCoreModule.class,
                AdapterModule.class,
                MathServiceModule.class
        }
)
public interface MathServiceComponent {
  @Named("math_service")
  ServerServiceDefinition createMathService();

  @Named("ping_service")
  ServerServiceDefinition createPingService();
}
