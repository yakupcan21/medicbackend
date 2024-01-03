package com.example.medic.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name = "createReports")
@AllArgsConstructor
@NoArgsConstructor

public class createReport {
    
    @Id
    @GeneratedValue
    private long id;
    private String imgName;

    @Lob
    private byte[] data;

    @OneToOne
    private reports reports;


}
