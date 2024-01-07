package com.example.medic.entity;

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
    @GeneratedValue
    private long id;
    private String imgName;

    @Lob
    private byte[] data;

    @OneToOne
    private reports reports;


}
