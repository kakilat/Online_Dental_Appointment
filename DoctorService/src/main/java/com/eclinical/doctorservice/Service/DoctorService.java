package com.eclinical.doctorservice.Service;



import com.eclinical.doctorservice.model.Doctor;
import com.eclinical.doctorservice.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DoctorService {
    @Autowired(required = false)
    private DoctorRepository doctorRepository;

public List<Doctor> getAllDoctors(){

    return doctorRepository.findAll();
}
public Doctor addDoctor(Doctor doctor){
    return doctorRepository.save(doctor);

}
public Doctor findById(Long doctorId){
    return doctorRepository.findById(doctorId).orElse(null);
}
 public void deleteDoctor(Long doctorId){
    Doctor newDoctor=findById(doctorId);
  doctorRepository.delete(newDoctor);
 }
public Doctor updateDoctor(Doctor doctor){
    Doctor doctor1=findById(doctor.getId());
    doctor1.setEmail(doctor.getEmail());
    doctor1.setPassword(doctor.getPassword());
    return doctorRepository.save(doctor1);
}
}
