package src.com.cruds.entity;

import java.util.ArrayList;
import java.util.List;

public class Cart {

	private List<Product> list;
	private double price;
	private int pid;
	private int quantity;
	private String productname;
	
	


	public void add(Product p) {
		
		if(list==null)
		{
		list = new ArrayList<>();	
		}
	list.add(p);
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
	
	public List<Product> getlist() {
		return list;
	}

	public double getprice(){
		return price;
	}

     public int getpid(){
        return pid;
     }
     
}
     
     
/*	public void add(Product p)
	{
		cart.add(new Product(p.getPid(), p.getPrice()));
	}
*/

