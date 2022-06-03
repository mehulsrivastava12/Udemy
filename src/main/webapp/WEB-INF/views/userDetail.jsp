<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>
<%@ include file="./base.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Details</title>
</head>
<body>
	<div class="container mt-3">
		<div class="row">
			<div class="col-md-12">
				<h1 class=" mt-5 text-center">Profile</h1>
				<div class="text-center">
					<img style="width: 200px; height: 200px;"
						src="https://t3.ftcdn.net/jpg/03/46/83/96/360_F_346839683_6nAPzbhpSkIpb8pmAwufkC7c5eD7wYws.jpg" />
				</div>
				<table class="table table-hover justify-content-center text-center">
					<thead class="thead-dark">
						<tr>
							<th scope="col">First Name</th>
							<th scope="col">Last Name</th>
							<th scope="col">Date Of Birth</th>
							<th scope="col">Email</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td>${user.firstName }</td>
							<td>${user.lastName }</td>
							<td>${user.dob }</td>
							<td>${user.email }</td>
						</tr>
					</tbody>
				</table>
				<div class="text-center mt-5 d-flex justify-content-center p-4">
					<form
						action="${pageContext.request.contextPath }/update/${user.uid }"
						method="post">
						<button type="submit"
							class="text-center ml-5 btn btn-outline-success">Update
							Details</button>
					</form>
					<form
						action="${pageContext.request.contextPath }/delete/${user.uid }"
						method="post">
						<button type="submit"
							class="text-center ml-5 btn btn-outline-danger">Delete
							Account</button>
					</form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>