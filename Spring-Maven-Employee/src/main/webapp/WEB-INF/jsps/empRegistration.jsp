<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>


</head>
<body>
<div class="container">
<nav class="navbar navbar-expand-sm bg-light">
  <ul class="navbar-nav">
    <li class="nav-item">
      <a class="nav-link" href="loginn">LOGIN</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="#">Show Employees </a>
    </li>
    
  </ul>
</nav>
<br>
${ msg }
</div>
<div class="container">
		<h1>Employee Registration Page</h1><br><br>
		
		<form action="postregistration" method="post">
		<div class="row">
				<div class="col-md-3">Emp Name</div><div class="col-md-9"><input type="text" name="employeename"></div>
			</div>
			<br>
			<div class="row">
				<div class="col-md-3">Email Id</div><div class="col-md-9"><input type="text" name="emailid"></div>
			</div>
			<br>
			<div class="row">
				<div class="col-md-3">Password</div><div class="col-md-9"><input type="text" name="password"></div>
			</div>
			<br>
			<div class="row">
				<div class="col-md-3">Salary</div><div class="col-md-9"><input type="text" name="salary"></div>
			</div>
			</br>
			
			<button type="submit" class="btn btn-success">Register</button>
		</form>
	</div>
 
 
 
</div>


</body>


</body>
</html>