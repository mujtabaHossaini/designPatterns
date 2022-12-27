package com.creational.facetedBuilder.service;


import com.creational.facetedBuilder.model.Person;

// builder facade
public class PersonBuilder {

    protected Person person = new Person();

    // sub-builder
    public PersonAddressBuilder lives()
    {
        return new PersonAddressBuilder(this.person);
    }

    // sub-builder
    public PersonJobBuilder works()
    {
        return new PersonJobBuilder(this.person);
    }


    public Person build()
    {
        return person;
    }


}
