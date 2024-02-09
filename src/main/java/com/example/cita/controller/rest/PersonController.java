package com.example.cita.controller.rest;


import com.example.cita.model.dto.PersonDTO;
import com.example.cita.model.dto.request.PersonRequest;
import com.example.cita.model.entity.Person;
import com.example.cita.model.service.IPersonService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/person")
public class PersonController {

        private final IPersonService personService;


    public PersonController(IPersonService personService) {
        this.personService = personService;
    }

    @PostMapping()
    public PersonDTO create(@RequestBody PersonRequest personRequest)
    {

        return personService.create(personRequest);
    }

    @PostMapping("/login")
    public PersonRequest validateLogin(@RequestBody PersonRequest userCredencials) throws Exception {

        System.out.println("ENTROOOO");

        return personService.getUser(userCredencials);
    }
}
