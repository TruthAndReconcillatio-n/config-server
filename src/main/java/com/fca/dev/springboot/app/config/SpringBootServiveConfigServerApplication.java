package com.fca.dev.springboot.app.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SpringBootServiveConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootServiveConfigServerApplication.class, args);
	}

}
