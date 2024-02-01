package com.example.cita.model.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
public class PersonDTO {



    private Long id;

    private String name;


    private String email;

}
