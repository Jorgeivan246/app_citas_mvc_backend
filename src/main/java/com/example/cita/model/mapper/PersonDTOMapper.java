package com.example.cita.model.mapper;

import com.example.cita.model.dto.PersonDTO;
import com.example.cita.model.entity.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.springframework.context.annotation.Configuration;



@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface PersonDTOMapper {

    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "email", target = "email")
    PersonDTO toPerson(Person domain);


}

