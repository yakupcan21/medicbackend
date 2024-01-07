package com.example.medic.repos;

import com.example.medic.entity.createReport;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
public interface createReportRepository extends JpaRepository<createReport, Long> {

    // Custom query to find reports by some criteria (replace with your actual criteria)
    List<createReport> findBySomeCriteria(String criteria);
}

