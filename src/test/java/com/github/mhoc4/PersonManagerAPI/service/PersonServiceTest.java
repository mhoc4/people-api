package com.github.mhoc4.PersonManagerAPI.service;

import com.github.mhoc4.PersonManagerAPI.dto.mapper.PersonMapper;
import com.github.mhoc4.PersonManagerAPI.dto.request.PersonDTO;
import com.github.mhoc4.PersonManagerAPI.dto.response.MessageResponseDTO;
import com.github.mhoc4.PersonManagerAPI.entity.Person;
import com.github.mhoc4.PersonManagerAPI.repository.PersonRepository;
import com.github.mhoc4.PersonManagerAPI.services.PersonService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static com.github.mhoc4.PersonManagerAPI.utils.PersonUtils.createFakeDTO;
import static com.github.mhoc4.PersonManagerAPI.utils.PersonUtils.createFakeEntity;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class PersonServiceTest {

    @Mock
    private PersonRepository personRepository;

    @Mock
    private PersonMapper personMapper;

    @InjectMocks
    private PersonService personService;

    @Test
    void testGivenPersonDTOThenReturnSuccessSavedMessage() {
        PersonDTO personDTO = createFakeDTO();
        Person expectedSavedPerson = createFakeEntity();

        when(personRepository.save(any(Person.class))).thenReturn(expectedSavedPerson);

        MessageResponseDTO expectedSuccessMessage = createExpectedSuccessMessage(expectedSavedPerson.getId());
        MessageResponseDTO successMessage = personService.createPerson(personDTO);

        assertEquals(expectedSuccessMessage, successMessage);
    }

    private MessageResponseDTO createExpectedSuccessMessage(Long savedPersonId) {
        return MessageResponseDTO.builder()
                .message("Created person with ID " + savedPersonId)
                .build();
    }

}
