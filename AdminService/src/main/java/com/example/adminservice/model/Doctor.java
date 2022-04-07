package com.example.adminservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Doctor {
@Id
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String mobile;
    private String appointmentId;
    private LocalDate appointmentDate;
    private String diagnosis;
    private String prescription;
    private Address address;

}
