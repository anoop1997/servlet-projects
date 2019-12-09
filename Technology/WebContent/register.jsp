<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <link rel="stylesheet" type="text/css" href="register.css">
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container">
<div class="row">

<center>
<form action="/Technology/RegisterServlet" class="form-control" id="display"  method="post">
<h1 style="color:green;">Sign up</h1>
<input type="text" placeholder="username" class=" form-control" required="required" id="name" onblur="" name="uname">
<div id="name1"></div>
<br>
<input type="password" placeholder="password" class=" form-control"required="required" id="pass" name="password" onblur="">
<div id="pass1"></div>
<br>
<input type="password" placeholder="Re-password" class=" form-control"required="required" id="Rpass"  name="Rpassword" onblur="">
<div id="Rpass1"></div>
<br>
<input type="number" placeholder="mobile-no" class=" form-control" required="required" id="number"" name="Mnumber">
<div id="number1"></div>
<br>
<input type="date" placeholder="DD-MM-YYYY" class=" form-control"required="required" id="date"name="Date">
<input type="submit" value="Register" class="btn  btn-success" style="margin-top:1em;">
<br>

<label>Already a Member Click,<a Href:"">Login</a></label>

</form>

</center>


</div>

</div>
<script type="text/javascript">

 function f1()
{
	 var a=document.getElementById("name").value;
	 
	 if(a.length<6)
		 {
		     document.getElementById("name1").innerHTML="name too short !";
		     name.focus();
		 }
	 else
		 {
		 document.getElementById("name1").innerHTML="";
		 }
	 
	 
	}
 function f2()
 {
 	 var a=document.getElementById("pass").value;
 	 
 	 if(a.length<6)
 		 {
 		     document.getElementById("pass1").innerHTML="password too short !";
 		     pass.focus();
 		 }
 	 else
	 {
	 document.getElementById("pass1").innerHTML="";
	 }
 	 
 	 
 	}
 function f3()
 {
 	 var a=document.getElementById("pass").value;
 	var  b=document.getElementById("Rpass").value;
 	 
 	 
 	 if(a!=b)
 		 {
 		     document.getElementById("Rpass1").innerHTML="password not same";
 		     Rpass.focus();
 		 }
 	 else
	 {
	 document.getElementById("Rpass1").innerHTML="";
	 }
 	 
 	 
 	}


</script>
</body>
</html>