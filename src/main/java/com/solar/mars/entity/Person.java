package com.solar.mars.entity;

import com.solar.mars.Model.PersonModel;
import org.springframework.beans.factory.annotation.Autowired;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {
    @Id
    private int userId;
    private String name;
    private String lastName;

    public Person(int userId, String name, String lastName) {
        this.userId = userId;
        this.name = name;
        this.lastName = lastName;
    }

    public Person() {
    }

    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }
}
