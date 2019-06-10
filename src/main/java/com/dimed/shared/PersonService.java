package com.dimed.shared;

import java.util.ArrayList;
import java.util.List;

public class PersonService {


    public List<Person> returnPersonList(){
        List<Person> personList = new ArrayList<>();

        Person person = new Person();
        person.name = "alex";
        person.gender = Person.Sex.MALE;
        person.emailAddress = "alexdefreitas99@hotmail.com";

        personList.add(person);

        person = new Person();
        person.name = "Stive";
        person.gender = Person.Sex.MALE;
        person.emailAddress = "stive@hotmail.com";

        personList.add(person);

        return personList;
    }

}
