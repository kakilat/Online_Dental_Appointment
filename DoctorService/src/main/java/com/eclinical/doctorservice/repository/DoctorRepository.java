package com.eclinical.doctorservice.repository;

import com.eclinical.doctorservice.model.Doctor;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DoctorRepository extends JpaRepository<Doctor,Long> {
}
