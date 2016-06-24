package com.grootstock.helloworld.di;

import dagger.Component;
import io.grpc.BindableService;

@Component(modules = MathServiceModule.class)
public interface MathServiceComponent {
  BindableService createService();
}
