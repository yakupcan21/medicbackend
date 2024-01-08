package com.example.SpringBootDeneme.controller;

import com.example.SpringBootDeneme.entity.ImageService;
import com.example.SpringBootDeneme.entity.reports;
import com.example.SpringBootDeneme.repo.ImageServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ImageServiceController {

    @Autowired
    ImageServiceRepository ImageServiceRepository;
    @PostMapping("/addImageService")
    public void addImageService(@RequestBody ImageService ImageService) { ImageServiceRepository.save(ImageService); }
}
