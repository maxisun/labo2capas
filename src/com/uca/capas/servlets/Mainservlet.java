package com.uca.capas.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Mainservlet
 */
@WebServlet("/Mainservlet")
public class Mainservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Mainservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		/*String dep = request.getParameter("dep");
		double money = Double.parseDouble(request.getParameter("dinero"));
		int nlab = Integer.parseInt(request.getParameter("nLabos"));
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h3>" + "suma total de laboratorio" + dep +"fue: $" + money*nlab + "</h3>");
		out.println("</body>");
		out.println("</html>");*/
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String user = request.getParameter("user");
		String pass = request.getParameter("pass");
		PrintWriter out = response.getWriter();
		if(user.equals("maxisun") && pass.equals("lolis")) {
			out.println("<html>");
			out.println("<body>");
			out.println("<h1>" + "Inicio de sesion correcto: user: " + user + " password: " + pass + "</h1>");
			out.println("</body>");
			out.println("</html>");
		} else {
			out.println("<html>");
			out.println("<body>");
			out.println("<h1>" + "Inicio de sesion incorrecto: user: " + user + " password: " + pass + "</h1>");
			out.println("</body>");
			out.println("</html>");
		}
	}

}
