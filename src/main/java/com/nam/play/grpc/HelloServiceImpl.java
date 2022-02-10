package com.nam.play.grpc;

import com.nam.play.grpc.HelloServiceGrpc.HelloServiceImplBase;

import io.grpc.stub.StreamObserver;

public class HelloServiceImpl extends HelloServiceImplBase {
	
	@Override
	public void hello(HelloRequest request, StreamObserver<HelloResponse> responseObserver) {
		
		String greeting = new StringBuilder().append("Hello! ")
				.append(request.getFirstName())
				.append(" ")
				.append(request.getLastName())
				.append(".")
				.toString();
		
		HelloResponse response = HelloResponse.newBuilder()
				.setGreeting(greeting)
				.build();
		
		responseObserver.onNext(response);
        responseObserver.onCompleted();
	}
}