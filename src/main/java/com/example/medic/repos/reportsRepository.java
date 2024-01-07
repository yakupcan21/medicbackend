package com.example.medic.repos;

import com.example.medic.entity.reports;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;


public interface reportsRepository extends JpaRepository<reports, Long> {


}
