package metier;
import javax.ejb.Local;
import javax.ejb.Remote;
//import net.youssfi.eboutique.entities.Role;
//import net.youssfi.eboutique.entities.User;
@Remote
public interface IAdminCategoriesMetier extends IAdminProduitMetier {
public Long ajouterCategorie(Categorie c);
public void supprimerCategrorie(Long idcat);
public void modifierCategorie(Categorie c);
//public void ajouterUser(User u);
//public void attribuerRole(Role r,Long userID);
}