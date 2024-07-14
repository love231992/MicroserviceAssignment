package com.example.discovery_server_lovepreet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DiscoveryServerLovepreetApplication {

    public static void main(String[] args) {
        SpringApplication.run(DiscoveryServerLovepreetApplication.class, args);
    }

}
