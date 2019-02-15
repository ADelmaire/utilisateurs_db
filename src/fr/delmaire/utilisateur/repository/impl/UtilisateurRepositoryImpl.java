package fr.delmaire.utilisateur.repository.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import fr.delmaire.utilisateur.bean.Utilisateur;
import fr.delmaire.utilisateur.repository.IUtilisateurRepository;

public class UtilisateurRepositoryImpl implements IUtilisateurRepository{

	@Override
	public ArrayList<Utilisateur> findAll() {
		ArrayList<Utilisateur> listeUtilisateurs = new ArrayList<>();
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			Connection cnx = 
					DriverManager.getConnection
					("jdbc:mariadb://localhost:3306/users", "root", "");

			Statement st = cnx.createStatement();

			ResultSet resultat = st.executeQuery
					("SELECT id, nom, prenom, numero, phone, email, adresse, photo  FROM utilisateur");

			while (resultat.next()) {
				int id = resultat.getInt("id");	
				String nom = resultat.getString("nom");
				String prenom = resultat.getString("prenom");
				int numero = resultat.getInt("numero");
				String phone = resultat.getString("phone");
				String email = resultat.getString("email");
				String adresse = resultat.getString("adresse");
				String photo = resultat.getString("photo");

				Utilisateur u = new Utilisateur(
						id, 
						nom, 
						prenom, 
						numero, 
						phone, 
						email, 
						adresse, 
						photo);

				listeUtilisateurs.add(u);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return listeUtilisateurs;
	}

	@Override
	public Utilisateur findOne(int id) {
		try {

			Class.forName("org.mariadb.jdbc.Driver");
			Connection cnx = DriverManager.getConnection("jdbc:mariadb://localhost:3306/Users", "root", "");
			/*on change le nom de la bdd pour tester sans supprimer*/
			Statement st = cnx.createStatement();

			ResultSet resultat = st.executeQuery(
					"SELECT id, nom, prenom, numero, phone, email, adresse, photo FROM utilisateur WHERE id=" +id);

			while (resultat.next()) {
				int idUser= resultat.getInt("id");
				String nomUser = resultat.getString("nom");
				String prenomUser = resultat.getString("prenom");
				int numeroUser = resultat.getInt("numero");
				String phoneUser = resultat.getString("phone");
				String emailUser = resultat.getString("email");
				String adresseUser = resultat.getString("adresse");
				String photoUser = resultat.getString("photo");

				Utilisateur u = new Utilisateur(idUser, nomUser, prenomUser, numeroUser, phoneUser, emailUser, adresseUser, photoUser);
				return u;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public void supprimerUtilisateur(int id) {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			Connection cnx = DriverManager.getConnection("jdbc:mariadb://localhost:3306/users", "root", "");
			Statement st = cnx.createStatement();

			st.executeQuery("DELETE FROM utilisateur WHERE id="+id);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean ajouterUtilisateur(String nom, String prenom, int numero, String phone, String email, String adresse,
			String photo) {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			Connection cnx = DriverManager.getConnection("jdbc:mariadb://localhost:3306/users","root","");

			PreparedStatement ps = cnx.prepareStatement("INSERT INTO utilisateur ("
					+ "nom, prenom, numero, phone, email, adresse, photo) "
					+ "VALUES(?,?,?,?,?,?,?) ");

			ps.setString(1, nom);
			ps.setString(2, prenom);
			ps.setInt(3, numero);
			ps.setString(4, phone);
			ps.setString(5, email);
			ps.setString(6, adresse);
			ps.setString(7, photo);

			ps.executeUpdate();
			return true;

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean update(int id, String nom, String prenom, int numero, String phone, String email, String adresse,
			String photo) {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			Connection cnx = DriverManager.getConnection("jdbc:mariadb://localhost:3306/users", "root", "");
			
			PreparedStatement ps = cnx.prepareStatement(
					"UPDATE utilisateur SET nom = ?  ,  prenom = ?, numero = ? , phone = ? , email = ? , adresse =  ?, photo = ? WHERE id = ?");
			
			ps.setString(1, nom);
			ps.setString(2, prenom);
			ps.setInt(3, numero);
			ps.setString(4, phone);
			ps.setString(5, email);
			ps.setString(6, adresse);
			ps.setString(7, photo);
			ps.setInt(8, id);
			
			ps.executeUpdate();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}
