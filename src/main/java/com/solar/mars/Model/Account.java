package com.solar.mars.Model;

import com.solar.mars.entity.Person;
import com.solar.mars.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Account {

    private Person person;
    @Autowired
    private PersonRepository repository;

    public Account(Person person, PersonRepository repository) {
        this.person = person;
        this.repository = repository;
    }

    public Account() {

    }

    public void saveTheEntry(PersonModel personModel) {
        Person person1 = new Person(personModel.getUserId(), personModel.getName(), personModel.getLastName());
        repository.save(person1);
    }

}
