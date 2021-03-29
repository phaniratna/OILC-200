package com.ojas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class DiscoverClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiscoverClientApplication.class, args);
	}

}
