package com.example.clientservice.controller;

import com.example.clientservice.Service.AppointmentService;
import com.example.clientservice.dataAccess.AppointmentDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/appointment")
public class AppointmentController {
    @Autowired
    AppointmentService appointmentService;



    @PostMapping("new/{userId}")
    public AppointmentDAO newAppointment(@PathVariable("userId")Long userId, @RequestBody AppointmentDAO appointmentDAO){
        return appointmentService.newAppointment(userId,appointmentDAO);
    }

    @PutMapping ("update/{userId}")
    public AppointmentDAO updateAppointment(@PathVariable("userId")Long userId, @RequestBody AppointmentDAO appointmentDAO){
        return appointmentService.updateAppointment(userId,appointmentDAO);
    }
    @DeleteMapping ("cancele/{userId}/{appointmentId}")
    public void canceleAppointment(@PathVariable("userId")Long userId,@PathVariable("appointmentId") Long appointmentId){
        appointmentService.deleteAppointment(appointmentId);
    }

}
