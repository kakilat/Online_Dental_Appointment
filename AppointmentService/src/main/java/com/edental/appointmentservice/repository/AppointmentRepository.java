package com.edental.appointmentservice.repository;

import com.edental.appointmentservice.model.Appointment;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AppointmentRepository extends JpaRepository<Appointment,Long> {

    @Query(
            value = "SELECT u from Appointment u where u.userId=:userId"
    )
    public List<Appointment> findAppointmentByUserId(Long userId);
    @Query(
            value = "SELECT u from Appointment u where u.userId=:DoctorId"
    )
    public  List<Appointment> fincAppointentByDoctorId(long DoctorId);
}
