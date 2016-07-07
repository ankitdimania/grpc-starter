package com.grootstock.math;

import com.grootstock.math.di.DaggerMathServiceComponent;
import com.grootstock.math.di.MathServiceComponent;
import io.grpc.Codec;
import io.grpc.CompressorRegistry;
import io.grpc.DecompressorRegistry;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

/**
 * Server that manages startup/shutdown of a {@code Greeter} server.
 */
@Slf4j
public class MathServer {

  /* The port on which the server should run */
  private int port = 50051;
  private Server server;
  private Codec serverCodec = new Codec.Gzip();
  private DecompressorRegistry serverDecompressors = DecompressorRegistry.emptyInstance();
  private CompressorRegistry serverCompressors = CompressorRegistry.newEmptyInstance();

  private MathServer() {
    serverCompressors.register(serverCodec);
    serverDecompressors = serverDecompressors.with(serverCodec, true);
  }

  private void start() throws IOException {
    MathServiceComponent dagger = DaggerMathServiceComponent.create();
    server = ServerBuilder.forPort(port)
            .addService(dagger.createMathService())
            .addService(dagger.createPingService())
            .compressorRegistry(serverCompressors)
            .decompressorRegistry(serverDecompressors)
            .build()
            .start();
    log.info("Server started, listening on " + port);
    Runtime.getRuntime().addShutdownHook(new Thread() {
      @Override
      public void run() {
        // Use stderr here since the logger may have been reset by its JVM shutdown hook.
        log.error("*** shutting down gRPC server since JVM is shutting down");
        MathServer.this.stop();
        log.error("*** server shut down");
      }
    });
  }

  private void stop() {
    if (server != null) {
      server.shutdown();
    }
  }

  /**
   * Await termination on the main thread since the grpc library uses daemon threads.
   */
  private void blockUntilShutdown() throws InterruptedException {
    if (server != null) {
      server.awaitTermination();
    }
  }

  /**
   * Main launches the server from the command line.
   *
   * @param args Command Line
   * @throws IOException          server IO issue
   * @throws InterruptedException server interrupted while wait
   */
  public static void main(String[] args) throws IOException, InterruptedException {
    final MathServer server = new MathServer();
    server.start();
    server.blockUntilShutdown();
  }
}
