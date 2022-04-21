package com.eclinical.doctorservice.controller;


import com.eclinical.doctorservice.Service.AppointmentService;
import com.eclinical.doctorservice.dataAccess.AppointmentDAO;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doctor/appointment")
public class AppointmentController {
    @Autowired
    AppointmentService appointmentService;
@Autowired
AppointmentFeighClient appointmentFeighClient;

    @GetMapping ("list/{doctorId}")
    public List<AppointmentDAO> getAppointmentById(@PathVariable("doctorId")long doctorId){
        return appointmentFeighClient.appointmentByDoctor(doctorId);
    }




    @PutMapping ("update/{doctorId}")
    public AppointmentDAO updateAppointment(@PathVariable("doctorId")long doctorId, @RequestBody AppointmentDAO appointmentDAO){
        return appointmentService.updateAppointment(doctorId,appointmentDAO);
    }

    @FeignClient(name = "AppointmentService")
    public interface AppointmentFeighClient{
        @GetMapping ("appointment/doctor/{doctorId}")
        public List<AppointmentDAO> appointmentByDoctor(@PathVariable("doctorId")Long doctorId);

    }



}
