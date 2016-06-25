package com.grootstock.helloworld.di;

import com.grootstock.math.service.di.MathCoreModule;
import dagger.Component;
import io.grpc.BindableService;

@Component(modules = {MathCoreModule.class, MathServiceModule.class})
public interface MathServiceComponent {
  BindableService createService();
}
