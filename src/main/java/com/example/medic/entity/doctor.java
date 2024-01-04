package com.example.medic.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Getter
@Setter
@Entity
@Table(name = "doctor")
public class doctor {
    @Id
    @GeneratedValue
    private long docId;
    @NotBlank(message = "Name is required")
    private String docName;
    @NotBlank(message = "Name is required")
    private String docSurname;
    @Temporal(TemporalType.DATE)
    private String docDateOfBirth;
    @NotBlank(message = "Phone number is required")
    @Size(min = 10, max = 15, message = "Phone number should be between 10 and 15 digits")
    private String docPhoneNo;

    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email format")
    private String docEmail;
    @NotBlank(message = "Password is required")
    private String docPassword;
    private int docAge;
    private int docHeight;
    private float docWeight;
    private float docBmi;
    private String docTitle;
    private String docDepartment;
    private String docHospital;

    public doctor() { super(); }

    public doctor(long docId, String docName, String docSurname, String docDateOfBirth, String docPhoneNo, String docEmail, String docPassword, int docAge, int docHeight, float docWeight, float docBmi, String docTitle, String docDepartment, String docHospital) {
        this.docId = docId;
        this.docName = docName;
        this.docSurname = docSurname;
        this.docDateOfBirth = docDateOfBirth;
        this.docPhoneNo = docPhoneNo;
        this.docEmail = docEmail;
        setDocPassword(docPassword);
        this.docAge = docAge;
        this.docHeight = docHeight;
        this.docWeight = docWeight;
        this.docBmi = docBmi;
        this.docTitle = docTitle;
        this.docDepartment = docDepartment;
        this.docHospital = docHospital;
    }

    public void setDocPassword(String plainPassword) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        this.docPassword = passwordEncoder.encode(plainPassword);
    }

}
