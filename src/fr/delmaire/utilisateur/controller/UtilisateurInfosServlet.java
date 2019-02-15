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

@WebServlet("/utilisateur-infos")
public class UtilisateurInfosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   UtilisateurBusiness utilisateurbz=new UtilisateurBusiness();
	
    public UtilisateurInfosServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String idS = request.getParameter("id");
		int id = Integer.parseInt(idS);
		
		ArrayList<Utilisateur> utilisateurs = utilisateurbz.findAll();
		request.setAttribute("utilisateurs", utilisateurs);
		
		Utilisateur user = utilisateurbz.findOne(id);
		request.setAttribute("utilisateur", user);
		
		this.getServletContext()
		.getRequestDispatcher("/WEB-INF/pages/utilisateur-infos.jsp")
		.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
