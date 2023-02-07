<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<a href="login.css"></a>
<head>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<link rel="stylesheet" href="login.css"></link>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
<style>
body  {
  
}
</style>

<script type="text/javascript">
function changeBackground(color) {
	   document.body.style.background = color;
	}

	window.addEventListener("load",function() { changeBackground('powderblue') });
	function validate()
	{
		//var username = document.getElementById("harshap");
		//var password = document.getElementById(1234);
		var username = document.getElementById("uname");
		var password = document.getElementById("pass");
		
		if(username.value.trim() == "" || password.value.trim() == "")
		{
			alert("No blank values allowed.");
			return false;
		}
		else
		{
			true;	
		}
	}
	
	function loginStatus(login)
	{
		if(login)
		{
			alert("Login successful");
			
		}
		else
		{
			alert("Invalid login, please try again.");
		}
	}
	

</script>

</head>
<body>




<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<link rel="stylesheet" href="login.css"></link>
<!------ Include the above in your HEAD tag ---------->

<!DOCTYPE html>
<html>
<head>
	<title>Login Page</title>
   <!--Made with love by Mutiullah Samim -->
   <body style="background-color:powderblue;">
   
	<!--Bootsrap 4 CDN-->
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    
    <!--Fontawesome CDN-->
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">

	<!--Custom styles-->
	<link rel="stylesheet" type="text/css" href="login.css">
	
</head>
<body>
<form  action="LoginServlet" method="post" onsubmit="return validate()">
<div class="container">
	<div class="d-flex justify-content-center h-100">
		<div class="card">
			<div class="card-header">
				<h3>Sign In</h3>
				<div class="d-flex justify-content-end social_icon">
					<span><i class="fab fa-facebook-square"></i></span>
					<span><i class="fab fa-google-plus-square"></i></span>
					<span><i class="fab fa-twitter-square"></i></span>
				</div>
			</div>
			<div class="card-body">
				<form>
					<div class="input-group form-group">
						<div class="input-group-prepend">
							<span class="input-group-text"><i class="fas fa-user"></i></span>
						</div>
						<input type="text" name="userName" id="uname" placeholder="username" />
						
					</div>
					<div class="input-group form-group">
						<div class="input-group-prepend">
							<span class="input-group-text"><i class="fas fa-key"></i></span>
						</div>
						<input align="middle" type="password" name="password" id ="pass" placeholder="password"/>
					</div>
					<div class="row align-items-center remember">
						<input type="checkbox">Remember Me
					</div>
					<div class="form-group">
						<input type="submit" value="Login" class="btn float-right login_btn">
					</div>
				</form>
			</div>
			<div class="card-footer">
				<div class="d-flex justify-content-center links">
					Don't have an account?<a href="RegisterServlet">Register</a>
				</div>
				<div class="d-flex justify-content-center">
					<a href="#">Forgot your password?</a>
				</div>
			</div>
		</div>
	</div>
</div>
</form>
</body>
</html>
	<!-- 
	       <h1 align="center">LOGIN</h1>						
	<form  action="LoginServlet" method="post" onsubmit="return validate()">
		<pre>							
								<label><b><font size="4" color="blue">User Name :</font></b></label><input type="text" name="userName" id="uname" /><br/>			
		
		
		
								<label><b><font size="4" color="blue">Password  :</font></b></label><input align="middle" type="password" name="password" id ="pass"/><br/>
										
										
										
										<button  type="submit" value="Login">Submit</button></pre>
	</form><br/>
	
	<pre>
	
	
								  <b><font size ="4"></font></b><a href="RegisterServlet" shape="circle"><b><font size="4">register</font></b></a>
									
									
									
							 -->		
									
									
							      	  

</body>
</html>