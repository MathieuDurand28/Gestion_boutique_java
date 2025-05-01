package com.azardhel.boutique.Model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CommandeTest {

    @Test
    public void testAjouterProduitAugmenteTotal() {
        Client client = new Client("Test", "test@mail.com");
        Commande commande = new Commande(client, 0);

        Produit produit = new ProduitPhysique("Livre", 15.0, 1);
        commande.ajouterProduit(produit);  // ou setProduit si pas encore renommé

        assertEquals(15.0, commande.getTotal(), 0.001); // tolérance pour les doubles
    }

    @Test
    public void testPlusieursProduits() {
        Client client = new Client("Test", "test@mail.com");
        Commande commande = new Commande(client, 0);

        Produit a = new ProduitVirtuel("Jeu", 30.0,20);
        Produit b = new ProduitPhysique("Stylo", 5.0,0);

        commande.ajouterProduit(a);
        commande.ajouterProduit(b);

        assertEquals(35.0, commande.getTotal(), 0.001);
        assertEquals(2, commande.getProduits().size());
    }
}