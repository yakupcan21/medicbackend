package com.example.SpringBootDeneme.controller;

import com.example.SpringBootDeneme.entity.doctor;
import com.example.SpringBootDeneme.repo.doctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class doctorController {
@Autowired
doctorRepository doctorRepository;
    @PostMapping("/addDoctor")
    public void addDoctor(@RequestBody doctor doctor){
        doctorRepository.save(doctor);
    }
}
