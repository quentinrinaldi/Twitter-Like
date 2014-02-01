package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

import services.CreateUserService;


public class CreateUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public CreateUserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		
		if ( !nom.isEmpty() && !prenom.isEmpty() && !login.isEmpty() && !password.isEmpty() && !email.isEmpty()) {
			JSONObject jsonResponse = CreateUserService.createUserJSON(prenom, prenom, login, password, email);
			response.getWriter().print(jsonResponse);
		}
		else {
			response.getWriter().print("{\"status\" : \"error\", \"code\" : \"0\", \"error_msg\" : \"Tous les champs n'ont pas été renseignés\"}");
		}
	}

}
