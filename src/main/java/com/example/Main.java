package com.example;

public class Main {
    public static void main(String[] args) {
        showMenu();
    }

    public static void showMenu() {
        CompanyFactory selectedCompany = null;
        
        while (true) {
            System.out.println("\n=== MENU PRINCIPAL ===");
            
            System.out.println("\nQue voulez-vous faire ?");
            System.out.println("1. Choisir une entreprise");
            System.out.println("2. Produire un objet");
            System.out.println("3. Quitter");

            String choix = System.console().readLine();
            switch (choix) {
                case "1" -> {
                    selectedCompany = selectCompany();
                }
                case "2" -> {
                    if (selectedCompany == null) {
                        System.out.println("\n⚠️  Vous devez d'abord choisir une entreprise!");
                    } else {
                        selectedCompany.produceProduct();
                    }
                }
                case "3" -> {
                    System.out.println("Au revoir!");
                    return;
                }
                default -> System.out.println("Option invalide");
            }
        }
    }
    
    private static CompanyFactory selectCompany() {
        System.out.println("\n=== SÉLECTION DE L'ENTREPRISE ===");
        System.out.println("Quelle entreprise êtes-vous ?");
        System.out.println("1. Compagnie Classique (Pianos)");
        System.out.println("2. Compagnie Neige (Moto-neiges)");
        System.out.println("3. Compagnie Loud (Haut-parleurs)");
        
        String choix = System.console().readLine();
        CompanyFactory company = switch (choix) {
            case "1" -> new ClassiqueCompany();
            case "2" -> new NeigeCompany();
            case "3" -> new LoudCompany();
            default -> {
                System.out.println("Choix invalide!");
                yield null;
            }
        };
        
        return company;
    }
}