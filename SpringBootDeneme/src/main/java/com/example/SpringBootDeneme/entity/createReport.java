package com.example.SpringBootDeneme.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "createReport")

public class createReport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String imgName;

    @Lob
    private byte[] data;

    @OneToOne
    private reports reports;


}
