package fr.delmaire.utilisateur.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.delmaire.utilisateur.bean.Utilisateur;
import fr.delmaire.utilisateur.business.impl.UtilisateurBusiness;

@WebServlet("/utilisateurs")
public class UtilisateursServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   UtilisateurBusiness ub = new UtilisateurBusiness();
	
    public UtilisateursServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ArrayList<Utilisateur> utilisateurs = ub.findAll();
		request.setAttribute("utilisateurs", utilisateurs);
				
		
		this.getServletContext()
		.getRequestDispatcher("/WEB-INF/pages/utilisateurs.jsp")
		.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
