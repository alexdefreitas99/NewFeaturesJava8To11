package com.dimed.java8;

import com.dimed.initializer.MenuOpcoes;
import com.dimed.shared.Person;
import com.dimed.shared.PersonService;

import java.util.Arrays;
import java.util.List;

public class FeaturesJava8 {

    MenuOpcoes menuOpcoes = new MenuOpcoes();
    PersonService personService = new PersonService();

    public void featureLambda() {
        // returnPersonList().forEach(eachPerson -> System.out.println(eachPerson));
        System.out.println("#####################");
        System.out.println("Lambda new feature implemented in java 8");
        personService.returnPersonList().stream().filter(
                p -> p.getGender() == Person.Sex.MALE
                        && p.getName() == "alex"
        ).map(p -> p.getEmailAddress())
                .forEach(System.out::println);
        System.out.println("#####################");
        menuOpcoes.subMenuFeaturesJava8();
    }

    public void featureImprovedTypeReference() {
        // in java < 8
        // listPerson.addAll(Arrays.<Person>asList());
        System.out.println("#####################");
        System.out.println("Type Improvement Java 8");
        List<Person> listPerson = personService.returnPersonList();
        listPerson.addAll(Arrays.asList());
        System.out.println(listPerson);
        System.out.println("#####################");
        menuOpcoes.showOptions();
    }


}
