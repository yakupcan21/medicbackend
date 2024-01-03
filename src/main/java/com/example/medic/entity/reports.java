package com.example.medic.entity;

import jakarta.persistence.*;
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

    @OneToOne(mappedBy = "reports", cascade = CascadeType.ALL)
    private createReport createReport;

    public reports() { super(); }

    public reports(String rapDate, long rapNum, String doctorName) {
        this.rapDate = rapDate;
        this.rapNum = rapNum;
        this.doctorName = doctorName;
    }



}
