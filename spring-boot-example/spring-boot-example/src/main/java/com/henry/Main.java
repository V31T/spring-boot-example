package com.henry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication // This annotation tells Spring Boot that this is the starting point of the application.
@RestController // makes any method within class with @GetMapping @postMapping etc, will be exposed as REST endpoints that clients can call
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);

    }

    //THe PARAMETER basically determines the http domain, so if its /yoyo the domain will be localhost:8080/yoyo
    @GetMapping("/yoyo") //exposes the method as an endpoint, the parameter is the path
    public String yoyo() {
        return "yoyo";
    }
    //wowow first api

}
