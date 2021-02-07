<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Employee</title>

  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
</head>
<body>
	
		<h1>Employee edit Page</h1>
		<%-- <c:if test="${message ne null}">
			<div class="alert alert-success"><strong>${message}</strong></div>
		</c:if> --%>
		
		<form action="update" method="post">
		
		<div class="row">
				<div class="col-md-3"></div><div class="col-md-9"><input type="hidden" value="${employee.employeeId }" name="employeeId"></div>
			</div>
			<div class="row">
				<div class="col-md-3">EmployeeName</div><div class="col-md-9"><input type="text" value="${employee.employeeName }"name="employeeName"></div>
			</div>
			</br>
			<div class="row">
				<div class="col-md-3">SALARY</div><div class="col-md-9"><input type="number" value="${employee.salary }"name="salary"></div>
			</div>
			</br>
			<div class="row">
				<div class="col-md-3">EMAIL_ID</div><div class="col-md-9"><input type="text" value="${employee.emailId }"name="emailId"></div>
			</div>	
			<br>
			<div class="row">
				<div class="col-md-3">PASSWORD</div><div class="col-md-9"><input type="password" value="${employee.password }"name="password"></div>
			</div>	
			<button type="submit" class="btn btn-success">Edit</button>
		</form>
	</div>
</body>
</html>