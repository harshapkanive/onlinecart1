package src.com.cruds.entity;

import java.util.Date;

public class Order {
	private String orderId;
	private String userName;	
    private double price;	
	private Date orderDate;
	private Date dlvDate;
	
	public Order(String orderId,String userName,double price, Date orderDate, Date dlvDate) {
		super();
		this.orderId = orderId;
		this.userName = userName;
		this.price = price;
		this.orderDate = orderDate;
		this.dlvDate = dlvDate;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public Date getDlvDate() {
		return dlvDate;
	}
	public void setDlvDate(Date dlvDate) {
		this.dlvDate = dlvDate;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + "userName=" + userName + ",price=" + price + ", orderDate=" + orderDate
				+ ", dlvDate=" + dlvDate + "]";
	}
	
	

}
