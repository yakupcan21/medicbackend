package com.example.medic.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.math.BigInteger;

@Getter
@Setter
@Entity
@Table(name = "patients")
public class patients {
    @Id
    @GeneratedValue
    private long patientId;
    private String patientName;
    private String patientSurname;
    private String patientDateOfBirth;
    private long patientPhoneNo;
    private String patientEmail;
    private String patientPassword;
    private int patientAge;
    private int patientHeight;
    private float patientWeight;
    private float patientBmi;

    @OneToOne(mappedBy = "patient", cascade = CascadeType.ALL)
    private reports report;

    public patients() { super(); }

    public patients(long patientId, String patientName, String patientSurname, String patientDateOfBirth, long patientPhoneNo, String patientEmail, String patientPassword, int patientAge, int patientHeight, int patientWeight, int patientBmi ) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.patientSurname = patientSurname;
        this.patientDateOfBirth = patientDateOfBirth;
        this.patientPhoneNo = patientPhoneNo;
        setPatPassword(patientPassword);
        this.patientEmail = patientEmail;
        this.patientPassword = patientPassword;
        this.patientAge = patientAge;
        this.patientHeight = patientHeight;
        this.patientWeight = patientWeight;
        this.patientBmi = patientBmi;
    }

    public void setPatPassword(String plainPassword) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        this.patientPassword = passwordEncoder.encode(plainPassword);
    }
}
