package com.example.medic.repos;

import com.example.medic.entity.doctor;
import org.springframework.data.repository.CrudRepository;

public interface doctorRepository extends CrudRepository<doctor, Long> {
}
