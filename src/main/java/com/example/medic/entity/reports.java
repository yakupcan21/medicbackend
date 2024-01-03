package com.example.medic.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "reports")
public class reports {
    @Id
    @GeneratedValue
    private String rapDate;
    private long rapNum;
    private String doctorName;

    @OneToOne
    private patients patient;

    public reports() { super(); }

    public reports(String rapDate, long rapNum, String doctorName) {
        this.rapDate = rapDate;
        this.rapNum = rapNum;
        this.doctorName = doctorName;
    }
}
