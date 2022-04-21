package com.eclinical.doctorservice.controller;

import com.eclinical.doctorservice.Service.DoctorService;
import com.eclinical.doctorservice.model.Doctor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/doctor")
public class DoctorController {
   @Autowired
    private DoctorService doctorService;


    @GetMapping("/findById/{doctorId}")
    public Doctor findById(@PathVariable Long doctorId){
        return doctorService.findById(doctorId);
    }


    @PutMapping("/update")
    public Doctor updateEmployee(@RequestBody Doctor doctor){
       return doctorService.updateDoctor(doctor);
    }
}
