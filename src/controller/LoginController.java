package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpSession;

import model.Dao;
import model.Login;

@WebServlet(name="login", urlPatterns="/login")
public class LoginController extends Controller{
	
	private Dao<Login> dao;
	
	public LoginController(){
		super();
	}
	
	public void login() throws ServletException, IOException{		
		if(request.getMethod().equals(GET)){
			redirecionar("view/login/login.jsp");
		}
		
		else{
			HttpSession session = request.getSession(true);
			session.setAttribute("usuario", "maroto");			
		}
	}

}
