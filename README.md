# grpc-starter
The project outlines creating new services using [gRPC](http://www.grpc.io/)


# Build project
```shell
./gradlew clean build
```

# Run project
## In IntelliJ
run main class `com.grootstock.math.MathServer` for server
run main class `com.grootstock.helloworld.MathClient` for client


## In shell
run the `tar` inside GrpcApiService/build/distributions/GrpcApiService-0.x.tar
```shell
tar -C GrpcApiService/build/distributions -xvf GrpcApiService/build/distributions/GrpcApiService-0.x.tar
GrpcApiService/build/distributions/GrpcApiService-0.1/bin/math-server
```

# Push Image to Docker Hub

```shell
 DOCKER_REGISTRY_USERNAME=myusername DOCKER_REGISTRY_EMAIL='emailaddress@gmail.com' DOCKER_REGISTRY_PASSWORD='secretpass' ./gradlew pushServiceImage --stacktrace
```

# Docker Images
[gRPC Starter](https://hub.docker.com/r/ankitdimania/grpc-starter/tags/)

# Update gradle wrapper
```shell
./gradlew wrapper --gradle-version 3.0-milestone-2
```
