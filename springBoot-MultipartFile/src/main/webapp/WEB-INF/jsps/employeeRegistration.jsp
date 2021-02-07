<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>login page</title>

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
      <a class="nav-link" href="login">Login</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="employeeRegistration">Show Employees </a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="employeeRegistration">Employee Registration</a>
    </li>
  </ul>
</nav>
<br>
${ msg }
</div>
	<div class="container">
		<img alt="" class="rounded" src="img/register.jpg" height="300" width="600"/>
		
		  <div class="panel panel-body">
		  <form action="registration" method="post" enctype="multipart/form-data">
			<div class="row">
				<div class="col-md-3">Employee Name</div><div class="col-md-9"><input type="text" name="employeeName"/></div>
			</div>
			<div class="row">
				<div class="col-md-3">EmailId</div><div class="col-md-9"><input type="text" name="emailId"/></div>
			</div>
			<div class="row">
				<div class="col-md-3">Password</div><div class="col-md-9"><input type="text" name="password"/></div>
			</div>
			<div class="row">
				<div class="col-md-3">Salary</div><div class="col-md-9"><input type="text" name="salary"/></div>
			</div>
			
			<div class="row">
				<div class="col-md-3">photo</div><div class="col-md-9"><input type="file" name="file"/></div>
			</div>
			<button type="submit">Registration</button>
			</form>
			</div>
		  
		</div>

</body>
</html>