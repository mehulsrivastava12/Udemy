<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<%@taglib prefix="d" uri="http://java.sun.com/jsp/jstl/core"%>
<head>
<%@ include file="./base.jsp"%>
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
		<h3 class="text-center mb-5">My Profile</h3>
		<div class="card" style="width: 600px; margin-left: 250px;">
			<form action="#" method="post">
							<input type="text" value="${user.id }" name="id" />
					<div class="form-group">
						<label for="name">Product Name</label><input type="text"
							class="form-control" id="name" area-describedby="emailhelp"
							name="name" placeholder="Enter the product name here"
							value="${user.email }">
					</div>
			</form>
		</div>
	</div>
</body>
</html>