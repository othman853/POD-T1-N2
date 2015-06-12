package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="login")
public class LoginController extends HttpServlet{
	
	private HttpServletResponse response;
	private HttpServletRequest request;
	
	public LoginController(HttpServletRequest request, HttpServletResponse response){
		this.request = request;
		this.response = response;
	}
	
	private void redirecionar(String pagina) throws ServletException, IOException{		
		RequestDispatcher dispatcher = request.getRequestDispatcher(pagina);
		dispatcher.forward(request, response);
	}
	
	
	public void login() throws ServletException, IOException{		
		redirecionar("view/login/login.jsp");
	}

}
