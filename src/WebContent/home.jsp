<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Page</title>
</head>


<style>
img {
  border: 1px solid #ddd;
  border-radius: 4px;
  padding: 5px;
  width: 150px;
}
</style>
</head>
<body>


<img src="product-page/product-page/images/black.png" alt="black" style="width:150px">
<br/>


<!-- <img alt="" src="WebContent/img/product-1.jpg">
 --><a href="CartServlet?pid=1&price=255500&productname=iwatch&quantity=1"><button>Add to cart</button></a>

  <br> <br>   <a href="CartServlet?ACTION=VIEW"><button>View Cart</button></a>   

</body>
</html>