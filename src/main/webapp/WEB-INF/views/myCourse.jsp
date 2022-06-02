<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<%@ include file="./base.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>My Courses</title>
</head>
<body>
	<div class="container mt-3">
		<div class="row">
			<div class="col-md-12">
				<h3 class="text-center mt-5 mb-5 card alert alert-info"
					style="width: 700px; margin-left: 200px;">My Courses</h3>
				<table class="table table-hover justify-content-center text-center">
					<thead class="thead-light">
						<tr>
							<th scope="col">Course Title</th>
							<th scope="col">Instructor Name</th>
							<th scope="col">Date Enrolled</th>
							<th scope="col">Go To Course</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${myCourse }" var="p">
							<tr>
								<td scope="row">${p.title}</td>
								<td>${p.firstName } ${p.lastName }</td>
								<td>${p.date }</td>
								<td><a
									href="${pageContext.request.contextPath }/usercoursevideo/${p.cid}">Click
										Here</a></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</div>
</body>
</html>