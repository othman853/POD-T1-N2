package rotas;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import annotation.Map;
import controller.ContatosController;
import controller.LoginController;

@WebServlet(name = "despachante", urlPatterns = "/*")
public class Despachante extends HttpServlet {

	private static final Class[] CONTROLLERS = { ContatosController.class,
			LoginController.class };

	private HttpServletResponse response;
	private HttpServletRequest request;

	private void scan() throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, SecurityException, IOException, ServletException {
		String url = request.getRequestURI().split("/")[2];

		for (Class controller : CONTROLLERS) {
			for (Method metodo : controller.getMethods()) {
				if (metodo.isAnnotationPresent(Map.class)) {

					Map map = (Map) metodo.getAnnotation(Map.class);
					String urlMetodo = (map.endereco().isEmpty()) ? metodo
							.getName() : map.endereco();

					if (url.equalsIgnoreCase(urlMetodo)) {
						response.getWriter().write(controller.getSimpleName() + "::" + urlMetodo);
						
						Object ctr = controller.getConstructors()[0].newInstance(request, response);
						metodo.invoke(ctr);
						
						RequestDispatcher dispatcher = request.getRequestDispatcher("view/" + controller.getSimpleName().toLowerCase() + "/" + metodo.getName() +".jsp");
						dispatcher.forward(request, response);						
					}
				}
			}
		}
		
		response.getWriter().write("\n Path not found");
	}

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException {

		this.request = request;
		this.response = response;
		
		try{
			scan();
			return;
		}catch(Exception ex){
			response.getWriter().write("\n " + ex.getClass().getSimpleName() + " - " + ex.getMessage());
		}		

		response.getWriter().write("\n OK");
	}
}
