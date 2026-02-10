package com.example;

public class Production {

    public static void produceObject() {
        System.out.println("\nQuel objet voulez-vous produire ?");
        System.out.println("1. Un piano");
        System.out.println("2. Une moto-neige");
        System.out.println("3. Des haut-parleurs");

        String choix = System.console().readLine();
        switch (choix) {
            case "1" -> {
                PianoProduction piano = new PianoProduction();
                piano.createObject();
                piano.draw();
                System.out.println("Piano terminé!\n");
            }
            case "2" -> {
                SnowmobileProduction snowmobile = new SnowmobileProduction();
                snowmobile.createObject();
                snowmobile.draw();
                System.out.println("Moto-neige terminée!\n");
            }
            case "3" -> {
                SpeakersProduction speakers = new SpeakersProduction();
                speakers.createObject();
                speakers.draw();
                System.out.println("Haut-parleurs terminés!\n");
            }
            default -> System.out.println("Vous avez choisi une option invalide");
        }
    }
}