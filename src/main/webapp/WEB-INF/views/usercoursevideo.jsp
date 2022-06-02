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
<table>

		<thead>
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
</body>
</html>