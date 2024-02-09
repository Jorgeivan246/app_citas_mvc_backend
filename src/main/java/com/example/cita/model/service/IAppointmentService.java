package com.example.cita.model.service;

import com.example.cita.model.dto.AppointmentDTO;
import com.example.cita.model.dto.PersonDTO;
import com.example.cita.model.dto.request.AppointmentRequest;
import com.example.cita.model.dto.request.PersonRequest;

public interface IAppointmentService {


    AppointmentDTO create(AppointmentRequest appointmentRequest);



}
