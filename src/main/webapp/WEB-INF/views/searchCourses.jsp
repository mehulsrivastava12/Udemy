<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>
<%@ include file="./base.jsp"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Courses</title>
</head>
<body>
	<div class="container mt-3">
		<div class="row">
			<div class="col-md-12">
				<h3 class="text-center mt-5 mb-5 card bg-light"
					style="width: 700px; margin-left: 200px;">Courses</h3>
				<table class="table table-hover justify-content-center text-center">
					<thead class="thead-dark">
						<tr>
							<th>Course Title</th>
							<th>Course Description</th>
							<th>Course Price</th>
							<th>Enroll Course</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${searchCourses }" var="p">
							<tr>
								<th>${p.title }</th>
								<td>${p.description }</td>
								<td>&#x20B9; ${p.price }</td>
								<td><a href="${pageContext.request.contextPath }/userenroll/${uid}/${p.cid}/${p.instructor_id }">Enroll Now</a></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</div>
</body>
</html>