package com.example.SpringBootDeneme.controller;

import com.example.SpringBootDeneme.entity.reports;
import com.example.SpringBootDeneme.repo.reportsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class reportsController {

    @Autowired
    reportsRepository reportsRepository;
    @PostMapping("/addReport")
    public void addReport(@RequestBody reports reports) { reportsRepository.save(reports); }
}
