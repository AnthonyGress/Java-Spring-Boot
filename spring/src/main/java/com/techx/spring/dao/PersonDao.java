package com.techx.spring.dao;

import java.util.List;
import java.util.UUID;

import com.techx.spring.model.Person;

public interface PersonDao {

    int insertPerson(UUID id, Person person);

    default int insertPerson(Person person){
        UUID id = UUID.randomUUID();
        return insertPerson(id, person);
    }

    List<Person> selectAllPeople();
}
