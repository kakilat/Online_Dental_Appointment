package com.example.adminservice.repository;




import com.example.adminservice.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AdminRepository extends JpaRepository<Doctor, Long> {
}
