package com.example.medic.repos;

import com.example.medic.entity.ImageService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ImageServiceRepository extends JpaRepository<ImageService, Long> {
}
