package com.swapi.swapiproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Represent Springboot Application
 * @author Vinesh Kumar
 */
@SpringBootApplication
@EntityScan("com.swapi.swapiproject.entity")
@ComponentScan({"com.swapi.swapiproject.controller", "com.swapi.swapiproject.service", "com.swapi.swapiproject.service.impl", "com.swapi.swapiproject.config"})
@EnableJpaRepositories("com.swapi.swapiproject.dao")
@EnableJpaAuditing
public class SwapiProjectApplication {
    public static void main(String[] args) {
        SpringApplication.run(SwapiProjectApplication.class, args);
    }
}
