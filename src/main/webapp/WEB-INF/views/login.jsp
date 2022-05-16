<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
<%@ include file="./base.jsp" %>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
</head>
<body>
	<div class="container mt-5">
		<h3 class="text-center mb-5">Log In As User</h3>
		<div class="card" style="width: 600px;
    margin-left: 250px;">
		<form action="login-user" method="post">
			<div class="form-group mt-5 ml-5 mr-5">
				<label for="exampleInputEmail1">Email</label> <input type="email"
					class="form-control" id="exampleInputEmail1"
					aria-describedby="emailHelp" placeholder="Enter email" name="email" required>
			</div>
			
			<div class="form-group ml-5 mr-5">
				<label for="password">Password</label> <input type="password"
					class="form-control" id="password" aria-describedby="emailHelp"
					placeholder="Enter Password" name="password" required>
			</div>
			
			<div class="container text-center mb-3">
				<button type="submit" class="btn btn-primary">Login</button>
			</div>
			<div class="text-center mb-2">
			<span>Don't Have A Account?  
				<a href="sign-up">Sign Up</a></span>
			</div>
			
			<div class="text-center mb-2">
			<span>Login As Instructor !!  
				<a href="log-instructor">LogIn As Instructor</a></span>
			</div>
		</form>
		</div>
	</div>
</body>
</html>