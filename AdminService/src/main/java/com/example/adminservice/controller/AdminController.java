package com.example.adminservice.controller;



import com.example.adminservice.Service.AdminService;
import com.example.adminservice.model.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin(allowedHeaders = "*")
@RequestMapping("/admin")
public class AdminController {
   @Autowired
    private AdminService doctorService;

   @GetMapping("/all")
    public List<Doctor> getAllDoctors(){
        return doctorService.getAllDoctors();
    }

     @PostMapping("/add")
    public Doctor addDoctor(@RequestBody Doctor doctor){
        return doctorService.addDoctor(doctor);

    }
    @GetMapping("/findById/{doctorId}")
    public Doctor findById(@PathVariable Long doctorId){
        return doctorService.findById(doctorId);
    }
    @DeleteMapping("/delete/{doctorId}")
    public void deleteDoctor(@PathVariable Long doctorId){

        doctorService.deleteDoctor(doctorId);
    }

    @PutMapping("/update")
    public Doctor updateEmployee(@RequestBody Doctor doctor){
      return doctorService.updateDoctor(doctor);
    }
}
