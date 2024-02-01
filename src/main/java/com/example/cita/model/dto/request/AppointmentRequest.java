package com.example.cita.model.dto.request;

import lombok.*;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
public class AppointmentRequest {


    private String nameDoctor;

    private String adress;

    private String medicalSpeciality;

    private Date date;


}
