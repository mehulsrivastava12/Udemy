<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>
<%@ include file="./base.jsp"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Instructor Course</title>
</head>
<body class="bg-light">
	<form method="post">
		<div class="container mt-3">
			<div class="row">
				<div class="col-md-12">
					<h1 class="text-center mt-5 mb-5 card alert alert-primary"
						style="width: 500px; margin-left: 300px">Instructor Course</h1>
					<table
						class="table table-hover justify-content-center text-center ml-3 mr-3">
						<thead class="thead-light">
							<tr>
								<th scope="col">Course Title</th>
								<th scope="col">Course Description</th>
								<th scope="col">Course Price</th>
								<th scope="col">Add Video</th>
								<th scope="col">Show Tutorial</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${instructorCourse }" var="p">
								<tr>
									<td>${p.title }</td>
									<td>${p.description }</td>
									<td>${p.price }</td>
									<td><a
										href="${pageContext.request.contextPath }/addvideoform/${p.cid}">Add
											Video</a></td>
									<td><a
										href="${pageContext.request.contextPath }/mycoursevideo/${p.cid}">Click
											Here</a></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</form>
</body>
</html>