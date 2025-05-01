package com.azardhel.boutique.Model;
import com.azardhel.boutique.Exceptions.ProduitIndisponibleException;
import com.azardhel.boutique.Exceptions.StockInsuffisantException;
import com.azardhel.boutique.Services.CommandeService;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CommandeServiceTest {

    @Test
    public void testAjouterProduitNullLanceException() {
        CommandeService service = new CommandeService();
        Client client = new Client("Jean", "jean@mail.com");
        Commande commande = new Commande(client, 0);
        
        // Associe une commande fictive (selon ta logique métier)
        service.afficherCommande(commande);

        // Teste que l'exception est bien levée
        assertThrows(ProduitIndisponibleException.class, () -> {
            service.ajouterProduit(commande, null);
        });
    }

    @Test
    public void testAjouterProduitSansStockSuffisant() {
        CommandeService service = new CommandeService();
        Client client = new Client("Jean", "jean@mail.com");
        Commande commande = new Commande(client, 0);
        ProduitPhysique article = new ProduitPhysique("test", 25, 0);
        
        assertThrows(StockInsuffisantException.class, () -> {
            service.ajouterProduit(commande, article);
        });
    }
}