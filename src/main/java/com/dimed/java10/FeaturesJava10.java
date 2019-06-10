package com.dimed.java10;

import com.dimed.shared.Person;
import com.dimed.shared.PersonService;

public class FeaturesJava10 {

    public void addedVarVariable() {

        var person = new Person(); //infers Person person
        // it's the same thing
        // Person person = new Person();

        System.out.println("Var Feature Java 10");
        System.out.println("Tipo do objeto " + person.getClass().getSimpleName());

    }

    public void optionalElseThrow() {
        var personOptional = new PersonService().returnPersonList().stream().findFirst();

        // System.out.println(personOptional.get());
        System.out.println(personOptional.orElseThrow());


    }

}
