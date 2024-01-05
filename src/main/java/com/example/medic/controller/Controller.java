package com.example.medic.controller;

import com.example.medic.entity.*;
import com.example.medic.repos.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@CrossOrigin
@RestController
@RequestMapping("/api/images")
public class Controller {

    @Autowired
    private createReportRepository createReportRepository;
    @Autowired
    private doctorRepository doctorRepository;
    @Autowired
    private ImageServiceRepository ImageServiceRepository;
    @Autowired
    private patientsRepository patientsRepository;
    @Autowired
    private reportsRepository reportsRepository;


    /*İLYAS*/
    @Autowired
    private ImageService imageService;
    /*İLYAS*/


    @GetMapping(path = "/seeAllCreateReports")
    public Iterable<createReport> getAllCreateReports(){ return createReportRepository.findAll(); }
    @GetMapping(path ="/seeAllDoctors")
    public Iterable<doctor> getAllDoctors(){ return doctorRepository.findAll(); }
    @GetMapping(path = "/seeAllImages")
    public Iterable<ImageService> getAllImages(){ return ImageServiceRepository.findAll(); }
    @GetMapping(path = "/seeAllPatients")
    public Iterable<patients> getAllPatients(){ return patientsRepository.findAll(); }
    @GetMapping(path = "/seeAllReports")
    public Iterable<reports> getAllReports(){ return reportsRepository.findAll(); }


    @GetMapping
    

    /*İLYAS*/
    @PostMapping("/upload")
    public ResponseEntity<String> handleFileUpload(@RequestParam("imgName") String imgName,
                                                   @RequestParam("file") MultipartFile file) {
        try {
            createReport savedImage = imageService.saveImage(imgName, file);
            return ResponseEntity.ok("Image uploaded successfully. Image ID: " + savedImage.getId());
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to upload image.");
        }
    }
    /*İLYAS*/

}
