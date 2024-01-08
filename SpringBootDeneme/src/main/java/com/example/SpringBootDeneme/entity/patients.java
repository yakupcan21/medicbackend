package com.example.SpringBootDeneme.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import java.util.Date;

@Getter
@Setter
@Entity
@Data
@Table(name = "patients")
public class patients { // Renamed class to follow Java naming conventions

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long patientId;
    private String patientName;
    private String patientSurname;
    private Date patientDateOfBirth; // Use Date or LocalDate for dateOfBirth
    private String patientPhoneNo; // Change data type to String
    private String patientEmail;
    private String patientPassword;
    private int patientAge;
    private int patientHeight;
    private int patientWeight;
    private float patientBmi;

    @OneToOne(mappedBy = "patient", cascade = CascadeType.ALL)
    private reports report;

    public patients() {
        super();
    }

    public patients(String patientName, String patientSurname, Date patientDateOfBirth, String patientPhoneNo,
                    String patientEmail, String patientPassword, int patientAge, int patientHeight, int patientWeight, int patientBmi) {
        this.patientName = patientName;
        this.patientSurname = patientSurname;
        this.patientDateOfBirth = patientDateOfBirth;
        this.patientPhoneNo = patientPhoneNo;
        setPatientPassword(patientPassword);
        this.patientEmail = patientEmail;
        this.patientAge = patientAge;
        this.patientHeight = patientHeight;
        this.patientWeight = patientWeight;
        this.patientBmi = patientBmi;
    }

    public void setPatientPassword(String plainPassword) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        this.patientPassword = passwordEncoder.encode(plainPassword);
    }
}
