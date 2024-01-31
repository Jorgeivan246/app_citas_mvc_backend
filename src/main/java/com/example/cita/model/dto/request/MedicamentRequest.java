package com.example.cita.model.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class MedicamentRequest {


    private String name;

    private boolean getMedication;

    private double coPay;
}
