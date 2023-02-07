package src.com.cruds.service;



import java.util.List;

import src.com.cruds.db.WebcartDAO;
import src.com.cruds.entity.Consumer;
import src.com.cruds.entity.Order;
import src.com.cruds.entity.OrderItem;
import src.com.cruds.entity.Product;

public class WebService {
	
	public static boolean register(Consumer c)
	{
		WebcartDAO dao = new WebcartDAO();
		return dao.addConsumer(c);	
	}
	
	public static boolean validateUserLogin(String userName,String password )
	{
		WebcartDAO dao = new WebcartDAO();
		return dao.authenticateUserLogin(userName, password);
	}
	
	public static List<Order> addOrderDetails( String userName)
	{
		WebcartDAO dao = new WebcartDAO();
		return dao.getOrderDetails(userName);
	}
	public static int addOrder(Order o)
	{
		WebcartDAO dao = new WebcartDAO();
		return dao.addOrder(o);
	}
	
	public static List<OrderItem> addOrderItem( String orderId)
	{
		WebcartDAO dao = new WebcartDAO();
		return dao.getOrderItemsDetails(orderId);
	}
	
	public static boolean addOrderItem(OrderItem o)
	{
		WebcartDAO dao = new WebcartDAO();
		return dao.addOrderItem(o);
	}
	
	


}