package com.example.adminservice.repository;


import com.example.adminservice.Integretion.DoctorDTO;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AdminRepository extends MongoRepository<DoctorDTO,String> {
}
