package com.example.SpringBootDeneme.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="doctor")
public class Doctor {
    @Id
    private long id;
    private String name;
}
