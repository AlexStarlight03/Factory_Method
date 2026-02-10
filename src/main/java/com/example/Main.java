package com.example;

public class Main {
    public static void main(String[] args) {
        showMenu();
    }

    public static void showMenu() {
        String selectedCompany = null;
        
        while (true) {
            System.out.println("\n=== MENU PRINCIPAL ===");
            
            if (selectedCompany != null) {
                System.out.println("Entreprise actuelle : " + selectedCompany);
            } else {
                System.out.println("Entreprise actuelle : Aucune");
            }
            
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
                        produceProduct(selectedCompany);
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
    
    private static String selectCompany() {
        System.out.println("\n=== SÉLECTION DE L'ENTREPRISE ===");
        System.out.println("Quelle entreprise êtes-vous ?");
        System.out.println("1. Compagnie Classique (Pianos)");
        System.out.println("2. Compagnie Neige (Moto-neiges)");
        System.out.println("3. Compagnie Loud (Haut-parleurs)");
        
        String choix = System.console().readLine();
        String company = switch (choix) {
            case "1" -> "Compagnie Classique";
            case "2" -> "Compagnie Neige";
            case "3" -> "Compagnie Loud";
            default -> {
                System.out.println("Choix invalide!");
                yield null;
            }
        };
        
        if (company != null) {
            System.out.println("✓ Vous êtes maintenant : " + company);
        }
        
        return company;
    }
    
    private static void produceProduct(String company) {
        System.out.println("\n=== DÉBUT DE LA PRODUCTION ===");
        
        if (company.equals("Compagnie Classique")) {
            Piano piano = new Piano();
            piano.createObject();
            piano.draw();
            System.out.println("Piano terminé!");
            
        } else if (company.equals("Compagnie Neige")) {
            Snowmobile snowmobile = new Snowmobile();
            snowmobile.createObject();
            snowmobile.draw();
            System.out.println("Moto-neige terminée!");
            
        } else if (company.equals("Compagnie Loud")) {
            Speakers speakers = new Speakers();
            speakers.createObject();
            speakers.draw();
            System.out.println("Haut-parleurs terminés!");
            
        } else {
            System.out.println("Entreprise inconnue!");
        }
        
        System.out.println("=== FIN DE LA PRODUCTION ===\n");
    }
}