package net.youssfi.eboutique.metier;
import javax.ejb.Local;
import net.youssfi.eboutique.entities.Produit;

@Local
public interface IAdminProduitMetier extends
InternauteBoutiqueMetier {
public Long ajouterProduit(Produit p, Long idCat);
public void supprimerProduit(Long idP);
public void modifierProduit(Produit p);
}