<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>
<%@ include file="./base.jsp"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Instructor Details</title>
</head>
<body>
	<div class="container mt-3">
		<div class="row">
			<div class="col-md-12">
				<h1 class=" mt-5 text-center">Instructor Profile</h1>
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
							<th scope="col">Action</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td>${instructor.firstName }</td>
							<td>${instructor.lastName }</td>
							<td>${instructor.dob }</td>
							<td>${instructor.email }</td>
							<td>
							<a href="${pageContext.request.contextPath }/updateinstructor/${instructor.id }"><i class="fas fa-pen-nib text-primary ml-5" style="font-size:20px;"></i></a>
							<a href="${pageContext.request.contextPath }/deleteinstructor/${instructor.id }"><i class="fas fa-trash text-danger ml-5" style="font-size:20px;"></i></a>
							</td>
						</tr>
					</tbody>
				</table>
			</div>
		</div>
	</div>
</body>
</html>