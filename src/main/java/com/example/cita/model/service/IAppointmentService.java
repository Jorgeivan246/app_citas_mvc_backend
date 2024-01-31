package com.example.cita.model.service;

import com.example.cita.model.dto.AppointmentDTO;
import com.example.cita.model.dto.request.AppointmentRequest;

public interface IAppointmentService {


    AppointmentDTO create(AppointmentRequest appointmentRequest);

}
