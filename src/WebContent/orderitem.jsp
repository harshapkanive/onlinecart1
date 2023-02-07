<%@page import="src.com.cruds.entity.Cart"%>
<%@page import="src.com.cruds.entity.OrderItem"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>orderitem page</title>
<link rel="stylesheet" href="cart.css"></link>
<body style="background-color:powderblue">
</head>
<body>

	<%
	String userName = (String)session.getAttribute("USERNAME");
	String orderId = (String) session.getAttribute("ORDERID");
	String productname = (String)session.getAttribute("PNAME");
	int pid= (int) session.getAttribute("PID");
    List<OrderItem> olist = (List<OrderItem>) session.getAttribute("ORDERITEM");
    Cart cart = (Cart) session.getAttribute("CART");  
    %>
      <h1><%=userName %>'s Order</h1><br/>
      
      <a href="cart.jsp">Home</a> <br>
      <br>
      <%-- <b> OrderId = <%orderid %> </b>--%>
      
      <hr/> 
      
      <table border="1">
        <thead>
             <tr>
                <td>Order Id </td>
                <td>pid</td>
                <td>quantity </td>
                <td>productname</td>
                
                </tr>
                </thead>
                
        <%
         for (OrderItem o : olist)
         {
        %>  
        
        <tr>
              <td><%=o.getOrderId() %></td>
              <td><%=o.getPid()%></td>
              <td><%=o.getQuantity()%></td>
              <td><%=o.getProductname() %></td>
              
         </tr>
         
              
             <%
         }
             %> 
      



</body>
</html>