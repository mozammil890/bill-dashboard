package org.example;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"controller","config"})
public class BillDashBoard {
    public static void main(String[] args) {
       SpringApplication.run(BillDashBoard.class);
    }
}