package com.azardhel.boutique.Services;

import com.azardhel.boutique.Exceptions.ProduitIndisponibleException;
import com.azardhel.boutique.Exceptions.StockInsuffisantException;
import com.azardhel.boutique.Model.Commande;
import com.azardhel.boutique.Model.Produit;

public class CommandeService {

    public void ajouterProduit(Commande commande, Produit produit) throws ProduitIndisponibleException, StockInsuffisantException {
        if (produit == null) {
            throw new ProduitIndisponibleException("Produit inexistant");
        }
        if (produit.getStock() <= 0) {
            throw new StockInsuffisantException("Stock insuffisant pour ajouter le produit");
        }
        commande.ajouterProduit(produit); 
        produit.setStock(produit.getStock() - 1);
    }

    public void afficherCommande(Commande commande) {
        System.out.println("Produits :");
        for (Produit p : commande.getProduits()) {
            System.out.println(p.displayInfo());
        }
        System.out.println("TOTAL : " + commande.getTotal());
    }
}
