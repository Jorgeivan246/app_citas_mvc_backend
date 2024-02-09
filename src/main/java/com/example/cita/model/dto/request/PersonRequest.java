package com.example.cita.model.dto.request;

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
public class PersonRequest {

    private String name;


    private String email;

    private String username;

    private String password;

    private List<Medicament> medicaments;

    private List<Appointment> appointments;
}
