package com.azardhel.boutique.Model;

import java.util.UUID;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Client {
    private UUID id;
    private String nom;
    private String email;
    private Map<UUID, Commande> historiqueCommandes = new HashMap<>();

    public Client(String nom, String email) {
        this.id = UUID.randomUUID();
        this.nom = nom;
        this.email = email;
    }

    public UUID getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getEmail() {
        return email;
    }

    public void ajouterCommande(Commande commande) {
        historiqueCommandes.put(commande.getId(), commande);
    }

    public Map<UUID, Commande> getHistorique() {
        return historiqueCommandes;
    }

    public void afficherHistorique() {
        for (Commande cmd : historiqueCommandes.values()) {
            for (Produit article : cmd.getProduits()) {
                System.out.println(cmd.getId()+" -> "+article.getNom());
            }
        }
    }
}
