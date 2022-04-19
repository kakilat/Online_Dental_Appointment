package com.edental.appointmentservice.Integration;


import com.edental.appointmentservice.model.Appointment;
import com.edental.appointmentservice.service.AppointmentService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service

public class Listener {

    @Autowired
    private AppointmentService appointmentService;


    @KafkaListener(topics = {"appointment"})
    public void handleListener(@Payload String messageString){
        ObjectMapper objectMapper = new ObjectMapper();

        try {
          Message message = objectMapper.readValue(messageString ,  Message.class);

             if(message.getCommand().equals("newAppointment")){
                  Message<Appointment> newAppointment = objectMapper.readValue(messageString  ,
                         new TypeReference< Message<Appointment>>() {}
                 );
                 Appointment appointment = newAppointment.getMessage();
                appointmentService.saveAppointment(appointment);
            }
//            if(message.getCommand().equals("newTestKafka")){
//                Message<String> newAppointment = objectMapper.readValue(messageString  ,
//                        new TypeReference< Message<String>>() {
//                        }
//                );
//                String appointment = newAppointment.getMessage();
//                System.out.println(appointment+"RECIVED ");
//
//            }
            if(message.getCommand().equals("updateAppointment")){
                Message<Appointment> newAppointment = objectMapper.readValue(messageString  ,
                        new TypeReference< Message<Appointment>>() {

                        }
                );
                Appointment appointment = newAppointment.getMessage();
            appointmentService.updateAppointment(appointment.getAppointmentId(),appointment);
            }
            if(message.getCommand().equals("canceleAppointment")){
                Message<Long> newAppointment = objectMapper.readValue(messageString  ,
                        new TypeReference< Message<Long>>() {

                        }
                );
                Long appointment = newAppointment.getMessage();
                appointmentService.cancelAppointment(appointment);
                System.out.println("Message Recived");

            }


        } catch (JsonProcessingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }



}
