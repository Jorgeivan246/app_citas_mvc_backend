package com.example.cita.model.dto;

import lombok.*;

import java.util.Date;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
public class AppointmentDTO {


    private Long id;

    private String nameDoctor;

    private String adress;

    private String medicalSpeciality;

    private Date date;

    private boolean state;


}
