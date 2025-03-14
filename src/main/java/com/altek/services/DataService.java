package com.altek.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.altek.entity.Results;
import com.altek.entity.Student;
import com.altek.repositories.ResultsRepository;

@Service
public class DataService {

    @Autowired
    private ResultsRepository resultsRepository;

    // Save a new student or update an existing one
    public List<Results> allStudents(Student student) {
        // studentRepository.saveAll(student);
        return resultsRepository.findAll();
    }

    public String saveResults(@RequestBody Results results) {

        Results existingResults = resultsRepository.findByEmail(results.getEmail()).orElse(null);
        if (existingResults != null) {
            return "result already exists";
        }

        resultsRepository.save(results);

        return "result saved successfully";
    }

}
