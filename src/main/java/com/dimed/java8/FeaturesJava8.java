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

    public void FeatureLambda() {
//        returnPersonList().forEach(eachPerson -> System.out.println(eachPerson));

        System.out.println("#####################");

        returnPersonList().stream().filter(
                p -> p.getGender() == Person.Sex.MALE
                && p.getName() == "alex"
        ).map( p -> p.getEmailAddress())
                .forEach(email -> System.out.println(email));

        System.out.println("#####################");
        menuOpcoes.exibirOpcoesPrincipais();

    }

    public void FeatureImprovedTypeReference(){
        // in java < 8
        // listPerson.addAll(Arrays.<Person>asList());
        List <Person>  listPerson = returnPersonList();
        listPerson.addAll(Arrays.asList());
        System.out.println(listPerson);
        menuOpcoes.exibirOpcoesPrincipais();
    }


}
