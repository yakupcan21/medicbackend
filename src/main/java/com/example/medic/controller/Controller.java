package com.example.medic.controller;

import com.example.medic.entity.ImageService;
import com.example.medic.entity.createReport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/api/images")
public class Controller {

    @Autowired
    private ImageService imageService;

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


}
