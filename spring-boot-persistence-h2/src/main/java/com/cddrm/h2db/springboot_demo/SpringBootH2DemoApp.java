package com.cddrm.h2db.springboot_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

/**
 * https://www.baeldung.com/spring-boot-h2-database
 */
// TODO: Cannot find table "Countries"
@SpringBootApplication
@PropertySource("classpath:application.properties")
public class SpringBootH2DemoApp {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootH2DemoApp.class, args);
    }
}
