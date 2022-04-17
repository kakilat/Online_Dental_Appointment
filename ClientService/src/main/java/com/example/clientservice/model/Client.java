package com.example.clientservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;




import javax.persistence.Entity;
import javax.persistence.Id;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
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
