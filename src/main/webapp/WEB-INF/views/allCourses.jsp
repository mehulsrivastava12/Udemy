<html>
<head>
<%@page isELIgnored="false"%>
<%@ include file="./base.jsp"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
</head>
<body>
	<form method="post">
		<div>
			<h1>All Courses</h1>
			<table>
				<thead>
					<tr>
						<th>Course Id</th>
						<th>Course Title</th>
						<th>Course Description</th>
						<th>Course Price</th>
						<th>Instructor Id</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${allCourses }" var="p">
						<tr>
							<th>${p.cid }</th>
							<td>${p.title }</td>
							<td>${p.description }</td>
							<td>${p.price }</td>
							<td>${p.id }</td>
							<td><button><a href="${pageContext.request.contextPath }/userenroll/${uid}/${p.cid}/${p.id }">Enroll Now</a></button></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</form>
</body>
</html>
