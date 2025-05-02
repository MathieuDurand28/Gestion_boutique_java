package com.azardhel.boutique;

import com.azardhel.boutique.Model.Client;
import com.azardhel.boutique.Model.Commande;
import com.azardhel.boutique.Model.Produit;
import com.azardhel.boutique.Model.ProduitPhysique;
import com.azardhel.boutique.Model.ProduitVirtuel;
import com.azardhel.boutique.Services.CommandeService;
import com.azardhel.boutique.Services.PaiementService;
import com.azardhel.boutique.Services.SauvegardeService;
import com.azardhel.boutique.View.ConsoleApp;

public class App 
{
    public static void main( String[] args )
    {
        /* 
        Client client = new Client("Mathieu", "Mathieu@gmail.Com");

        ProduitPhysique funkyPopMarvel = new ProduitPhysique("Captain América", 25.4, 5);
        ProduitPhysique legoSet = new ProduitPhysique("LEGO Star Wars", 120.0, 3);
        ProduitPhysique boardGame = new ProduitPhysique("Catan", 35.0, 10);
        ProduitVirtuel callOfDuty = new ProduitVirtuel("Call of Duty", 60.0, 1);
        ProduitVirtuel minecraft = new ProduitVirtuel("Minecraft", 20.0, 40);
        ProduitVirtuel spotifySubscription = new ProduitVirtuel("Spotify Premium", 9.99, 500);

        Commande commande = new Commande(client, 0);
        CommandeService service = new CommandeService();
        
        System.out.println("\n");
        try {
            service.ajouterProduit(commande, callOfDuty);
            service.ajouterProduit(commande, funkyPopMarvel);
            service.ajouterProduit(commande, legoSet);
            service.ajouterProduit(commande, minecraft);
            service.ajouterProduit(commande, boardGame);
            service.ajouterProduit(commande, spotifySubscription);

            System.out.println("TOTAL A PAYER: "+commande.getTotal()+"\n");
            PaiementService masterCard = new PaiementService();
            masterCard.payer(client, commande);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("\n");
        System.out.println("---- LISTE DES PRODUITS ---- \n");
        for (Produit cmd : commande.getProduits()){
            System.out.println(cmd.displayInfo());
        }
        System.out.println("---- FIN DE LISTE ---- \n");
        
        System.out.println("RESTE A PAYER: "+commande.getTotal());
        System.out.println("\n");

        client.afficherHistorique();
        SauvegardeService saveService = new SauvegardeService();
        saveService.sauvegarderHistorique(client);
        System.out.println(commande);
        */

        ConsoleApp menu = new ConsoleApp();
        menu.demarrer();
    }
}
