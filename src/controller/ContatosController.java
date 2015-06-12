package controller;


import java.io.IOException;

import javax.servlet.ServletException;


public class ContatosController extends Controller{
	
	private static final long serialVersionUID = 1L;	
	
	public ContatosController() {		
		super();		
	}
	
	
	public void home() throws ServletException, IOException{		
		redirecionar("view/index.jsp");
	}	
	
	public void listar() throws ServletException, IOException{		
		redirecionar("view/contatos/listar.jsp");		
	}
	
	public void cadastrar() throws ServletException, IOException{		
		if(request.getMethod().equals("GET")){
			redirecionar("view/contatos/cadastrar.jsp");			
		}else{
			System.out.println("Oi");
		}
		
	}	
}