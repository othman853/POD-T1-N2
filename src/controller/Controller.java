package controller;

import java.io.IOException;
import java.lang.reflect.Method;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract class Controller extends HttpServlet{
	
	protected HttpServletRequest request;
	protected HttpServletResponse response;
	protected String url;
	
	protected void redirecionar(String pagina) throws ServletException, IOException{
		RequestDispatcher dispatcher = request.getRequestDispatcher(pagina);
		dispatcher.forward(request, response);		
	}
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response){
		respond(request, response);
	}
	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response){
		respond(request, response);
	}
	
	
	protected void respond(HttpServletRequest request, HttpServletResponse response){
		this.request = request;
		this.response = response;
		
		url = request.getRequestURI().split("/")[2];		
		dispatch();		
	}
	
	public void dispatch() {
		Method metodo;
		try {
			metodo = getClass().getDeclaredMethod(url);
			metodo.invoke(this);
		} catch (Exception ex) {
			ex.printStackTrace();
		}			
	}
}
