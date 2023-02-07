package src.com.cruds.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import src.com.cruds.entity.Cart;
import src.com.cruds.entity.Product;

/**
 * Servlet implementation class CartServlet
 */
public class CartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CartServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action =request.getParameter("ACTION");
		RequestDispatcher rd = null;
		
		if ("VIEW".equalsIgnoreCase(action))
		{
			rd= request.getRequestDispatcher("cart.jsp");
		}
		else
		{
		//	System.out.println("===================");
			int pid = Integer.parseInt(request.getParameter("pid"));
			double price = Double.parseDouble(request.getParameter("price"));
		//	int quantity = Integer.parseInt(request.getParameter("QUA"));
			String productname = request.getParameter("productname");
			HttpSession session = request.getSession(true);
			Cart cart = (Cart) session.getAttribute("CART");
			
			if(cart == null)
			{
				cart = new Cart ();
				
			}
			
		cart.add(new Product(pid, price,1,productname));	
	//	session.setAttribute("QUA", quantity);
		session.setAttribute("CART", cart);
		session.setAttribute("PNAME", productname);	
		session.setAttribute("PID", pid);
		session.setAttribute("PRICE", price);
		
		request.setAttribute("MSG", "Item added Successfully");
		rd = request.getRequestDispatcher("index.html");
			
		}
		
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
