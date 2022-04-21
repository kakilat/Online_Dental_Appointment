package com.eclinical.doctorservice.dataAccess;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor

public class AppointmentDAO {

      private  long appointmentId;

    private  long userId;

      private  long doctorId;

    private  String priscription;


         private  boolean approvedStatus;
         private String aooountmentDat;




}
