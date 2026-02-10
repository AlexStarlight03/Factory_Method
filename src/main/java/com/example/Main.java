package com.example;

public class Main {
    public static void main(String[] args) {
        showMenu();
    }

    public static void showMenu() {
        SnowmobileProduction SnowCompany = new SnowmobileProduction();
        PianoProduction ClassiqueCompany = new PianoProduction();
        SpeakersProduction MusicCompany = new SpeakersProduction();
        while (true) {
            System.out.println("Que voulez-vous faire ?");
            System.out.println("1. Produire un objet");
            System.out.println("2. Quitter");

            String choix = System.console().readLine();
            switch (choix) {
                case "1" -> {
                    System.out.println("Vous avez choisi de produire un objet");
                    System.out.println("Quelle est votre entreprise ?");
                    System.out.println("1. SnowCompany");
                    System.out.println("2. PianoForAll");
                    System.out.println("2. MusicEverywhere");
                    String company = System.console().readLine();
                    switch (company) {
                        case "1" -> {
                            System.out.println("Vous avez choisi SnowCompany");
                            SnowCompany.createObject();
                        }
                        case "2" -> {
                            System.out.println("Vous avez choisi PianoForAll");
                            ClassiqueCompany.createObject();
                        }
                        case "3" -> {
                            System.out.println("Vous avez choisi MusicEverywhere");
                            MusicCompany.createObject();
                        }
                        default -> System.out.println("Vous avez choisi une entreprise invalide");
                    }
                }
                case "2" -> {
                    System.out.println("Vous avez choisi de quitter");
                    return;
                }
                default -> System.out.println("Vous avez choisi une option invalide");
            }
        }
    }
}
