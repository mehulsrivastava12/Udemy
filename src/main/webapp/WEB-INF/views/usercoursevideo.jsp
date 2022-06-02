<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="./base.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Course Videos</title>
</head>
<body>
	<div
		class="container mt-3 card mt-5 shadow-lg p-3 mb-5 bg-white rounded">
		<div class="row">
			<div class="col-md-12">
				<h3 class="text-center mt-5 mb-5 card bg-light"
					style="width: 700px; margin-left: 200px;">My Video</h3>
				<table class="table table-hover justify-content-center text-center">
					<thead class="thead-light">
						<tr>
							<th scope="col">Video Title</th>
							<th scope="col">Video Description</th>
							<th scope="col">Video Link</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${myVideo }" var="p">
							<tr>
								<td scope="row">${p.title}</td>
								<td>${p.description }</td>
								<td><a href="${p.link }">Click Here</a></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</div>
</body>
</html>