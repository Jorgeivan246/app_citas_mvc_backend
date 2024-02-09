package com.example.cita.model.mapper;


import com.example.cita.model.dto.PersonDTO;

import com.example.cita.model.dto.request.PersonRequest;
import com.example.cita.model.entity.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;


@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface PersonRequestMapper {


    @Mapping(source = "name", target = "name")
    @Mapping(source = "email", target = "email")
    @Mapping(source = "password", target = "password")
    Person toDomain(PersonRequest request);

}

