package com.example;

public class Main {
    public static void main(String[] args) {
        showMenu();
    }

    public static void showMenu() {
        
        while (true) {
            System.out.println("\n=== MENU PRINCIPAL ===");
            System.out.println("Que voulez-vous faire ?");
            System.out.println("1. Produire un objet");
            System.out.println("2. Quitter");

            String choix = System.console().readLine();
            switch (choix) {
                case "1" -> {
                    System.out.println("Vous avez choisi de produire un objet");
                    Production.produceObject();
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