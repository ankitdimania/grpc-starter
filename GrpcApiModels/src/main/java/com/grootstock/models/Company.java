package com.grootstock.models;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "companies")
@Data
public class Company {
  @Id
  @GeneratedValue
  @Column(name = "id")
  private int id;

  @Column(name = "ticker_symbol")
  private String tickerSymbol;

  @Column(name = "name")
  private String name;

  @Column(name = "address")
  private String address;

  @Column(name = "stock_market")
  private String stockMarket;
}
