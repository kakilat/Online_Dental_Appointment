package com.example.adminservice.Service;



import com.example.adminservice.model.Doctor;
import com.example.adminservice.repository.AdminRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AdminService {
    @Autowired(required = false)
    private AdminRepository doctorRepository;

public List<Doctor> getAllDoctors(){

    return doctorRepository.findAll();
}
public Doctor  addDoctor(Doctor    doctor){
    return doctorRepository.save(doctor);

}
public Doctor  findById(Long doctorId){
    return doctorRepository.findById(doctorId).orElse(null);
}
 public void deleteDoctor(Long doctorId){
     Doctor  newDoctor=findById(doctorId);
  doctorRepository.delete(newDoctor);
 }
public Doctor updateDoctor(Doctor  doctor){
    return doctorRepository.save(doctor);
}
}
