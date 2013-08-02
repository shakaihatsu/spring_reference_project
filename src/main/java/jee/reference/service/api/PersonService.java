package jee.reference.service.api;

import java.util.List;

import spring.reference.exception.RecordNotFoundException;
import spring.reference.exception.RestClientCallException;
import spring.reference.model.Person;
import spring.reference.model.dto.PersonDto;

public interface PersonService {
    List<Person> getAllPersons();

    Person getPerson(Long personId) throws RecordNotFoundException;

    Long createPerson(Person person);

    Person updatePerson(Long personId, Person person);

    List<PersonDto> getAllPersonData();

    PersonDto getPersonData(Long personId);

    PersonDto getPersonThroughRestClient(Long personId) throws RestClientCallException;

}