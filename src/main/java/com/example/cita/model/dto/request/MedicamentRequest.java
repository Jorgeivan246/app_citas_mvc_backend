package com.example.cita.model.dto.request;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
public class MedicamentRequest {


    private String name;

    private boolean getMedication;

    private double coPay;
}
