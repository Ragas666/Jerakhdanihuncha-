<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>

	<div class="container">
		<img alt="" class="rounded" src="img/employee.jpg" height="400"
			width="1100">
		<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<ul class="navbar-nav">
			<li class="nav-item"><a class="nav-link" href="Logout">Logout</a>
			</li>
			<li class="nav-item"><a class="nav-link" href="showEmployees">Show
					Employees </a></li>
			<li class="nav-item"><a class="nav-link" href="showEmployees">Employee
					Registration</a></li>
		</ul>
		</nav>
		<br>

	</div>
	<div class="container">

		<form action="searchEmployee" method="post">
			<div>
				<input type="text" name="search">
				<button>Search</button>

			</div>
			</br>
		</form>

		<h2>Check Employee Details Here</h2>


		<table class="table">
			<thead>
				<tr>
					<th>Id</th>
					<th>Name <a href=ascByName>
							<button type="button" class="btn btn-info">Asc</button>
					</a> <a href=descByName>
							<button type="button" class="btn btn-secondary">Desc</button>
					</a></th>
					<th>Email</th>
					<th>Password</th>
					<th>Salary</th>
					<th>Photo</th>
					<th>Action</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${allEmployees}" var="employee">
					<tr>
						<td>${employee.employeeId}</td>
						<td>${employee.employeeName}</td>
						<td>${employee.emailId}</td>
						<td>${employee.password}</td>
						<td>${employee.salary}</td>
						<td><img src="data:image/jpeg;base64,${employee.photo}" style="height: 120px;"  class="zoom"/>
 						
 						<td><a href="updatePrfl?employeeId=${employee.employeeId}">
								<img src="img/edit.png" style="height:40px">
						</a> <a href="delete?employeeId=${employee.employeeId}">
								<button type="button" class="btn btn-danger">Del</button>
						</a></td>

					</tr>
				</c:forEach>

			</tbody>
		</table>

	</div>


</body>
</html>
</html>