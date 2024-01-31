package com.example.cita.controller.rest;

import com.example.cita.model.dto.AppointmentDTO;
import com.example.cita.model.dto.request.AppointmentRequest;
import com.example.cita.model.service.IAppointmentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/appointment")
public class AppointmentController {


    private final IAppointmentService IAppointmentService;



    public AppointmentController(IAppointmentService iAppointmentService) {
        this.IAppointmentService = iAppointmentService;
    }

    @PostMapping()
    public AppointmentDTO create(@RequestBody AppointmentRequest appointmentRequest){


        return IAppointmentService.create(appointmentRequest);

    }


}
