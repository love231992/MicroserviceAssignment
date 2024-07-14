package com.example.api_gateway_lovepreet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ApiGatewayLovepreetApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiGatewayLovepreetApplication.class, args);
    }

}
