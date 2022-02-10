package com.nam.play.grpc;

import java.io.IOException;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class GrpcServer {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.out.println("starting grpc server");
		
        Server server = ServerBuilder
          .forPort(8080)
          .addService(new HelloServiceImpl()).build();
        
        System.out.println("Server built: " + server.toString());

        server.start();
        server.awaitTermination();
    }
}
