package com.eclinical.doctorservice.repository;

import com.eclinical.doctorservice.model.Doctor;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DoctorRepository extends MongoRepository<Doctor,String> {
}
