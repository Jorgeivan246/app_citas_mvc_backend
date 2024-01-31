package com.example.cita.model.mapper;


import com.example.cita.model.dto.AppointmentDTO;
import com.example.cita.model.entity.Appointment;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;


@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface AppointmentDTOMapper {
    @Mapping(source = "id", target = "id")
    @Mapping(source = "nameDoctor", target = "nameDoctor")
    @Mapping(source = "adress", target = "adress")
    @Mapping(source = "medicalSpeciality", target = "medicalSpeciality")
    @Mapping(source = "date", target = "date")
    AppointmentDTO toDto(Appointment domain);
}

