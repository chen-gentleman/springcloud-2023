package com.chen.serverprovider027004;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaClientGoodsProvider7004 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientGoodsProvider7004.class, args);
    }

}
