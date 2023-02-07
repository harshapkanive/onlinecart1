<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register page</title>
<style>
body  {
 
}
h1{
	color:blue;
}
a{
	color:blue;
}
label{
	color:blue;
}
</style>
<script type="text/javascript">

function changeBackground(color) {
	   document.body.style.background = color;
	}

	window.addEventListener("load",function() { changeBackground('powderblue') });
	function validate()
	{
		var name = document.getElementById("name");
		var phone = document.getElementById("phone");
		var email = document.getElementById("email");
		var username = document.getElementById("uname");
		var password = document.getElementById("pass");

		  function nm()
			{
				var username=document.getElementById("name").value;
				var name_valid=/^[A-Z]+$/;
		  		
						if(!name.match(name_valid))
				{
					document.getElementById("name-error").innerHTML="please enter only capital letters"
				}
				else if(name.match(name_valid))
				{
					document.getElementById("name-error").innerHTML=" "
				}

		      }  



		     function checkPhone() {
			        var phone = document.getElementById("phone").value;
			        var phoneNum = /^\(?([0-9]{3})\)?[-. ]?([0-9]{3})[-. ]?([0-9]{4})$/; 
			            if(phone.value.match(phoneNum))
			            {
			    			document.getElementById("phone-error").innerHTML="please enter valid mobile number"
			    			document.getElementById("phone-error").style.color="red"
			    		}
			            else if(phone.match(phoneNum))
			    		{
			    			document.getElementById("phone-error").innerHTML=" "
			    		}

			    	}
			                
		   
		    		function validateForm() {
		    			var email = document.forms["myForm"]["email"].value;
		    			var atpos = email.indexOf("@");
		    			var dotpos = email.lastIndexOf(".");
		    			if (atpos<1 || dotpos<atpos+2 || dotpos+2>=email.length) {
		    				alert("Not a valid e-mail address");
		    				return false;
		    			}
		    			return true;
		    		}
		    	

		     function paswrd()
		 	{
		 		var password=document.getElementById("pass").value;
		 		var paswrd_valid=/^((?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[/#/@])){8,12}/;
		 		if(!password.match(paswrd_valid))
		 		{
		 			document.getElementById("pass-error").innerHTML="please enter one 1 uppercase 1 lowercase 1number and 1 symbol"
		 			document.getElementById("pass-error").style.color="red"
		 		}
		 		else if(password.match(paswrd_valid))
		 		{
		 			document.getElementById("pass-error").innerHTML=" "
		 		}

		 	}
		
		if(username.value.trim() == "" || password.value.trim() == "" || name.value.trim() == "" || email.value.trim() == "" || phone.value.trim() == "" )
		{
			alert("No blank values allowed.");
			return false;
		}
		else
		{
			true;	
		}
	}
	

</script>
</head>
<body>

	<h1 align="center">Register</h1>
<form action="post"><pre>																		<a href ="LogoutServlet"><b><font size="4"></font></b></a></pre></form>
	<form action="RegisterServlet" method="post" onsubmit="return validate()" >
		<pre>
		
		
		
								<label><b><font size="4">Name         :</font></b></label><input type="text" name="name" id="name"/><br/>
											
											
								<label><b><font size="4">Phone number :</font></b></label><input type="text" name="phNo" id="phone"/><br/>
									
																			
								<label><b><font size="4">E-mail       :</font></b></label><input type="text" name="eMail" id="email" /><br/>
											
											
								<label><b><font size="4">user name    :</font></b></label><input type="text" name="uName" id="uname" /><br/>
											
											
								<label><b><font size="4">password     :</font></b></label><input type="password" name="password" id="pass" /><br/>
											
											
									<button  type="submit" value="Login">Submit</button>
	</pre></form>

</body>
</html>