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
    public Doctor findById(@PathVariable String doctorId){
        return doctorService.findById(doctorId);
    }


    @PutMapping("/update")
    public void updateEmployee(@RequestBody Doctor doctor){
       doctorService.updateDoctor(doctor);
    }
}
