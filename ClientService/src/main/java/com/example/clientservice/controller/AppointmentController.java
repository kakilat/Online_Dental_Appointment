package com.example.clientservice.controller;

import com.example.clientservice.Service.AppointmentService;
import com.example.clientservice.dataAccess.AppointmentDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client/appointment")
public class AppointmentController {
    @Autowired
    AppointmentService appointmentService;
    @Autowired
    AppointmentFeighClient appointmentFeighClient;


    @PostMapping("new/{userId}")
    public AppointmentDAO newAppointment(@PathVariable("userId")Long userId, @RequestBody AppointmentDAO appointmentDAO){
        return appointmentService.newAppointment(userId,appointmentDAO);
    }

    @PutMapping ("/update/{userId}")
    public AppointmentDAO updateAppointment(@PathVariable("userId")Long userId, @RequestBody AppointmentDAO appointmentDAO){
        return appointmentService.updateAppointment(userId,appointmentDAO);
    }
    @DeleteMapping ("/cancele/{userId}/{appointmentId}")
    public void canceleAppointment(@PathVariable("userId")Long userId,@PathVariable("appointmentId") Long appointmentId){
        appointmentService.deleteAppointment(appointmentId);
    }
    @GetMapping ("/all/{patientId}")
    public List<AppointmentDAO> getAllAppointmentById(@PathVariable("patientId")Long userId){
       return appointmentFeighClient.appointmentsByPatientId(userId);
    }


@FeignClient(name = "AppointmentService")
public interface AppointmentFeighClient{
    @GetMapping ("appointment/patient/{patientId}")
        public List<AppointmentDAO> appointmentsByPatientId(@PathVariable("patientId")Long patientId);

}
}
