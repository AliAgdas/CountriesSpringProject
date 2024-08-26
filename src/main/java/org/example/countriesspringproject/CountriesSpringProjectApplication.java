package org.example.countriesspringproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("org.example.countriesspringproject.repository")
@EntityScan("org.example.countriesspringproject.entity")
public class CountriesSpringProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(CountriesSpringProjectApplication.class, args);
    }

}
