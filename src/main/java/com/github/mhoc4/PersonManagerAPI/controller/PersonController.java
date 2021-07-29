package com.github.mhoc4.PersonManagerAPI.controller;

import com.github.mhoc4.PersonManagerAPI.dto.PersonDTO;

import com.github.mhoc4.PersonManagerAPI.exceptions.PersonNotFoundException;
import com.github.mhoc4.PersonManagerAPI.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("/api/v1/people")
public class PersonController {

    private PersonService personService;

    @Autowired
    public PersonController (PersonService personService) {
        this.personService = personService;
    }

    @GetMapping
    public List<PersonDTO> findAll() {
        return personService.findAll();
    }

    @GetMapping("/{id}")
    public PersonDTO findById(@PathVariable Long id) throws PersonNotFoundException {
        return personService.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createPerson(@Valid @RequestBody PersonDTO personDTO) {
        personService.createPerson(personDTO);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable Long id) throws PersonNotFoundException {
        personService.delete(id);
    }

}
