package com.edental.appointmentservice.controller;

import com.edental.appointmentservice.model.Appointment;
import com.edental.appointmentservice.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class AppointmentController {
    @Autowired
    AppointmentService appointmentService;

    @GetMapping("list")
    public List<Appointment> getAppoint(){
      return   appointmentService.findAll();
    }

    @PostMapping ("new")
    public Appointment newAppointment(@RequestBody Appointment appointment){
        return   appointmentService.saveAppointment(appointment);
    }
    @DeleteMapping ("delete/{appId}")
    public void deleteAppointment(@PathVariable Long appId){
           appointmentService.cancelAppointment(appId);
    }
}
