package com.azardhel.boutique.View;

import java.util.Scanner;

public class ConsoleApp {
    private final Scanner scanner = new Scanner(System.in);
    private boolean running = true;

    public void demarrer() {
        while (running) {
            afficherMenu();
            String choix = scanner.nextLine();
            traiterChoix(choix);
        }
        scanner.close();
    }

    private void afficherMenu() {
        System.out.println("\n=== Menu Boutique ===");
        System.out.println("1. Créer un client");
        System.out.println("2. Quitter");
        System.out.print("Votre choix : ");
    }

    private void traiterChoix(String choix) {
        switch (choix) {
            case "1":
                creerClient();
                break;
            case "2":
                running = false;
                System.out.println("Fin de l'application.");
                break;
            default:
                System.out.println("Choix invalide.");
        }
    }

    private void creerClient() {
        System.out.print("Nom du client : ");
        String nom = scanner.nextLine();
        // Ici tu peux appeler ton service pour créer un client réel
        System.out.println("Client '" + nom + "' créé !");
    }
}