package net.youssfi.eboutique.entities;
import java.io.Serializable;import java.util.*;
import javax.persistence.*;import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotEmpty;
@Entity
public class Categorie implements Serializable {
@Id
@GeneratedValue
private Long idCategorie;
@NotEmpty
@Size(min=4,max=20)
private String nomCategorie; private String description;
/*private String nomPhoto;
@Lob
private byte[] photo;*/
@OneToMany(mappedBy="categorie", cascade = CascadeType.ALL)
private Collection<Produit> produits=new ArrayList<Produit>();
public Categorie(Long idCategorie, String nomCategorie, String description, String nomPhoto, byte[] photo,
		Collection<Produit> produits) {
	super();
	this.idCategorie = idCategorie;
	this.nomCategorie = nomCategorie;
	this.description = description;
/*	this.nomPhoto = nomPhoto;
	this.photo = photo; */
	this.produits = produits;
}
public Categorie() {
	super();
	// TODO Auto-generated constructor stub
}
public Long getIdCategorie() {
	return idCategorie;
}
public void setIdCategorie(Long idCategorie) {
	this.idCategorie = idCategorie;
}
public String getNomCategorie() {
	return nomCategorie;
}
public void setNomCategorie(String nomCategorie) {
	this.nomCategorie = nomCategorie;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}

/*public String getNomPhoto() {
	return nomPhoto;
}
public void setNomPhoto(String nomPhoto) {
	this.nomPhoto = nomPhoto;
}
public byte[] getPhoto() {
	return photo;
}
public void setPhoto(byte[] photo) {
	this.photo = photo;
}*/
public Collection<Produit> getProduits() {
	return produits;
}
public void setProduits(Collection<Produit> produits) {
	this.produits = produits;
}

}