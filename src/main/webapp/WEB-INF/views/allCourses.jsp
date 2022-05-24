<html>
<head>
<%@page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
</head>
<body>
	<form method="post">
		<div>
			<h1>All Courses</h1>
			<table>
				<thead>
					<tr>
						<th scope="col">Course Id</th>
						<th scope="col">Course Title</th>
						<th scope="col">Course Description</th>
						<th scope="col">Course Link</th>
						<th scope="col">Course Price</th>
						<th scope="col">Instructor Id</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${allCourses }" var="p">
						<tr>
							<th scope="row">${p.cid }</th>
							<td>${p.title }</td>
							<td>${p.description }</td>
							<td><a href="${p.link }">Click Here</a></td>
							<td>${p.price }</td>
							<td>${p.id }</td>
							<td><button><a href="${pageContext.request.contextPath }/userenroll/${uid}/${p.cid}">Enroll Now</a></button></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</form>
</body>
</html>
