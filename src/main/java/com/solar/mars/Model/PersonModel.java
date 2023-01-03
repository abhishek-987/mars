package com.solar.mars.Model;

public class PersonModel {

    private int userId;
    private String name;
    private String lastName;

    public PersonModel(int userId, String name, String lastName) {
        this.userId = userId;
        this.name = name;
        this.lastName = lastName;
    }

    public PersonModel() {

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
