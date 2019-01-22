package net.youssfi.eboutique.metier;
import javax.ejb.Local;
import javax.ejb.Remote;

import net.youssfi.eboutique.entities.Categorie;
//import net.youssfi.eboutique.entities.Role;
//import net.youssfi.eboutique.entities.User;
@Local
public interface IAdminCategoriesMetier extends IAdminProduitMetier {
public Long ajouterCategorie(Categorie c);
public void supprimerCategorie(Long idcat);
public void modifierCategorie(Categorie c);
//public void ajouterUser(User u);
//public void attribuerRole(Role r,Long userID);
}