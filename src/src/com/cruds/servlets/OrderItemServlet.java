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
import src.com.cruds.entity.OrderItem;
import src.com.cruds.entity.Product;
import src.com.cruds.service.WebService;

/**
 * Servlet implementation class OrderItemServlet
 */
public class OrderItemServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public OrderItemServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
		//int quantity =(int) session.getAttribute("QUA");
		String orderId = (String) session.getAttribute("ORDERID");
		String productname = (String)session.getAttribute("PNAME");



		WebService.addOrderItem(new OrderItem(orderId,pid,1,productname));




		List<OrderItem> olist = WebService.addOrderItem(orderId);
		session.setAttribute("ORDERITEM", olist);

		System.out.println(olist);
		RequestDispatcher rd = request.getRequestDispatcher("orderitem.jsp");
		rd.forward(request, response);


	}

}
