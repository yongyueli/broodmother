package com.ti.broodmother;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class BroodmotherApplication {

	public static void main(String[] args) {
		SpringApplication.run(BroodmotherApplication.class, args);
	}
}
