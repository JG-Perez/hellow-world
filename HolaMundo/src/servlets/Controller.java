package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String operacion = request.getParameter("operacion");
		switch(operacion) {
		case "index":
			response.sendRedirect("index.jsp");
			break;
		case "uno":
			response.sendRedirect("uno.jsp");
			//response.getWriter().append("Preparar las acciones de la operacion de inicio: " + operacion);
			break;
		case "dos":
			response.sendRedirect("dos.jsp");
			//response.getWriter().append("Prepara las acciones de la operacion listar alumnos: " + operacion);
			break;
			default:
				response.getWriter().append("Operacion no permitida o no reconocida");
		}
		response.getWriter().append("Hello World Java EE!!");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}