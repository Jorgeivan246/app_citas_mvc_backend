package com.example.cita.model.mapper;

import com.example.cita.model.dto.PersonDTO;
import com.example.cita.model.entity.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;




@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface PersonDTOMapper {


    @Mapping(source = "name", target = "name")
    @Mapping(source = "email", target = "email")

    PersonDTO toDTO(Person domain);


}

