package com.example.medic.repos;

import com.example.medic.entity.patients;
import org.springframework.data.repository.CrudRepository;

public interface patientsRepository extends CrudRepository<patients, Long> {

}
