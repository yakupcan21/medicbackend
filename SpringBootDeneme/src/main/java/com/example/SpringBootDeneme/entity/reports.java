package com.example.SpringBootDeneme.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

@Setter
@Getter
@Entity
@Data
@Table(name = "reports")
public class reports {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private String rapDate;
    private long rapNum;
    private String doctorName;

    @OneToOne
    private patients patient;

    @OneToOne(mappedBy = "reports", cascade = CascadeType.ALL)
    private createReport createReport;

    public reports() {
        super();
    }

    public reports(String rapDate, long rapNum, String doctorName) {
        this.rapDate = rapDate;
        this.rapNum = rapNum;
        this.doctorName = doctorName;
    }

    public void generateRandomRapNum() {
        Random random = new Random();
        this.rapNum = (long) (random.nextDouble() * 10000000000L);
    }

    public void setCurrentDate() {
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.rapDate = currentDate.format(formatter);
    }
}
