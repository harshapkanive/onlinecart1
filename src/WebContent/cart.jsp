<%@page import="src.com.cruds.entity.Product"%>
<%@page import="java.util.List"%>
<%@page import="src.com.cruds.entity.Cart"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cart Page</title>
<link rel="stylesheet" href="cart.css"></link>
</head>

<body style="background-color:powderblue">



<%
   Cart cart = (Cart) session.getAttribute("CART");
   List<Product> list = cart.getlist();

%>

	<table border="1">
		<thead>
			<tr>
				<td>Product Id</td>
				<td>Price</td>
				<td>Product Name</td>
				<td>Quantity</td>
			</tr>
		</thead>
		<tbody>

			<%
    for(Product p : list){
    
    %>

			<tr>
				<td><%= p.getPid() %></td>
				<td><%= p.getPrice() %></td>
				<td><%=p.getProductname() %></td>
				<td><%=p.getQuantity() %></td>
			</tr>


			<%
    }
  %>
		</tbody>
	</table>

	<a href="LoginServlet" >Buy Now</a>


</body>
</html>