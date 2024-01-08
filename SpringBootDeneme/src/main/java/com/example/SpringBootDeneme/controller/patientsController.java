package com.example.SpringBootDeneme.controller;

import com.example.SpringBootDeneme.entity.patients;
import com.example.SpringBootDeneme.repo.patientsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class patientsController {

    @Autowired
    patientsRepository patientsRepository;
    @PostMapping("/addPatients")
    public void addPatients(@RequestBody patients patients) { patientsRepository.save(patients); }
}
