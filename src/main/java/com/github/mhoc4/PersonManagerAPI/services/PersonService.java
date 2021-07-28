package com.github.mhoc4.PersonManagerAPI.services;

import com.github.mhoc4.PersonManagerAPI.dto.PersonDTO;
import com.github.mhoc4.PersonManagerAPI.entity.Person;
import com.github.mhoc4.PersonManagerAPI.exceptions.PersonNotFoundException;
import com.github.mhoc4.PersonManagerAPI.mapper.PersonMapper;
import com.github.mhoc4.PersonManagerAPI.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    private final PersonMapper personMapper = PersonMapper.INSTANCE;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    private Person verifyIfExists(Long id) throws PersonNotFoundException {
        return personRepository.findById(id)
                .orElseThrow(() -> new PersonNotFoundException(id));
    }

    public List<PersonDTO> findAll() {
        List<Person> allPeople = personRepository.findAll();
        return allPeople.stream()
                .map(personMapper::toDTO)
                .collect(Collectors.toList());
    }

    public PersonDTO findById(Long id) throws PersonNotFoundException {
        Person person = verifyIfExists(id);
        return personMapper.toDTO(person);
    }

    public void createPerson(PersonDTO personDTO) {
        Person personToSave = personMapper.toModel(personDTO);
        personRepository.save(personToSave);
    }

    public void delete(Long id) throws PersonNotFoundException {
        verifyIfExists(id);
        personRepository.deleteById(id);
    }
}
