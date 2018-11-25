package com.example.myservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MyserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyserviceApplication.class, args);
    }
}
