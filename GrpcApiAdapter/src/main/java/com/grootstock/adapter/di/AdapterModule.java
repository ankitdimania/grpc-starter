package com.grootstock.adapter.di;

import dagger.Module;
import dagger.Provides;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import javax.inject.Singleton;

@Module
public class AdapterModule {

  /**
   * Provides SessionFactory.
   */
  @Provides
  @Singleton
  public static SessionFactory provideSessionFactory() {
    try {
      Configuration configuration = new Configuration().configure();
      ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
              .applySettings(configuration.getProperties())
              .build();
      return configuration.buildSessionFactory(serviceRegistry);
    } catch (Exception e) {
      throw new RuntimeException("There was an error building the factory");
    }
  }


}
