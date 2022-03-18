package com.example.springrest.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student anubhav = new Student(
                    "Anubhav",
                    "anubhav100rao@gmail.com",
                    LocalDate.of(2000, Month.JULY, 9)
            );
            Student adarsh = new Student(
                    "Adarsh",
                    "adarsh100rao@gmail.com",
                    LocalDate.of(2002, Month.JUNE, 9)
            );
            repository.saveAll(
                    List.of(anubhav, adarsh)
            );
        };
    }
}
