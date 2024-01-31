package com.example.cita.model.mapper;



import com.example.cita.model.dto.request.AppointmentRequest;
import com.example.cita.model.entity.Appointment;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.springframework.context.annotation.Configuration;


@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface AppointmentRequestMapper {



    @Mapping(source = "nameDoctor", target = "nameDoctor")
    @Mapping(source = "adress", target = "adress")
    @Mapping(source = "medicalSpeciality", target = "medicalSpeciality")
    @Mapping(source = "date", target = "date")
    Appointment toDomain(AppointmentRequest request);
}


