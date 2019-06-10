package com.dimed.initializer;

import com.dimed.java10.FeaturesJava10;
import com.dimed.java11.FeaturesJava11;
import com.dimed.java8.FeaturesJava8;
import com.dimed.java9.FeaturesJava9;

import java.util.Scanner;

public class MenuOpcoes {

    public void showOptions() {

        System.out.println("Menu");
        System.out.println("Select an option");
        System.out.println("1 - For java 8");
        System.out.println("2 - For java 9");
        System.out.println("3 - For java 10");
        System.out.println("4 - For java 11");

        switch (new Scanner(System.in).nextInt()) {
            case 1:
                subMenuFeaturesJava8();
                break;
            case 2:
                subMenuFeaturesJava9();
                break;
            case 3:
                subMenuFeaturesJava10();
                break;
            case 4:
                subMenuFeaturesJava11();
                break;
            default:
                System.out.println("Nenhuma opção válida selecionada");
                System.out.println("================================");
                showOptions();
        }
    }

    public void subMenuFeaturesJava8() {
        FeaturesJava8 featuresJava8 = new FeaturesJava8();
        System.out.println("New FeaturesJava8 Java 8");
        System.out.println("1 - Feature (Lambda)");
        System.out.println("2 - Feature (Improvement Improved Type Reference)");
        switch (new Scanner(System.in).nextInt()) {
            case 1:
                featuresJava8.featureLambda();
                break;
            case 2:
                featuresJava8.featureImprovedTypeReference();
                break;
            default:
                System.out.println("================================");
                System.out.println("Nenhuma opção válida selecionada");
                System.out.println("================================");
                showOptions();
        }
    }

    public void subMenuFeaturesJava9() {
        FeaturesJava9 featuresJava9 = new FeaturesJava9();

        System.out.println("New Features Java 9");
        System.out.println("1 - Feature 1 (Underscore not legal character name)");
        System.out.println("2 - Feature 2");
        switch (new Scanner(System.in).nextInt()) {
            case 1:
                featuresJava9.featureUnderscore();
                break;
            case 2:
                featuresJava9.featurePrivateMethodsInInterface();
                break;
            default:
                System.out.println("Nenhuma opção válida selecionada");
                System.out.println("================================");
                showOptions();
        }
    }

    public void subMenuFeaturesJava10() {
        FeaturesJava10 featuresJava10 = new FeaturesJava10();
        System.out.println("New FeaturesJava8 Java 10");
        System.out.println("1 - Feature 1");
        System.out.println("2 - Feature 2");
        switch (new Scanner(System.in).nextInt()) {
            case 1:
                featuresJava10.addedVarVariable();
                break;
            case 2:
                featuresJava10.optionalElseThrow();
                break;
            default:
                System.out.println("Nenhuma opção válida selecionada");
                System.out.println("================================");
                showOptions();
        }
    }


    public void subMenuFeaturesJava11() {
        FeaturesJava11 featuresJava11 = new FeaturesJava11();
        System.out.println("New FeaturesJava8 Java 11");
        System.out.println("1 - Feature 1");
        System.out.println("2 - Feature 2");
        switch (new Scanner(System.in).nextInt()) {
            case 1:
                featuresJava11.newCollectionToArray();
                break;
            case 2:
                featuresJava11.varLambda();
                break;
            default:
                System.out.println("Nenhuma opção válida selecionada");
                System.out.println("================================");
                showOptions();
        }
    }


}
