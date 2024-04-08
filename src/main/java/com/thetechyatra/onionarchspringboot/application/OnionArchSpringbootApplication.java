package com.thetechyatra.onionarchspringboot.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.thetechyatra.onionarchspringboot")
@EnableJpaRepositories(basePackages = {"com.thetechyatra.onionarchspringboot.adapter.spi.persistance",
		"com.thetechyatra.onionarchspringboot.adapter.spi.persistance.entity.MessageEntity"})
public class OnionArchSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnionArchSpringbootApplication.class, args);
	}

}
