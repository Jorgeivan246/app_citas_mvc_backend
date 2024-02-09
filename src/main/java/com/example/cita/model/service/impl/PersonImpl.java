package com.example.cita.model.service.impl;

import com.example.cita.model.dto.PersonDTO;
import com.example.cita.model.dto.request.PersonRequest;
import com.example.cita.model.mapper.PersonDTOMapper;
import com.example.cita.model.mapper.PersonRequestMapper;
import com.example.cita.model.repository.PersonRepository;
import com.example.cita.model.service.IPersonService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PersonImpl implements IPersonService {


    private final PersonRequestMapper personRequestMapper;

    private final PersonRepository personRepository;

    private final PersonDTOMapper personDTOMapper;

    public PersonImpl(PersonRequestMapper personRequestMapper, PersonRepository personRepository, PersonDTOMapper personDTOMapper) {
        this.personRequestMapper = personRequestMapper;
        this.personRepository = personRepository;
        this.personDTOMapper = personDTOMapper;
    }


    @Override
    public PersonDTO create(PersonRequest request) {

       var newPersonRequest= personRequestMapper.toDomain(request);

        var personSaved = personRepository.save(newPersonRequest);



        return personDTOMapper.toDTO(personSaved);
    }

    @Override
    public PersonRequest getUser(PersonRequest personRequest) throws Exception {

        var email=personRequest.getEmail();

        var password=personRequest.getPassword();

            Optional<PersonRequest> person =        personRepository.findByEmailAndPassword(email,password);


        if (person.isEmpty()){
            throw new Exception("Los datos de autenticación son incorrectos");
        }



        return person.get();
    }
}
