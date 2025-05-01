package com.azardhel.boutique.Services;

import com.azardhel.boutique.Interfaces.Payable;
import com.azardhel.boutique.Model.Client;
import com.azardhel.boutique.Model.Commande;

public class PaiementService implements Payable {


    @Override
    public void payer(Client client, Commande commande) {
        System.out.println("paiement en cours... \n");
        commande.setTotal(0);
        System.out.println("paiement effectué \n");
        client.ajouterCommande(commande);
    }
}
