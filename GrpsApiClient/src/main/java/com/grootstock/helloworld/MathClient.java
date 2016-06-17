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

package com.grootstock.helloworld;

import com.grootstock.math.AddRequest;
import com.grootstock.math.AddResponse;
import com.grootstock.math.DivideRequest;
import com.grootstock.math.DivideResponse;
import com.grootstock.math.MathServiceGrpc;
import com.grootstock.math.MultiplyRequest;
import com.grootstock.math.MultiplyResponse;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * A simple client that requests a greeting from the MathServer.
 */
public class MathClient {
  private static final Logger logger = Logger.getLogger(MathClient.class.getName());

  private final ManagedChannel channel;
  private final MathServiceGrpc.MathServiceBlockingClient blockingStub;

  /**
   * Construct client connecting to Math server at {@code host:port}.
   */
  public MathClient(String host, int port) {
    channel = ManagedChannelBuilder.forAddress(host, port)
            .usePlaintext(true)
            .build();
    blockingStub = MathServiceGrpc.newBlockingStub(channel);
  }

  public void shutdown() throws InterruptedException {
    channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
  }

  /**
   * Add variables.
   *
   * @param a First variable
   * @param b Second variable
   * @return Sum
   */
  public double add(double a, double b) {
    logger.info("Will try to add a:" + a + " and b:" + b);
    AddRequest request = AddRequest.newBuilder().setA(a).setB(b).build();
    AddResponse response;
    try {
      response = blockingStub.add(request);
    } catch (StatusRuntimeException e) {
      logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
      throw new RuntimeException("RPC failed: " + e.getStatus());
    }
    return response.getSum();
  }

  /**
   * Multiply variable.
   *
   * @param a First variable
   * @param b Second variable
   * @return product
   */
  public double multiply(double a, double b) {
    logger.info("Will try to multiply a:" + a + " and b:" + b);
    MultiplyRequest request = MultiplyRequest.newBuilder().setA(a).setB(b).build();
    MultiplyResponse response;
    try {
      response = blockingStub.multiply(request);
    } catch (StatusRuntimeException e) {
      logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
      throw new RuntimeException("RPC failed: " + e.getStatus());
    }
    return response.getProduct();
  }

  /**
   * Divide variable.
   *
   * @param a First variable
   * @param b Second variable
   * @return quotient
   */
  public double divide(long a, long b) {
    logger.info("Will try to divide a:" + a + " by b:" + b);
    DivideRequest request = DivideRequest.newBuilder().setDividend(a).setDivisor(b).build();
    DivideResponse response;
    try {
      response = blockingStub.divide(request);
    } catch (StatusRuntimeException e) {
      logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
      throw new RuntimeException("RPC failed: " + e.getStatus() + " [" + e.getMessage() + "]", e);
    }
    return response.getQuotient();
  }

  /**
   * Math service.
   */
  public static void main(String[] args) throws Exception {
    MathClient client = new MathClient("localhost", 50051);
    try {
      long a = 15;
      long b = 2;
      logger.info("Sum of " + a + " and " + b + " = " + client.add(a, b));
      logger.info("Product of " + a + " and " + b + " = " + client.multiply(a, b));
      logger.info("Division of " + a + " and " + b + " = " + client.divide(a, b));
    } finally {
      client.shutdown();
    }
  }
}
