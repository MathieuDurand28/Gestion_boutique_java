package com.azardhel.boutique.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Commande {
    private UUID id;
    private Client client;
    private List<Produit> produits = new ArrayList<>();
    
    private double total;
    private double totalArticles;
    
    public Commande(Client client, double total) {
        this.id = UUID.randomUUID();
        this.client = client;
        this.total = total;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Produit> getProduits() {
        return produits;
    }

    public void ajouterProduit(Produit article) {
        produits.add(article);
        this.total += article.getPrix();
        
    }

    public void removeProduit(Produit article)
    {
        //Supprimer produit
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Commande ID : ").append(id).append("\n");
        sb.append("Client : ").append(client.getNom()).append("\n");
        sb.append("Produits :\n");

        for (Produit p : produits) {
            sb.append("  - ").append(p.getNom()).append(" (").append(p.getPrix()).append(" €)\n");
            totalArticles += p.getPrix();
        }
        sb.append("Total des articles : ").append(totalArticles).append(" €\n");
        sb.append("Reste à payer : ").append(total).append(" €\n");
        return sb.toString();
    }
}
