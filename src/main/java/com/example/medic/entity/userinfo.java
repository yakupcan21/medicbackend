package com.example.medic.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class userinfo {

    @Id
    @GeneratedValue
    private boolean docOrPat;

    private String name;

    private String surname;

    private String fields;

    private String workPlace;

    private int age;

    private float weight;

    private int height;

    private float bmi;

    public userinfo() { super(); }

    public userinfo(boolean docOrPat, String name, String surname, String fields, String workPlace, int age, float wieght, int height, float bmi  ){
        this.docOrPat = docOrPat;
        this.name = name;
        this.surname = surname;
        this.fields = fields;
        this.workPlace = workPlace;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.bmi = bmi;
    }

}
