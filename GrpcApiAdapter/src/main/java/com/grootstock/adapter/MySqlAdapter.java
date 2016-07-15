package com.grootstock.adapter;

import com.grootstock.models.Company;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import javax.inject.Inject;
import java.util.List;

public class MySqlAdapter {
  private SessionFactory sessionFactory;

  @Inject
  public MySqlAdapter(SessionFactory sessionFactory) {
    this.sessionFactory = sessionFactory;
  }

  /**
   * Get List of Companies.
   */
  public List<Company> getCompanies() {
    @lombok.Cleanup Session session = sessionFactory.openSession();

    Query<Company> query = session.createQuery("from Company", Company.class);
    List<Company> companies = query.list();

    return companies;
  }

}
