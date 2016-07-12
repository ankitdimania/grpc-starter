package com.grootstock.adapter;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.inject.Inject;

public class MySqlAdapter {
  private SessionFactory sessionFactory;

  @Inject
  public MySqlAdapter(SessionFactory sessionFactory) {
    this.sessionFactory = sessionFactory;
  }

  /**
   * Get List of Companies.
   */
  public void getCompanies() {
    @lombok.Cleanup Session session = sessionFactory.openSession();
    // session.getTransaction().begin();

    // session.get
    // session.save(user);
    // session.getTransaction().commit();
    session.close();
  }

}
