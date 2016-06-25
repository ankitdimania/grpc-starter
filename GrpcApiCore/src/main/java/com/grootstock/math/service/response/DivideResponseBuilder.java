package com.grootstock.math.service.response;

import com.grootstock.math.DivideResponse;

public class DivideResponseBuilder {

  /**
   * Build Divide Response.
   * @param quotient response quotient
   * @param remainder response remainder
   * @return Divide Response
   */
  public static DivideResponse build(long quotient, long remainder) {
    DivideResponse divideResponse = DivideResponse.newBuilder()
            .setQuotient(quotient).setRemainder(remainder).build();
    return divideResponse;
  }
}
