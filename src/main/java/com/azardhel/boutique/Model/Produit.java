package com.azardhel.boutique.Model;

import java.util.UUID;

public abstract class Produit {
    private UUID id; 
    private String nom; 
    private double prix;
    private int stock; 

    public Produit(String nom, double prix, int stock) {
        this.id = UUID.randomUUID();
        this.nom = nom;
        this.prix = prix;
        this.stock = stock;
    }

    public UUID getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public double getPrix() {
        return prix;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String displayInfo()
    {
        return "-> "+id+" : "+nom+" : "+prix+", stock : "+stock+"\n";
    }

}
