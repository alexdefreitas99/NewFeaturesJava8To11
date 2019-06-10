package com.dimed.java9;

import com.dimed.initializer.MenuOpcoes;

public class FeaturesJava9 {

    MenuOpcoes menuOpcoes = new MenuOpcoes();

    public void featureUnderscore() {
        // on java 8 this is legal,  in java 9 this isn't
        // int _ = 1;
        // the code don't compile
        System.out.println("#####################");
        System.out.println("New Feature Java 9");
        System.out.println("Uncomment the line 17 of method [FeatureUnderscore] class FeaturesJava9");
        System.out.println("#####################");
        // uncomment the line below
        // string _ = "Warning java 9 don't accept";
        menuOpcoes.subMenuFeaturesJava9();

    }

    public void featurePrivateMethodsInInterface() {
        CustomCalculatorImpl customCalculator = new CustomCalculatorImpl();
        System.out.println("#####################");
        int sumOfEvens = customCalculator.addEvenNumbers(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println(sumOfEvens);
        int sumOfOdds = customCalculator.addOddNumbers(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println(sumOfOdds);
        System.out.println("#####################");
        menuOpcoes.subMenuFeaturesJava9();
    }
}
