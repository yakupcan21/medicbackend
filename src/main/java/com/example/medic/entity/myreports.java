package com.example.medic.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class myreports {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String surname;

    private String dateOfBirth;

    private Long phoneNo;

    private String password;

    public myreports() { super(); }

    public myreports(Long id, String name, String surname, String dateOfBirth, Long phoneNo, String password ) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.phoneNo = phoneNo;
        this.password = password;
    }


}
