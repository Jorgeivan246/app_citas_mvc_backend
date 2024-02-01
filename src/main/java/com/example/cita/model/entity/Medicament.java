package com.example.cita.model.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
public class Medicament implements Serializable {


    @Id
    private Integer id;

    private String name;

    private boolean getMedication;

    private double coPay;


    @ManyToMany
    private List<Person> person;

    @ManyToMany
    private List<Appointment> appointments;


}
