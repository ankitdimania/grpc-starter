package com.grootstock.math.service.handler;

import com.grootstock.adapter.MySqlAdapter;
import com.grootstock.math.service.response.DivideResponseBuilder;
import com.grootstock.math.DivideRequest;
import com.grootstock.math.DivideResponse;
import com.grootstock.models.Company;
import lombok.extern.slf4j.Slf4j;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Slf4j
public class DivideWorker extends BaseWorker {
  private MySqlAdapter mySqlAdapter;

  // Instance variables are thread safe
  long dividend;
  long divisor;


  @Inject
  public DivideWorker(@Named("RequestId") String requestId, MySqlAdapter mySqlAdapter) {
    super(requestId);
    this.mySqlAdapter = mySqlAdapter;
  }

  /**
   * Perform the divide operation.
   *
   * @param request valid divide request
   * @return Division response
   */
  public DivideResponse divide(DivideRequest request) {
    log.debug("Processing divide request");
    // instance variables are thread safe. here you may wanna set
    // state variables like ids, progress, etc.
    dividend = request.getDividend();
    divisor = request.getDivisor();

    return performOperation();
  }

  /**
   * Perform the Divide operation.
   *
   * @return DivideResponse
   */
  private DivideResponse performOperation() {
    log.info("Processing divide operation with dividend:{}, divisor:{}", dividend, divisor);
    long quotient = dividend / divisor;
    long remainder = dividend % divisor;

    veryComplicatedOperation();

    return DivideResponseBuilder.build(quotient, remainder);
  }

  private void veryComplicatedOperation() {
    try {
      List<Company> companies = mySqlAdapter.getCompanies();
      for (int i = 0; i < 10; i++) {
        log.info(companies.get(i).getName());
      }
      Thread.sleep(2000);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
  }
}
