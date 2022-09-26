package com.movieConfigServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MovieConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieConfigServerApplication.class, args);
	}

}
