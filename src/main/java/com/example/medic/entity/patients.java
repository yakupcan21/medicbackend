package com.example.medic.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import javax.validation.constraints.*;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "patients")
public class patients { // Renamed class to follow Java naming conventions

    @Id
    @GeneratedValue
    private long patientId;

    @NotBlank(message = "Name is required")
    private String patientName;

    @NotBlank(message = "Surname is required")
    private String patientSurname;

    @Temporal(TemporalType.DATE)
    private Date patientDateOfBirth; // Use Date or LocalDate for dateOfBirth

    @NotBlank(message = "Phone number is required")
    @Size(min = 10, max = 15, message = "Phone number should be between 10 and 15 digits")
    private String patientPhoneNo; // Change data type to String

    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email format")
    private String patientEmail;

    @NotBlank(message = "Password is required")
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
