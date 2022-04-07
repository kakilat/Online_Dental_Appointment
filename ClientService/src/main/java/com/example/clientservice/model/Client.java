package com.example.clientservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Client {

    @Id
    private String id;
    private String firstName;
    private String lastName;
    private Integer age;
    private String email;
    private String password;
    private String prescription;
    private Boolean isConfirmed=false;
    //private Address address;
}
