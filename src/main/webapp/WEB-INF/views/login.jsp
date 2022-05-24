<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<%@taglib prefix="d" uri="http://java.sun.com/jsp/jstl/core"%>
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

</head>
<body>
	<div>
		<h3>Log In As User</h3>
		<div>
		<form action="userhome" method="post">
			<div>
				<label for="exampleInputEmail1">Email</label> <input type="email"
					id="exampleInputEmail1"
					aria-describedby="emailHelp" placeholder="Enter email" name="email" required>
			</div>
			
			<div>
				<label for="password">Password</label> <input type="password"
					id="password" aria-describedby="emailHelp"
					placeholder="Enter Password" name="password" required>
			</div>
			
			<div>
				<button type="submit">Login</button>
			</div>
			<div>
			<span>Don't Have A Account?  
				<a href="signup">Sign Up</a></span>
			</div>
			
			<div>
			<span>Login As Instructor !!  
				<a href="loginInstructor">LogIn As Instructor</a></span>
			</div>
		</form>
		</div>
	</div>
</body>
</html>