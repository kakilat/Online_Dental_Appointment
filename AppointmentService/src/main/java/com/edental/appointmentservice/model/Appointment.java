package com.edental.appointmentservice.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.NotFound;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "appointments")
public class Appointment {
    @Id
    @Column(nullable = false, unique = true)
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
    private LocalDate aooountmentDat;



}
