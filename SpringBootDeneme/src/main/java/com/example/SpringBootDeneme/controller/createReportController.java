package com.example.SpringBootDeneme.controller;

import com.example.SpringBootDeneme.entity.createReport;
import com.example.SpringBootDeneme.repo.createReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class createReportController {

    @Autowired
    createReportRepository createReportRepository;
        @PostMapping("/addCreateReport")
        public void addCreateReport(@RequestBody createReport createReport) { createReportRepository.save(createReport); }
}
