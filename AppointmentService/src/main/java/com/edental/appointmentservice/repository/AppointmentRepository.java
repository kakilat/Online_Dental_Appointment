package com.edental.appointmentservice.repository;

import com.edental.appointmentservice.model.Appointment;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AppointmentRepository extends JpaRepository<Appointment,Long> {

    @Query(value = "SELECT u FROM Appointment u where u.userId=:userId")
    public List<Appointment> findAppointmentByUserId(@Param("userId") Long userId);


    @Query(value = "SELECT u from Appointment u where u.doctorId=:DoctorId")
    public  List<Appointment> finAppointmentsByDoctorId(@Param("DoctorId") Long DoctorId);
}
