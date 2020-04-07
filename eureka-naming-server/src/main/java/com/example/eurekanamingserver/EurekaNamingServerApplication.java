package com.example.eurekanamingserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaServer
//@EnableFeignClients("com.example.eurekanamingserver")
public class EurekaNamingServerApplication{

	public static void main(String[] args) {
		SpringApplication.run(EurekaNamingServerApplication.class, args);
	}

}
