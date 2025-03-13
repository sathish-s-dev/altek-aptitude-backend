package com.altek.repositories;

import com.altek.entity.Results;

import java.util.Optional;

// import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResultsRepository extends MongoRepository<Results, Long> {
    // You can define custom query methods here if needed
    // For example:
    // List<Student> findByName(String name);

    Optional<Results> findByEmail(String email);

}
