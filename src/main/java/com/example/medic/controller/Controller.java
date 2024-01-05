package com.example.medic.controller;

import com.example.medic.entity.*;
import com.example.medic.repos.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Optional;

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


    @GetMapping("/createReports/{id}")
    public createReport getCreateReports(@PathVariable Long id) {
        Optional<createReport> createReport = createReportRepository.findById(id);
        if (createReport.isPresent()) return createReport.get();
        return new createReport();
    }

    @GetMapping("/doctor/{id0}")
    public doctor getDoctor(@PathVariable Long id) {
        Optional<doctor> doctor = doctorRepository.findById(id);
        if (doctor.isPresent()) return doctor.get();
        return new doctor();
    }

    @GetMapping("/images/{id}")
    public ImageService getImageService(@PathVariable Long id) {
        Optional<ImageService> ImageService = ImageServiceRepository.findById(id);
        if (ImageService.isPresent()) return ImageService.get();
        return new ImageService();
    }

    @GetMapping("/patient/{id}")
    public patients getPatient(@PathVariable Long id) {
        Optional<patients> patients = patientsRepository.findById(id);
        if (patients.isPresent()) return patients.get();
        return new patients();
    }

    @GetMapping("/report/{id}")
    public reports getReport(@PathVariable Long id) {
        Optional<reports> reports = reportsRepository.findById(id);
        if (reports.isPresent()) return reports.get();
        return new reports();
    }

    @PostMapping(path ="/createCreateReport/{id}")
    public createReport post(@RequestBody createReport createReport) {return createReportRepository.save(createReport);}

    @PostMapping(path ="/createDoctor/{id}")
    public doctor post(@RequestBody doctor doctor) {return doctorRepository.save(doctor); }

    @PostMapping(path ="createImageReport/{id}")
    public ImageService post(@RequestBody ImageService ImageService) {return ImageServiceRepository.save(ImageService); }

    @PostMapping(path ="/createPatients/{id}")
    public patients post(@RequestBody patients patients) {return patientsRepository.save(patients); }

    @PostMapping(path ="/createReport/{id}")
    public reports post(@RequestBody reports reports) {return reportsRepository.save(reports); }

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
