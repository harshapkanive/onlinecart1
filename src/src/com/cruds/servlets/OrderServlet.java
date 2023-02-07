package src.com.cruds.servlets;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import src.com.cruds.entity.Cart;
import src.com.cruds.entity.Order;
import src.com.cruds.entity.Product;
import src.com.cruds.service.WebService;

/**
 * Servlet implementation class OrderServlet
 */
public class OrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OrderServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    
		HttpSession session = request.getSession();
		
		Cart cart = (Cart) session.getAttribute("CART");
		List<Product> list = cart.getlist();
		
		int pid= (int) session.getAttribute("PID");
		String userName = (String) session.getAttribute("USERNAME");
		double price = (double) session.getAttribute("PRICE");
		
		Calendar c = Calendar.getInstance(); // 7 days
		Date orderDate = c.getTime();
		c.add(Calendar.DATE, 7);
		Date dlvDate = c.getTime();
		
		String uniqueID = UUID.randomUUID().toString();
		String orderId = uniqueID.substring(0, 10);
		System.out.println(orderId);
		
		WebService.addOrder(new Order(orderId,userName,price,orderDate,dlvDate));
		
		session.setAttribute("ORDERID", orderId);
		session.setAttribute("DLVDATE", dlvDate);
		
		List<Order> olist = WebService.addOrderDetails(userName);
		session.setAttribute("ORDERS", olist);
		
		System.out.println(olist);
		RequestDispatcher rd = request.getRequestDispatcher("order.jsp");
		rd.forward(request, response);
		
		
		
	}

}
