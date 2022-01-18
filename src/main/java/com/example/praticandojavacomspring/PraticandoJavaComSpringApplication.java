package com.example.praticandojavacomspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

//habilita o Feign no projeto
@EnableFeignClients
@SpringBootApplication
public class PraticandoJavaComSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(PraticandoJavaComSpringApplication.class, args);
    }

}
