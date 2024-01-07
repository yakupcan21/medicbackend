package com.example.SpringBootDeneme;

import com.example.SpringBootDeneme.Model.Doctor;
import com.example.SpringBootDeneme.repo.DoctorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class DoctorController {
@Autowired
    DoctorRepo doctorRepo;
    @PostMapping("/addDoctor")
    public void addDoctor(@RequestBody Doctor doctor){
        doctorRepo.save(doctor);
    }
}
