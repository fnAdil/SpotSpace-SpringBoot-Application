package com.example.spotspace.spots.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.example.spotspace.spots.model.Spot;
import com.example.spotspace.spots.repository.SpotRepository;

@EnableMongoRepositories(basePackageClasses = SpotRepository.class)
@Configuration
public class MongoConfig {
    @Bean
    CommandLineRunner commandLineRunner(SpotRepository spotRepository) {
        return strings -> {
            spotRepository.save(new Spot("1", "Calvin", "Ryan"));
            spotRepository.save(new Spot("2", "Bryson", "Reid"));
        };
    }
}
