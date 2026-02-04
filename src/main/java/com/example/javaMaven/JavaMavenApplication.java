package com.example.javaMaven;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JavaMavenApplication {
    public static void main(String[] args) {
      SpringApplication.run(JavaMavenApplication.class, args);
    }
    @GetMapping("/hello")
    public String hello() {
        System.out.println("Hello From docker swarm");
        return "Hello From docker swarm";
    }

}
