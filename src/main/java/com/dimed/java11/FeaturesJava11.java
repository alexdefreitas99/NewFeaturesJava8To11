package com.dimed.java11;

import com.dimed.initializer.MenuOpcoes;
import com.dimed.shared.PersonService;

public class FeaturesJava11 {

    MenuOpcoes menuOpcoes = new MenuOpcoes();
    PersonService personService = new PersonService();

    public void newCollectionToArray() {
        System.out.println("#####################");
        System.out.println("New Feature Java 11");
        System.out.println(personService.returnPersonList().toArray()[0]);
        System.out.println(personService.returnPersonList());
        System.out.println("#####################");
        menuOpcoes.subMenuFeaturesJava11();


    }

    public void varLambda() {
        System.out.println("#####################");
        System.out.println("New Feature Java 11");
        personService.returnPersonList().forEach((var item) -> System.out.println(item.getClass().getSimpleName()));
        System.out.println("#####################");
        menuOpcoes.subMenuFeaturesJava11();


    }
}
