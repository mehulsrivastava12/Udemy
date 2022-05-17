<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@ include file="./base.jsp"%>
</head>
<body style="background-color: grey;">
	<div class="container mt-3">
		<div class="row">
			<div class="col-md-6 offset-md-3 card bg-light">
				<h1 class="text-center mb-3">My Profile</h1>
				<h1>${user.uid }</h1>
				<form action="#" method="post">
					<div class="form-group">
						<label for="name">First Name</label><input type="text"
							class="form-control" id="name"
							name="name" placeholder="First Name" value="${user.firstName }">
					</div>
					<div class="form-group">
						<label for="name">Last Name</label><input type="text"
							class="form-control" id="name" name="name"
							placeholder="Last Name" value="${user.lastName }">
					</div>
					<div class="form-group">
						<label for="price">Email</label> <input type="text"
							placeholder="Email" name="price" class="form-control" id="price"
							value="${user.email }">
					</div>
					<div class="form-group">
						<label for="price">Date Of Birth</label> <input type="text"
							placeholder="Date Of Birth" name="price" class="form-control"
							id="price" value="${user.dob }">
					</div>

					<div class="container text-center">
						<a href="${pageContext.request.contextPath }/login-user"
							class="btn btn-outline-danger mb-5">Back</a>
						<button type="submit" class="btn btn-primary mb-5">Update</button>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>