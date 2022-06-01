<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="./base.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>My Videos</title>
</head>
<body>
	<div>
		<div>
			<div>
				<h1>My Video</h1>
				<table>
					<thead>
						<tr>
							<th scope="col">Video Title</th>
							<th scope="col">Video Description</th>
							<th scope="col">Video Link</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${getVideo }" var="p">
							<tr>
								<th>${p.title }</th>
								<td>${p.description }</td>
								<td><a href="${p.link }">Click Here</a></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
				<div>
					<button type="submit"><a href="${pageContext.request.contextPath }/addvideoform/${cid}">ADD MORE VIDEO</a></button>
				</div>
			</div>
		</div>
	</div>
</body>
</html>