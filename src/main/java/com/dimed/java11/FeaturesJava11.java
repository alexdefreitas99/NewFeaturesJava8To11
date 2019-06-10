package com.dimed.java11;

import com.dimed.shared.PersonService;

public class FeaturesJava11 {
    public void newCollectionToArray() {
        PersonService personService = new PersonService();
        System.out.println("New Feature Java 11");
        System.out.println(personService.returnPersonList().toArray()[0]);
        System.out.println(personService.returnPersonList());

    }
}
