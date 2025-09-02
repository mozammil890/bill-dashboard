package org.example;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "repository")
@ComponentScan(basePackages = {"controller","config","service","utilities","entity", "repository"})
@EntityScan(basePackages = "entity")
public class BillDashBoard {
    public static void main(String[] args) {
       SpringApplication.run(BillDashBoard.class);
    }
}