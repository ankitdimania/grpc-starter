package com.grootstock.math.service.di;

import com.grootstock.math.service.handler.DivideWorker;
import dagger.Module;
import dagger.Provides;

@Module
public class MathCoreModule {

  @Provides
  static DivideWorker provideDivideWorker() {
    return new DivideWorker();
  }
}
