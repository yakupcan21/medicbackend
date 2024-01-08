package com.example.SpringBootDeneme.entity;

import com.example.SpringBootDeneme.repo.*;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
@Getter
@Setter
@Entity
@Data
@Table(name = "ImageService")
public class ImageService {

    @Id
    @Autowired
    private createReportRepository createReportRepository;

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