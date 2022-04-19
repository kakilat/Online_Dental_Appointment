package com.edental.appointmentservice.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.NotFound;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "appointments")
public class Appointment {

    @Column(nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private  long appointmentId;

    @Column(name = "patient_id",nullable = false)
    @NonNull()
    private  long userId;

    @Column(name = "doctor_id",nullable = false)
    @NonNull()
    private  long doctorId;

    @Column(name = "prescriprion",nullable = false)
    @NonNull()
    private  String priscription;

    @Column(name = "approved_status",nullable = false)
    @NonNull()
    private  boolean approvedStatus;

    @Column(name = "appointment_date",nullable = false)
    @NonNull()
    private String aooountmentDat;

//    public Appointment(long userId, long doctorId, @NonNull String priscription, boolean approvedStatus, @NonNull String aooountmentDat) {
//        this.userId = userId;
//        this.doctorId = doctorId;
//        this.priscription = priscription;
//        this.approvedStatus = approvedStatus;
//        this.aooountmentDat = aooountmentDat;
//    }
}
