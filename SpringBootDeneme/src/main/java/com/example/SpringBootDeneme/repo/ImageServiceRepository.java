package com.example.SpringBootDeneme.repo;

import com.example.SpringBootDeneme.entity.ImageService;
import com.example.SpringBootDeneme.entity.createReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface ImageServiceRepository extends JpaRepository<ImageService, Long> {


}
