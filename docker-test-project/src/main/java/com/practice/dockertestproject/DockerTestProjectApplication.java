package com.practice.dockertestproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class DockerTestProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerTestProjectApplication.class, args);
	}

}
