package net.youssfi.eboutique.metier;
import java.util.List;

import javax.ejb.Remote;

import net.youssfi.eboutique.entities.*;
@Remote
public interface InternauteBoutiqueMetier {
public List<Categorie> listCategories();
public Categorie getCategorie(Long idCat);
public List<Produit> listproduits();
public List<Produit> produitsParMotCle(String mc);
public List<Produit> produitsParCategorie(Long idCat);
public List<Produit> produitsSelectionnes();
public Produit getProduit(Long idP);
public Commande enregistrerCommande(Panier p,Client c);
}