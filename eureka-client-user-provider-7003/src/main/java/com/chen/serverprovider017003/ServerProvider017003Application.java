package com.chen.serverprovider017003;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServerProvider017003Application {

    public static void main(String[] args) {
        SpringApplication.run(ServerProvider017003Application.class, args);
    }

}
