package com.example.clientservice.Service;

import com.example.clientservice.Integration.Message;
import com.example.clientservice.Integration.Sender;
import com.example.clientservice.dataAccess.AppointmentDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class AppointmentService {
@Autowired
    Sender sener;
//    public String  testKafka( ){
//        Message<String> testMessage =
//                new Message<String>(
//                        "newTestKafka","THIS MESSAGE IS FOR TEST"
//                );
//        sener.send(testMessage);
//        return "Testing";
//
//    }
    public AppointmentDAO newAppointment(long customerId, AppointmentDAO appointmentDAO){
        appointmentDAO.setUserId(customerId);
        Message<AppointmentDAO> newAppointment =
                new Message<AppointmentDAO>(
                        "newAppointment",appointmentDAO

                );
        sener.send(newAppointment);
        return appointmentDAO;

    }

    public AppointmentDAO updateAppointment(long customerId, AppointmentDAO appointmentDAO){
        appointmentDAO.setAppointmentId(customerId);
        Message<AppointmentDAO> updateAppointment =
                new Message<AppointmentDAO>(
                        "updateAppointment",appointmentDAO

                );
        sener.send(updateAppointment);
        return appointmentDAO;

    }
    public void deleteAppointment(Long appointmentId){

        Message<Long> deleteAppointment =
                new Message<Long>(
                        "canceleAppointment",appointmentId

                );
        sener.send(deleteAppointment);


    }




}
