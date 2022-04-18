package com.edental.appointmentservice.service.IMPL;

import com.edental.appointmentservice.model.Appointment;
import com.edental.appointmentservice.repository.AppointmentRepository;
import com.edental.appointmentservice.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentServiceImple implements AppointmentService {
    @Autowired
    AppointmentRepository appointmentRepository;
    @Override
    public Appointment saveAppointment(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }

    @Override
    public Appointment updateAppointment(long appointmentId,Appointment appointment) {
        Appointment oldAppointment =appointmentRepository.findById(appointmentId).orElse(null);
        appointment.setApprovedStatus(oldAppointment.isApprovedStatus());
        return appointmentRepository.save(appointment);
    }

    @Override
    public void cancelAppointment(long appointmentId) {
        appointmentRepository.delete(findAppointmentById(appointmentId));
    }

    @Override
    public List<Appointment> findAppointmentByUserId(Long userId) {
        return appointmentRepository.findAppointmentByUserId(userId);
    }

    @Override
    public List<Appointment> fincAppointentByDoctorId(long doctorId) {
        return appointmentRepository.fincAppointentByDoctorId(doctorId);
    }

    @Override
    public Appointment updateStatus(long appointmentId,Appointment appointment) {
        Appointment oldAppointment=findAppointmentById(appointmentId);
        oldAppointment.setApprovedStatus(appointment.isApprovedStatus());
        return appointmentRepository.save(oldAppointment);
    }

    @Override
    public Appointment findAppointmentById(long appointmentId) {
        return appointmentRepository.findById(appointmentId).orElse(null);
    }
}
