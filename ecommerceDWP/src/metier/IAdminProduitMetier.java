package metier;
import javax.ejb.Local;

@Local
public interface IAdminProduitMetier extends
InternauteBoutiqueMetier {
public Long ajouterProduit(Produit p, Long idCat);
public void supprimerProduit(Long idP);
public void modifierProduit(Produit p);
}