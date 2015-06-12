package controller;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

@WebServlet(name="Contatos", urlPatterns={"/home", "/listar", "/cadastrar"})
public class ContatosController extends Controller{
	
	private static final String HOME = "view/index.jsp";
	private static final String LISTAR = "view/contatos/listar.jsp";
	private static final String CADASTRAR = "view/contatos/cadastrar.jsp";
	
	private static final long serialVersionUID = 1L;	
	
	public ContatosController() {		
		super();		
	}	
	
	public void home() throws ServletException, IOException{		
		redirecionar(HOME);
	}	
	
	public void listar() throws ServletException, IOException{	
		if(request.getMethod().equals(GET)){
			if(!usuarioAutenticado()){
				redirecionar(LOGIN);			
			}else{
				redirecionar(LISTAR);
			}			
		}				
	}	
	
	public void cadastrar() throws ServletException, IOException{		
		if(request.getMethod().equals("GET")){						
			redirecionar(CADASTRAR);			
		}else{
			System.out.println("Oi");
		}		
	}
	
}