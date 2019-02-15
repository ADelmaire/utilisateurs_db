package fr.delmaire.utilisateur.business.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import fr.delmaire.utilisateur.bean.Utilisateur;
import fr.delmaire.utilisateur.business.IUtilisateurBusiness;
import fr.delmaire.utilisateur.repository.impl.UtilisateurRepositoryImpl;

public class UtilisateurBusiness implements IUtilisateurBusiness{
UtilisateurRepositoryImpl ur= new UtilisateurRepositoryImpl();

	@Override
	public ArrayList<Utilisateur> findAll() {
	
		
		ArrayList<Utilisateur> liste = ur.findAll();
		return liste;
	}

	@Override
	public Utilisateur findOne(int id) {
		Utilisateur user= ur.findOne(id);
		return user;
	}

	@Override
	public void supprimerUtilisateur(int id) {
		ur.supprimerUtilisateur(id);
	}

	@Override
	public boolean ajouterUtilisateur(String nom, String prenom, int numero, String phone, String email, String adresse,
			String photo) {
		boolean b = ur.ajouterUtilisateur(nom, prenom, numero, phone, email, adresse, photo);
				return b;
	}

	@Override
	public boolean update(int id, String nom, String prenom, int numero, String phone, String email, String adresse,
			String photo) {
		boolean b = ur.update(id, nom, prenom, numero, phone, email, adresse, photo);
		return b;
	}
		
}

