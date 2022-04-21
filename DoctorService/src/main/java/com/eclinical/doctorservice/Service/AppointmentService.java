package com.eclinical.doctorservice.Service;



import com.eclinical.doctorservice.Integration.Message;
import com.eclinical.doctorservice.Integration.Sender;
import com.eclinical.doctorservice.dataAccess.AppointmentDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppointmentService {
@Autowired
Sender sener;



    public AppointmentDAO updateAppointment(Long customerId, AppointmentDAO appointmentDAO){

        Message<AppointmentDAO> updateAppointment =
                new Message<AppointmentDAO>(
                        "updateStatus",appointmentDAO

                );
        sener.send(updateAppointment);
        return appointmentDAO;
    }





}
