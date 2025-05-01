package com.azardhel.boutique.Interfaces;

import com.azardhel.boutique.Model.Client;
import com.azardhel.boutique.Model.Commande;

public interface Payable {
    void payer(Client client, Commande commande);
}
