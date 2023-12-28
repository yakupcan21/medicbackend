package com.example.medic.controller;

import com.example.medic.entity.*;
import com.example.medic.repos.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

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

    @GetMapping(path = "/seeAllPatReports")
    public Iterable<allpatreports> getAllPatReports(){ return AllPatReportsRepository.findAll();}
    @GetMapping(path = "/seeAllLogin")
    public Iterable<login> getAllLogins(){ return LoginRepository.findAll();}
    @GetMapping(path = "/seeAllMyReports")
    public Iterable<myreports> getAllMyReports(){ return MyReportsRepository.findAll();}
    @GetMapping(path = "/seeAllPatients")
    public Iterable<patients> getAllPatients(){ return PatientsRepository.findAll();}
    @GetMapping(path = "/seeAllUserInfo")
    public Iterable<userinfo> getAllUserInfo(){ return UserInfoRepository.findAll();}

    @GetMapping("/patreports/{id}")
    public allpatreports getPatReports(@PathVariable Long id){
        Optional<allpatreports> reports = AllPatReportsRepository.findById(id);
        if(reports.isPresent()) return reports.get();
        return new allpatreports();
    }
    @GetMapping("/login/{id}")
    public login getLogin(@PathVariable Long id){
        Optional<login> logins = LoginRepository.findById(id);
        if(logins.isPresent()) return logins.get();
        return new login();
    }
    @GetMapping("/myreports/{id}")
    public myreports getMyReports(@PathVariable Long id){
        Optional<myreports> myreports = MyReportsRepository.findById(id);
        if(myreports.isPresent()) return myreports.get();
        return new myreports();
    }
    @GetMapping("/allpatients/{id}")
    public patients getPatients(@PathVariable Long id){
        Optional<patients> Patients = PatientsRepository.findById(id);
        if(Patients.isPresent()) return Patients.get();
        return new patients();
    }
    @GetMapping("/patreports/{id}")
    public allpatreports getPatReports(@PathVariable Long id){
        Optional<allpatreports> reports = AllPatReportsRepository.findById(id);
        if(reports.isPresent()) return reports.get();
        return new allpatreports();
    }

    @PostMapping(path ="/createPassenger") // Different endpoint path for creating User
    public Passenger post(@RequestBody Passenger user) { return passengerRepository.save(user); }

}
