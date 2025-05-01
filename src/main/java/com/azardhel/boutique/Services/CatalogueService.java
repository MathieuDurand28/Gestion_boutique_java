package com.azardhel.boutique.Services;

import java.util.List;
import com.azardhel.boutique.Model.Produit;

public class CatalogueService {

    public void getAllproducts(List<Produit> produits)
    {
        for (Produit p : produits) {
            System.out.println(p.getNom()+"\n");
        }
    }
}
