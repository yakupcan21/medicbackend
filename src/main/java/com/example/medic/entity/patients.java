package com.example.medic.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "patients")
public class patients {
    @Id
    @GeneratedValue
    private String patientName;
    private String patientId;
    private String lastVisit;
    private int reportNum;


    public patients() { super(); }

    public patients(String patientName, String patientId, String lastVisit, int reportNum) {
        this.patientName = patientName;
        this.patientId = patientId;
        this.lastVisit = lastVisit;
        this.reportNum = reportNum;
    }

}