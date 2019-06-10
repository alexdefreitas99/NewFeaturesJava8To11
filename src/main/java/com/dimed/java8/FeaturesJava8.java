package com.dimed.java8;

import com.dimed.initializer.MenuOpcoes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FeaturesJava8 {

    MenuOpcoes menuOpcoes = new MenuOpcoes();

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

    public void featureLambda() {
//        returnPersonList().forEach(eachPerson -> System.out.println(eachPerson));

        System.out.println("#####################");
        System.out.println("Lambda new feature implemented in java 8");


        returnPersonList().stream().filter(
                p -> p.getGender() == Person.Sex.MALE
                && p.getName() == "alex"
        ).map( p -> p.getEmailAddress())
                .forEach(email -> System.out.println(email));

        System.out.println("#####################");
        menuOpcoes.showOptions();

    }

    public void featureImprovedTypeReference(){
        // in java < 8
        // listPerson.addAll(Arrays.<Person>asList());
        System.out.println("#####################");


        System.out.println("Type Improvement Java 8");

        List <Person>  listPerson = returnPersonList();
        listPerson.addAll(Arrays.asList());
        System.out.println(listPerson);
        System.out.println("#####################");

        menuOpcoes.showOptions();
    }


}
