package com.grootstock.math.service.di;

import com.grootstock.math.service.handler.AddWorker;
import com.grootstock.math.service.handler.DivideWorker;
import com.grootstock.math.service.handler.MultiplyWorker;
import dagger.Module;
import dagger.Provides;

@Module
public class MathCoreModule {

  @Provides
  static AddWorker provideAddWorker() {
    return new AddWorker();
  }

  @Provides
  static MultiplyWorker provideMultiplyWorker() {
    return new MultiplyWorker();
  }

  @Provides
  static DivideWorker provideDivideWorker() {
    return new DivideWorker();
  }
}
