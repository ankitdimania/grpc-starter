package com.grootstock.di;

import com.grootstock.ContextHolder;
import dagger.Module;
import dagger.Provides;

import javax.inject.Named;

@Module
public class CommonsModule {

  @Provides
  @Named("RequestId")
  static String provideDivideWorker() {
    return ContextHolder.get().getRequestId();
  }
}
