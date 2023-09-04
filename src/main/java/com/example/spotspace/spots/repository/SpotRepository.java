package com.example.spotspace.spots.repository;

import com.example.spotspace.spots.model.Spot;
import org.springframework.data.mongodb.repository.*;

public interface SpotRepository extends MongoRepository<Spot, Long> {
}