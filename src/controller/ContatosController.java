package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import annotation.Map;

@WebServlet(name="contatos")
public class ContatosController extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	
	private HttpServletRequest request;
	private HttpServletResponse response;
	
	public ContatosController(HttpServletRequest request,
			HttpServletResponse response) {
		
		this.request = request;
		this.response = response;
	}
	
	private void redirecionar(String pagina) throws ServletException, IOException{
		RequestDispatcher dispatcher = request.getRequestDispatcher(pagina);
		dispatcher.forward(request, response);		
	}
	
	@Map(endereco="home")
	public void home() throws ServletException, IOException{				
		redirecionar("view/index.jsp");
	}
	
	@Map(endereco="listar", autenticar=true)
	public void listar() throws ServletException, IOException{		
		redirecionar("view/contatos/listar.jsp");		
	}
	
	@Map(endereco="cadastrar", autenticar=true)
	public void cadastrar() throws ServletException, IOException{		
		redirecionar("view/contatos/cadastrar.jsp");
	}
}