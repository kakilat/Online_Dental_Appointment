package com.edental.appointmentservice.service;

import com.edental.appointmentservice.model.Appointment;

import java.util.List;

public interface AppointmentService {
    public Appointment saveAppointment(Appointment appointment);
    public  Appointment updateAppointment(long appointmentid,Appointment appointment);
    public  void  cancelAppointment(long appointmentId);
    public List<Appointment> findAppointmentByUserId(Long userId);
    public  List<Appointment> fincAppointentByDoctorId(long DoctorId);
    public  Appointment updateStatus(long appointmentId,Appointment appointment);
    public  Appointment findAppointmentById(long appointmentId);


}
