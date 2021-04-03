package com.school;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = {"com.school"})
@SpringBootApplication
public class SchoolappApplication {


    public static void main(String[] args) {
        SpringApplication.run(SchoolappApplication.class, args);
    }

}
