package com.azardhel.boutique.Services;

import com.azardhel.boutique.Model.Client;
import com.azardhel.boutique.Model.Commande;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class SauvegardeService {

    public void sauvegarderHistorique(Client client) {
        String fileName = client.getNom().replaceAll("\\s+", "_") + "_historique.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write("Historique des commandes de " + client.getNom() + ":\n\n");
            for (Commande cmd : client.getHistorique().values()) {
                writer.write(cmd.toString());
                writer.write("\n------------------------\n");
            }
            System.out.println("Historique sauvegardé dans le fichier : " + fileName);
        } catch (IOException e) {
            System.out.println("Erreur lors de la sauvegarde : " + e.getMessage());
        }
    }
}