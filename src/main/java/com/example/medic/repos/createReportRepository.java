package com.example.medic.repos;

import com.example.medic.entity.createReport;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface createReportRepository extends CrudRepository<createReport, Long> {

    // Custom query to find reports by some criteria (replace with your actual criteria)
    List<createReport> findBySomeCriteria(String criteria);
}

