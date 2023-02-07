<%@page import="src.com.cruds.entity.Cart"%>
<%@page import="src.com.cruds.entity.Order"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Orders Page</title>
<link rel="stylesheet" href="cart.css"></link>
<body style="background-color:powderblue">
</head>
<body>

    <%
    String userName = (String)session.getAttribute("USERNAME");
    List<Order> olist = (List<Order>) session.getAttribute("ORDERS");
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
                <td> User Name</td>
                <td> price </td>
                <td> Order Date</td>
                <td> Delivery Date </td>
                </tr>
                </thead>
                
        <%
         for (Order o : olist)
         {
        %>  
        
        <tr>
              <td><%=o.getOrderId() %></td>
              <td><%=o.getUserName() %></td>
              <td><%=o.getPrice() %></td>
              <td><%=o.getOrderDate() %></td>
              <td><%=o.getDlvDate() %></td>
         </tr>
         
              
             <%
         }
             %> 
                
                
     <a href="OrderItemServlet">OrderItem</a>           
                
                

</body>
</html>