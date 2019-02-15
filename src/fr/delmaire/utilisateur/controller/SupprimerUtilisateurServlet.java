package fr.delmaire.utilisateur.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.delmaire.utilisateur.business.impl.UtilisateurBusiness;

/**
 * Servlet implementation class SupprimerUtilisateurServlet
 */
@WebServlet("/supprimer")
public class SupprimerUtilisateurServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UtilisateurBusiness utilisateurbz = new UtilisateurBusiness();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SupprimerUtilisateurServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String idS = request.getParameter("id");
		int id = Integer.parseInt(idS);
		
		utilisateurbz.supprimerUtilisateur(id);
		/* void ne renvoie rien */
		
		response.sendRedirect("utilisateurs");
		/*ne redirige pas vers une jsp(problème d'url) mais vers la servlet "/utilisateurs"*/
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
