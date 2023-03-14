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
            //how to see in PostgreSQL using psql(command line interface)
            //"superheroes"(application.properties) is the name of my database as an example
            //create database, type: create database superheroes;
            // connect to database,type: \c superheroes
            // next,type: \d
            // expand, type: \x , change back with same command back
            // type:select * from heroes;
            //"heroes" is the name of the table

        };
    }
}
