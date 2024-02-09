package com.example.cita.model.dto;

import com.example.cita.model.entity.Appointment;
import com.example.cita.model.entity.Medicament;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
public class PersonDTO {





    private String name;


    private String email;

    private String username;


    private List<Medicament> medicaments;

    private List<Appointment> appointments;

}
