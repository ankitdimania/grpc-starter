package com.grootstock.helloworld.service.activity;

import com.grootstock.helloworld.service.validator.DivideDivisorValidator;
import com.grootstock.helloworld.service.validator.Validator;
import com.grootstock.math.DivideRequest;
import com.grootstock.math.DivideResponse;
import io.grpc.StatusException;
import io.grpc.stub.StreamObserver;

import java.util.ArrayList;
import java.util.List;

/**
 * This class does the divide operation.
 */
public class DivideActivity extends BaseActivity<DivideRequest, DivideResponse> {

  private static final List<Validator<DivideRequest>> validators = initializeValidators();

  private static List<Validator<DivideRequest>> initializeValidators() {
    List<Validator<DivideRequest>> validators = new ArrayList<>();
    validators.add(new DivideDivisorValidator());

    return validators;
  }

  public DivideActivity() {
    super(validators);
  }

  @Override
  protected void performInternal(DivideRequest request,
                                 StreamObserver<DivideResponse> responseObserver)
          throws StatusException {
    long dividend = request.getDividend();
    long divisor = request.getDivisor();

    long quotient = dividend / divisor;
    long remainder = dividend % divisor;

    DivideResponse addResponse = DivideResponse.newBuilder()
            .setQuotient(quotient).setRemainder(remainder).build();
    responseObserver.onNext(addResponse);
  }
}
