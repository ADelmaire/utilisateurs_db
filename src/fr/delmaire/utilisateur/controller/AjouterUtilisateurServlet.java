package fr.delmaire.utilisateur.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.delmaire.utilisateur.business.impl.UtilisateurBusiness;

/**
 * Servlet implementation class AjouterServlet
 */
@WebServlet("/ajouter")
public class AjouterUtilisateurServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   UtilisateurBusiness ub = new UtilisateurBusiness();
	
    public AjouterUtilisateurServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext()
		.getRequestDispatcher("/WEB-INF/pages/ajouter_utilisateur_formulaire.jsp")
		.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		
		String numeroString = request.getParameter("numero");
		int numero = 0;
		try {
			numero = Integer.parseInt(numeroString);
		} catch (Exception e) {
			e.printStackTrace();
			response.sendRedirect("ajouter");
			return;
			/*return; pour arreter-sortir d' une méthode void
			 * utile en maintenance pr le traitement des exceptions
			 * On peut aussi mettre le catch  à la fin de la méthode et 
			 * ds ce cas pas de return; (voir slack)*/
		}
		
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		String adresse = request.getParameter("adresse");
		String photo = request.getParameter("photo");
	
		if(nom.equals("") 
				|| prenom.equals("")
				|| adresse.equals("")
				|| email.equals("")
				|| phone.equals("") 
				|| photo.equals("")
				/*on aurait pu faire ce traitement dans le business*/
				) {
			response.sendRedirect("ajouter");
			return;
		}
		
		boolean ok =ub.ajouterUtilisateur(nom, prenom, numero, phone, email, adresse, photo);
		
		if (ok) {
			/* ok : raccourci pour ok ==true*/
		response.sendRedirect("utilisateurs");
		} else {
			response.sendRedirect("ajouter");
		}
		
	}
	

}
