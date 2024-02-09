package com.example.cita.model.service;

import com.example.cita.model.dto.PersonDTO;
import com.example.cita.model.dto.request.PersonRequest;

public interface IPersonService {

    PersonDTO create(PersonRequest personRequest);

    PersonRequest getUser(PersonRequest personRequest) throws Exception;
}
