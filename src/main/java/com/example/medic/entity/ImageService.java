package com.example.medic.entity;

import com.example.medic.repos.createReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
public class ImageService {

    @Autowired
    private createReportRepository createReportRepository; // Fix the autowiring here

    public createReport saveImage(String imgName, MultipartFile file) throws IOException {
        // Check if the file is not empty
        if (file.isEmpty()) {
            throw new IllegalArgumentException("File is empty");
        }

        // Create a createReport object and set its properties
        createReport createReport = new createReport();
        createReport.setImgName(imgName);
        createReport.setData(file.getBytes());

        // Save the createReport to the database
        return createReportRepository.save(createReport);
    }
}
