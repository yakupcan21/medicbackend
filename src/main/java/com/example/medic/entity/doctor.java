package com.example.medic.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "doctor")
public class doctor {
    //Will be accessed through admin page and adding/removal of doctor
    //                    will be made through the admin panel
    @Id
    @GeneratedValue
    private long docId;
    private String docName;
    private String docSurname;
    private String docDateOfBirth;
    private long docPhoneNo;
    private String docPassword;
    private int docAge;
    private int docHeight;
    private float docWeight;
    private float docBmi;
    private String docTitle;
    private String docDepartment;
    private String docHospital;

    public doctor() { super(); }

    public doctor(long docId, String docName, String docSurname, String docDateOfBirth, long docPhoneNo, String docPassword, int docAge, int docHeight, float docWeight, float docBmi, String docTitle, String docDepartment, String docHospital) {
        this.docId = docId;
        this.docName = docName;
        this.docSurname = docSurname;
        this.docDateOfBirth = docDateOfBirth;
        this.docPhoneNo = docPhoneNo;
        this.docPassword = docPassword;
        this.docAge = docAge;
        this.docHeight = docHeight;
        this.docWeight = docWeight;
        this.docBmi = docBmi;
        this.docTitle = docTitle;
        this.docDepartment = docDepartment;
        this.docHospital = docHospital;

    }

}
