package com.example.cita.model.repository;

import com.example.cita.model.dto.request.PersonRequest;
import com.example.cita.model.entity.Appointment;
import com.example.cita.model.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PersonRepository extends JpaRepository<Person,Long> {

    Optional<PersonRequest> findByEmailAndPassword(String email, String password);

}
