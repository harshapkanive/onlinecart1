package src.com.cruds.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import src.com.cruds.entity.Product;
import src.com.cruds.service.WebService;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

			String userName = request.getParameter("userName");
			String password = request.getParameter("password");
			HttpSession session = request.getSession();
			boolean login = false;
			if(WebService.validateUserLogin(userName, password))
			{
				System.out.println(session.getId());
				session.setAttribute("USERNAME", userName);
				login=true;
				request.setAttribute("login_status", login);
				RequestDispatcher rd = request.getRequestDispatcher("checkout.jsp");
				rd.forward(request, response);
			}
			else
			{
				System.out.println("Invalid login, please try again");
				login = false;
				request.setAttribute("login_status", login);
				RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
				rd.forward(request, response);
			}
		
		
	}

}
