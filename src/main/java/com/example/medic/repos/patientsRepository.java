package com.example.medic.repos;

import com.example.medic.entity.patients;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;


public interface patientsRepository extends JpaRepository<patients, Long> {

}
