package com.dimed.shared;

import java.util.ArrayList;
import java.util.List;

public class PersonService {


    public List<Person> returnPersonList(){

        List<Person> personList = new ArrayList<>();

        Person person = new Person().builder()
                .name("alex")
                .gender(Person.Sex.MALE)
                .emailAddress("alexdefreitas99@hotmail.com")
                .build();

        personList.add(person);

        person = new Person().builder()
                .name("Stive")
                .gender(Person.Sex.MALE)
                .emailAddress("stive@hotmail.com")
                .build();

        personList.add(person);

        return personList;
    }

    public Person returnPersonTest(){

        return new Person().builder()
                .emailAddress("teste")
                .gender(Person.Sex.FEMALE)
                .name("Teste").build();

    }

}
