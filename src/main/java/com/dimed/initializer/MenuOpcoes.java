package com.dimed.initializer;

import com.dimed.java8.FeaturesJava8;

import java.util.Scanner;

public class MenuOpcoes {

    public void exibirOpcoesPrincipais() {

        System.out.println("Escolha uma opcao");
        System.out.println("1 - Para java 8");
        System.out.println("2 - Para java 9");
        System.out.println("3 - Para java 10");
        System.out.println("4 - Para java 11");

        switch (new Scanner(System.in).nextInt()) {
            case 1:
                System.out.println("New FeaturesJava8 Java 8");
                System.out.println("1 - Feature (Lambda)");
                System.out.println("2 - Feature (Improvement Improved Type Reference)");
                subMenuFeaturesJava8(new Scanner(System.in).nextInt());
                break;
            case 2:
                System.out.println("New FeaturesJava8 Java 9");
                System.out.println("1 - Feature 1");
                System.out.println("2 - Feature 2");
                subMenuFeaturesJava9(new Scanner(System.in).nextInt());
                break;
            case 3:
                System.out.println("New FeaturesJava8 Java 10");
                System.out.println("1 - Feature 1");
                System.out.println("2 - Feature 2");
                subMenuFeaturesJava10(new Scanner(System.in).nextInt());
                break;
            case 4:
                System.out.println("New FeaturesJava8 Java 11");
                System.out.println("1 - Feature 1");
                System.out.println("2 - Feature 2");
                subMenuFeaturesJava11(new Scanner(System.in).nextInt());
                break;
            default:
                System.out.println("Nenhuma opção válida selecionada");
                System.out.println("================================");
                exibirOpcoesPrincipais();
        }
    }

    public void subMenuFeaturesJava8(int number) {
        FeaturesJava8 featuresJava8 = new FeaturesJava8();
        switch (number) {
            case 1:
                System.out.println("Lambda new feature implemented in java 8");
                featuresJava8.FeatureLambda();
                break;
            case 2:
                System.out.println("Type Improvement Java 8");
                featuresJava8.FeatureImprovedTypeReference();
                break;
            default:
                System.out.println("Nenhuma opção válida selecionada");
                System.out.println("================================");
                exibirOpcoesPrincipais();
        }
    }

    public void subMenuFeaturesJava9(int number) {
        switch (number) {
            case 1:
                System.out.println("New Feature Java 9");
                break;
            case 2:
                System.out.println("New Feature Java 9");
                break;
            default:
                System.out.println("Nenhuma opção válida selecionada");
                System.out.println("================================");
                exibirOpcoesPrincipais();
        }
    }

    public void subMenuFeaturesJava10(int number) {
        switch (number) {
            case 1:
                System.out.println("New Feature Java 10");
                break;
            case 2:
                System.out.println("New Feature Java 10");
                break;
            default:
                System.out.println("Nenhuma opção válida selecionada");
                System.out.println("================================");
                exibirOpcoesPrincipais();
        }
    }


    public void subMenuFeaturesJava11(int number) {
        switch (number) {
            case 1:
                System.out.println("New Feature Java 11");
                break;
            case 2:
                System.out.println("New Feature Java 11");
                break;
            default:
                System.out.println("Nenhuma opção válida selecionada");
                System.out.println("================================");
                exibirOpcoesPrincipais();
        }
    }


}
