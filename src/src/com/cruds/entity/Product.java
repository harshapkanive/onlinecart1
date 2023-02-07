package src.com.cruds.entity;

public class Product {
	
	private int pid;
	private double price;
	private int quantity;
	private String productname;


	public Product(int pid, double price, int quantity,String productname) {
		super();
		this.pid = pid;
		this.price = price;
		this.quantity = quantity;
		this.productname= productname;
	}
		

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", price=" + price + ", quantity=" + quantity + ", productname=" + productname
				+ "]";
	}

}
