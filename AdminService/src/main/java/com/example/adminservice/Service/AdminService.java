package com.example.adminservice.Service;



import com.example.adminservice.Integretion.DoctorDTO;
import com.example.adminservice.repository.AdminRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AdminService {
    @Autowired(required = false)
    private AdminRepository doctorRepository;

public List<DoctorDTO > getAllDoctors(){

    return doctorRepository.findAll();
}
public DoctorDTO  addDoctor(DoctorDTO    doctor){
    return doctorRepository.save(doctor);

}
public DoctorDTO  findById(String doctorId){
    return doctorRepository.findById(doctorId).orElse(null);
}
 public void deleteDoctor(String doctorId){
    DoctorDTO  newDoctor=findById(doctorId);
  doctorRepository.delete(newDoctor);
 }
public DoctorDTO updateDoctor(DoctorDTO  doctor){
    return doctorRepository.save(doctor);
}
}
