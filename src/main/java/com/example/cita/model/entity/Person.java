package com.example.cita.model.entity;


import jakarta.persistence.*;
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
public class Person implements Serializable {

    @Id
    private Long id;

    private String name;


    private String email;

    @ManyToMany(mappedBy = "person")
    private List<Medicament> medicaments;

    @OneToMany(mappedBy = "person")
    private List<Appointment> appointments;

}
