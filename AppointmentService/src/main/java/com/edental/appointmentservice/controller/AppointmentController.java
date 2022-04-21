package com.edental.appointmentservice.controller;

import com.edental.appointmentservice.model.Appointment;
import com.edental.appointmentservice.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/appointment")
public class AppointmentController {
    @Autowired
    AppointmentService appointmentService;

    @GetMapping ("doctor/{doctorId}")
    public List<Appointment> appointmentByDoctor(@PathVariable("doctorId")Long doctorId){
      return   appointmentService.fincAppointentByDoctorId(doctorId);
    }
    @GetMapping ("patient/{patientId}")
    public List<Appointment> appointmentsByPatientId(@PathVariable("patientId")Long patientId){
        return   appointmentService.findAppointmentByUserId(patientId);
    }
}
