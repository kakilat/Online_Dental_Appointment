package com.example.clientservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Controller;


import javax.persistence.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Nullable
    @Column(name = "client_id")
    private Long id;
    @Nullable
    @Column(name = "first_name")
    private String firstName;
    @Nullable
    @Column(name = "last_name")
    private String lastName;

    @Column(name = "age")
    private Integer age;
    @Nullable
    @Column(name = "email")
    private String email;
    @Nullable
    @Column(name = "password")
    private String password;


}
