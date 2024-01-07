package com.example.medic.repos;

import com.example.medic.entity.doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface doctorRepository extends JpaRepository<doctor, Long> {
}
