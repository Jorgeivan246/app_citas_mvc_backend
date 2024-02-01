package com.example.cita.model.entity;

import jakarta.persistence.*;
import lombok.*;
import org.w3c.dom.Text;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
public class Appointment implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;

    private boolean state;

    private String nameDoctor;

    private String adress;

    private String medicalSpeciality;

    private Date date;

    @ManyToOne
    private Person person;

    @ManyToMany(mappedBy = "appointments")
    private List<Medicament> medicaments;

    public void setInitialValues() {

        this.state=false;

    }

}
