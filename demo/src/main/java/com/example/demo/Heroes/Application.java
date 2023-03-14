package com.example.demo.Heroes;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {
    public static void main ( String[] args ) {
        SpringApplication.run(Application.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner(HeroesRepository heroesRepository) {
        return args -> {
            Heroes flash = new Heroes (
              "The Flash",
                    "super speed",
                    "lightning",
                    "time travel",
                    9
            );
            heroesRepository.save ( flash );
            Heroes spiderman = new Heroes (
                    "Spiderman",
                    "spider sense",
                    "spider vision",
                    "super strength",
                    7
            );
            heroesRepository.save ( spiderman );

            Heroes wonderwoman = new Heroes (
                    "Wonder Woman",
                    "super strength",
                    "flight",
                    "invulnerability",
                    9
            );
            heroesRepository.save ( wonderwoman );

        };
    }
}
