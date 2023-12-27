package com.example.medic.controller;

import com.example.medic.repos.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class Controller {

    @Autowired
    private allpatreportsRepository AllPatReportsRepository;
    @Autowired
    private loginRepository LoginRepository;
    @Autowired
    private myreportsRepository MyReportsRepository;
    @Autowired
    private patientsRepository PatientsRepository;
    @Autowired
    private userinfoRepository UserInfoRepository;



}
