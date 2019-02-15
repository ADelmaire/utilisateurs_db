package fr.delmaire.utilisateur.business;

import java.util.ArrayList;

import fr.delmaire.utilisateur.bean.Utilisateur;

public interface IUtilisateurBusiness {

	public ArrayList<Utilisateur>findAll();
	
	public Utilisateur findOne (int id);
	
	public void supprimerUtilisateur (int id);
	
	public boolean ajouterUtilisateur (
			String nom,
			String prenom,
			int numero,
			String phone,
			String email,
			String adresse,
			String photo
			);
	
	public boolean update(
			int id,
			String nom, 
			String prenom, 
			int numero,
			String phone, 
			String email,
			String adresse, 
			String photo);
}
