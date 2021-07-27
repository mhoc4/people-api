package com.github.mhoc4.PersonManagerAPI.services;

import com.github.mhoc4.PersonManagerAPI.dto.PersonDTO;
import com.github.mhoc4.PersonManagerAPI.entity.Person;
import com.github.mhoc4.PersonManagerAPI.mapper.PersonMapper;
import com.github.mhoc4.PersonManagerAPI.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    private final PersonMapper personMapper = PersonMapper.INSTANCE;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public List<PersonDTO> findAll() {
        List<Person> allPeople = personRepository.findAll();
        return allPeople.stream()
                .map(personMapper::toDTO)
                .collect(Collectors.toList());
    }

    public void createPerson(PersonDTO personDTO) {
        Person personToSave = personMapper.toModel(personDTO);
        personRepository.save(personToSave);
    }
}
