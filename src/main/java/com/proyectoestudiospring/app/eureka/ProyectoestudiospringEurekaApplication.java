package com.proyectoestudiospring.app.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ProyectoestudiospringEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoestudiospringEurekaApplication.class, args);
	}

}
