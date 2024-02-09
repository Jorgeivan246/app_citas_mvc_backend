package com.example.cita.model.service.impl;

import com.example.cita.model.dto.AppointmentDTO;
import com.example.cita.model.dto.request.AppointmentRequest;
import com.example.cita.model.mapper.AppointmentDTOMapper;
import com.example.cita.model.mapper.AppointmentRequestMapper;
import com.example.cita.model.repository.AppointmentRepository;
import com.example.cita.model.service.IAppointmentService;

import org.springframework.stereotype.Service;


@Service

public class AppointmentImpl implements IAppointmentService {


    private final AppointmentRequestMapper appointmentRequestMapper;


    private final AppointmentRepository appointmentRepository;

    private final AppointmentDTOMapper appointmentDTOMapper;

    public AppointmentImpl(AppointmentRequestMapper appointmentRequestMapper, AppointmentRepository appointmentRepository, AppointmentDTOMapper appointmentDTOMapper) {
        this.appointmentRequestMapper = appointmentRequestMapper;
        this.appointmentRepository = appointmentRepository;
        this.appointmentDTOMapper = appointmentDTOMapper;
    }



    @Override
    public AppointmentDTO create(AppointmentRequest request) {

        var newAppointmentRequest= appointmentRequestMapper.toDomain(request);


        newAppointmentRequest.setInitialValues();



        var createdAppointment = appointmentRepository.save(newAppointmentRequest);



      return appointmentDTOMapper.toDto(createdAppointment);


    }




}
