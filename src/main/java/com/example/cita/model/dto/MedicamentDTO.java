package com.example.cita.model.dto;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
public class MedicamentDTO {

    private Integer id;

    private String name;

    private boolean getMedication;

    private double coPay;


}
