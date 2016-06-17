/*
 * Copyright 2015, Google Inc. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are
 * met:
 *
 *    * Redistributions of source code must retain the above copyright
 * notice, this list of conditions and the following disclaimer.
 *    * Redistributions in binary form must reproduce the above
 * copyright notice, this list of conditions and the following disclaimer
 * in the documentation and/or other materials provided with the
 * distribution.
 *
 *    * Neither the name of Google Inc. nor the names of its
 * contributors may be used to endorse or promote products derived from
 * this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
 * A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
 * OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 * THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package com.grootstock.helloworld.service.activity;

import com.grootstock.helloworld.service.validator.Validator;
import io.grpc.Status;
import io.grpc.StatusException;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;

import java.util.List;

/**
 * This class does the basic operation.
 *
 * @param <ReqT> Request Type
 * @param <ResT> Response Type
 */
public abstract class BaseActivity<ReqT, ResT> {

  private List<Validator<ReqT>> validators;

  protected BaseActivity(List<Validator<ReqT>> validators) {
    this.validators = validators;
  }

  /**
   * Base operations.
   *
   * @param request          Request
   * @param responseObserver Response Observer
   */
  public void perform(ReqT request, StreamObserver<ResT> responseObserver) {
    try {
      performValidations(request);
      performInternal(request, responseObserver);
    } catch (StatusException ex) {
      responseObserver.onError(ex);
    } catch (StatusRuntimeException ex) {
      responseObserver.onError(ex);
    } catch (Exception ex) {
      Status status = Status.INTERNAL.withDescription("Server Issue: " + ex.getMessage());
      responseObserver.onError(status.asException());
    } finally {
      responseObserver.onCompleted();
    }
  }

  protected abstract void performInternal(ReqT request,
                                          StreamObserver<ResT> responseObserver)
          throws StatusException;

  private void performValidations(ReqT request) throws StatusException {
    for (Validator<ReqT> validator : validators) {
      validator.validate(request);
    }
  }
}
