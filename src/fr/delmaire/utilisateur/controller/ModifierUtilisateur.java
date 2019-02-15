package fr.delmaire.utilisateur.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.delmaire.utilisateur.bean.Utilisateur;
import fr.delmaire.utilisateur.business.impl.UtilisateurBusiness;

/**
 * Servlet implementation class ModifierUtilisateur
 */
@WebServlet("/modifier")
public class ModifierUtilisateur extends HttpServlet {
	private static final long serialVersionUID = 1L;
       UtilisateurBusiness userbz = new UtilisateurBusiness();
   
    public ModifierUtilisateur() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String idString = request.getParameter("id");
		int id = Integer.parseInt(idString);
		
		Utilisateur user = userbz.findOne(id);
		request.setAttribute("utilisateur", user);
		
		this.getServletContext()
		.getRequestDispatcher("/WEB-INF/pages/modifier_utilisateur.jsp")
		.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String numeroId = request.getParameter("id");
		int id = Integer.parseInt(numeroId);
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String numeroString = request.getParameter("numero");
		int numero = Integer.parseInt(numeroString);

		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		String adresse = request.getParameter("adresse");
		String photo = request.getParameter("photo");
	
		
		boolean ok =userbz.update(id,nom, prenom, numero, phone, email, adresse, photo);
		if (ok) {
		response.sendRedirect("utilisateur-infos?id="+id);
		} else {
			response.sendRedirect("modifier?id="+id);
		}
		
	}

}
