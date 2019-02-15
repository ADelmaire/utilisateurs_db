package fr.delmaire.utilisateur.bean;

public class Utilisateur {
private int id;
private String nom;
private String prenom;
private int numero;
private String phone;
private String email;
private String adresse;
private String photo;
public Utilisateur() {
	super();
	// TODO Auto-generated constructor stub
}
public Utilisateur(int id, String nom, String prenom, int numero, String phone, String email, String adresse,
		String photo) {
	super();
	this.id = id;
	this.nom = nom;
	this.prenom = prenom;
	this.numero = numero;
	this.phone = phone;
	this.email = email;
	this.adresse = adresse;
	this.photo = photo;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public int getNumero() {
	return numero;
}
public void setNumero(int numero) {
	this.numero = numero;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getAdresse() {
	return adresse;
}
public void setAdresse(String adresse) {
	this.adresse = adresse;
}
public String getPhoto() {
	return photo;
}
public void setPhoto(String photo) {
	this.photo = photo;
}



}
