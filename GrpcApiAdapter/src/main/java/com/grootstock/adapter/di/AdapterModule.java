package com.grootstock.adapter.di;

import com.grootstock.config.AppConfig;
import com.grootstock.models.Company;
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
   *
   * @return SessionFactory
   */
  @Provides
  @Singleton
  public SessionFactory provideSessionFactory() {
    try {
      String hibernateCfg = AppConfig.getConfig("hibernate_cfg");
      Configuration configuration = new Configuration().configure(hibernateCfg);
      addAnnotatedClass(configuration);
      ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
              .applySettings(configuration.getProperties())
              .build();
      return configuration.buildSessionFactory(serviceRegistry);
    } catch (Exception e) {
      throw new RuntimeException("There was an error building the factory");
    }
  }

  public void addAnnotatedClass(Configuration configuration) {
    configuration.addAnnotatedClass(Company.class);
  }

}
