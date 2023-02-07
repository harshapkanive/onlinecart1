package src.com.cruds.entity;

public class OrderItem {
	

	private String orderId;
	private int pid;
	private int quantity;
	private String productname;
	
	public OrderItem(String orderId, int pid, int quantity, String productname) {
		super();
		this.orderId = orderId;
		this.pid = pid;
		this.quantity = quantity;
		this.productname = productname;
	}

	
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	@Override
	public String toString() {
		return "OrderItem [ orderId=" + orderId + ", pid=" + pid + ", quantity=" + quantity
				+ ", productname=" + productname + "]";
	}

}
