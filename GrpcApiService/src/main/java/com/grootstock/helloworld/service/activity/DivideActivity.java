package com.grootstock.helloworld.service.activity;

import com.grootstock.helloworld.service.validator.Validator;
import com.grootstock.math.DivideRequest;
import com.grootstock.math.DivideResponse;
import io.grpc.StatusException;

import java.util.List;

/**
 * This class does the divide operation.
 */
public class DivideActivity extends BaseActivity<DivideRequest, DivideResponse> {

  public DivideActivity(List<Validator<DivideRequest, DivideResponse>> validators) {
    super(validators);
  }

  @Override
  protected DivideResponse performInternal(DivideRequest request)
          throws StatusException {
    long dividend = request.getDividend();
    long divisor = request.getDivisor();

    long quotient = dividend / divisor;
    long remainder = dividend % divisor;

    DivideResponse addResponse = DivideResponse.newBuilder()
            .setQuotient(quotient).setRemainder(remainder).build();
    return addResponse;
  }
}
