package src.com.cruds.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import src.com.cruds.entity.Consumer;
import src.com.cruds.entity.Order;
import src.com.cruds.entity.OrderItem;




public class WebcartDAO {

	public boolean addConsumer(Consumer c)
	{
		String sql0 = "select userName from customer where userName = ?";
		String sql1 = "insert into customer values(?,?,?,?,?)";
		String uName=null;
		int row = 0;
		try(Connection conn = DBconnectionmanager.getConnection())
		{
			PreparedStatement ps0 = conn.prepareStatement(sql0);
			ps0.setString(1, c.getUsername());
			ResultSet rs = ps0.executeQuery();
			if(rs != null && rs.next())
			{
				uName = rs.getString(1);
			}
			if(uName != null && uName.equals(c.getUsername()))
			{
				System.out.println("Username already in use. Select another one");
				return false;
			}
			PreparedStatement ps1 = conn.prepareStatement(sql1);	
			ps1.setString(1, c.getUsername());
			ps1.setString(2, c.getPassword());
			ps1.setString(3, c.getName());
			ps1.setString(4, c.getPhNo());
			ps1.setString(5, c.getEmail());


			row = ps1.executeUpdate();

		}catch (Exception e) {
			e.printStackTrace();
		}

		return (row>0);
	}

	public boolean authenticateUserLogin(String user, String password)
	{
		boolean authenticate = false;
		String sql="select password from customer where userName=?";
		String p = null;

		try(Connection conn = DBconnectionmanager.getConnection()) {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, user);
			ResultSet rs = ps.executeQuery();
			if(rs != null && rs.next())
			{
				p = rs.getString(1);
			}

			if(p != null && p.equals( password))
			{
				authenticate = true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return authenticate;
	}

	public int addOrder(Order o) 
	{
		int row = 0;
		String sql="insert into orders values (?,?,?,?,?)";
		int orderId=0;
		java.sql.Date dlvDate = new java.sql.Date(o.getDlvDate().getTime());
		java.sql.Date orderDate = new java.sql.Date(o.getOrderDate().getTime());

		try(Connection conn = DBconnectionmanager.getConnection())
		{
			PreparedStatement ps = conn.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
			ps.setString(2,o.getUserName());
			ps.setString(1, o.getOrderId());
			ps.setDouble(3, o.getPrice());			
			ps.setDate(4, orderDate);
			ps.setDate(5, dlvDate);

			row = ps.executeUpdate();
			ResultSet rs1 = ps.getGeneratedKeys();
			rs1.next();
			//  orderId = rs1.getInt(1);
			// return orderId;
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
		return 0;
	}		




	public List<Order> getOrderDetails(String userName)
	{
		String sql = "select orderId,userName,price,orderDate,dlvDate from orders where userName = ? ";
		List<Order> orders = new ArrayList<>(); 

		try(Connection conn = DBconnectionmanager.getConnection())
		{
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, userName);
			ResultSet rs = ps.executeQuery();
			while(rs != null && rs.next())
			{
				orders.add(new Order(rs.getString(1),rs.getString(2),rs.getDouble(3),rs.getDate(4),rs.getDate(5)));
			}

		}catch(SQLException e)
		{
			e.printStackTrace();
		}

		return orders;
	} 


	public boolean addOrderItem(OrderItem o)
	{
		int row = 0;
		String sql = "insert into orderitem values(?,?,?,?)";

		try(Connection conn = DBconnectionmanager.getConnection())
		{
			PreparedStatement ps = conn.prepareStatement(sql);			
     		ps.setString(1, o.getOrderId());
			ps.setInt(2, o.getPid());
			ps.setInt(3, o.getQuantity());
			ps.setString(4,o.getProductname());
			row = ps.executeUpdate();
		}catch(SQLException e)
		{
			e.printStackTrace();
		}

		return row>0;
	}
	
	public List<OrderItem> getOrderItemsDetails(String orderId)
	{
		String sql = "select orderId,pid,quantity,productname from orderitem where orderId = ?";
		List<OrderItem> list = new ArrayList<>(); 

		try(Connection conn = DBconnectionmanager.getConnection())
		{
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, orderId);
			ResultSet rs = ps.executeQuery();
			while(rs != null && rs.next())
			{
				list.add(new OrderItem(rs.getString(1),rs.getInt(2),rs.getInt(3),rs.getString(4)));
			}

		}catch(SQLException e)
		{
			e.printStackTrace();
		}

		return list;
	} 

}