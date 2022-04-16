package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;


@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return  args -> {
            Student mari = new Student(
                    "Mari",
                    "marie@gmail.com",
                    LocalDate.of(2000, JANUARY, 5)

            );
            Student alex = new Student(
                    "alex",
                    "alex@gmail.com",
                    LocalDate.of(2004, JANUARY, 5)

            );
            repository.saveAll(
                    List.of(mari,alex)
            );
        };
    }
}
