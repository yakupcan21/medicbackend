package com.example.SpringBootDeneme.repo;

import com.example.SpringBootDeneme.entity.patients;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface patientsRepository extends JpaRepository<patients, Long> {
}