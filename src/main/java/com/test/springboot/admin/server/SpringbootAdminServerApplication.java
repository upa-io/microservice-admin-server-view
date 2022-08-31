package com.test.springboot.admin.server;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
@Slf4j
public class SpringbootAdminServerApplication {

	public static void main(String[] args) {
		log.info("Inciando aplicacion microservices-admin-server-view");

		SpringApplication.run(SpringbootAdminServerApplication.class, args);
	}

}
