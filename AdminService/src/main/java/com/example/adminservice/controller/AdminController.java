package com.example.adminservice.controller;


import com.example.adminservice.Integretion.DoctorDTO;
import com.example.adminservice.Service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/admin")
public class AdminController {
   @Autowired
    private AdminService doctorService;

   @GetMapping("/all")
    public List<DoctorDTO> getAllDoctors(){
        return doctorService.getAllDoctors();
    }

@PostMapping("/add")
    public DoctorDTO addDoctor(@RequestBody DoctorDTO doctor){
        return doctorService.addDoctor(doctor);

    }
    @GetMapping("/findById/{doctorId}")
    public DoctorDTO findById(@PathVariable String doctorId){
        return doctorService.findById(doctorId);
    }
    @DeleteMapping("/delete/{doctorId}")
    public void deleteDoctor(@PathVariable String doctorId){

        doctorService.deleteDoctor(doctorId);
    }

    @PutMapping("/update")
    public void updateEmployee(@RequestBody DoctorDTO doctor){
       doctorService.updateDoctor(doctor);
    }
}
