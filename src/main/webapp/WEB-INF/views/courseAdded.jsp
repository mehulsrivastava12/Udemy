<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>
<%@ include file="./base.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Course Added</title>
</head>
<body>
	<div class="alert alert-success" role="alert">
		<h4 class="alert-heading">Well done!</h4>
		<p>Successfully Added</p>
		<form
			action="${pageContext.request.contextPath }/instructorcourse/${id}">
			<button type="submit" class="btn btn-outline-secondary">Go
				To My Course</button>
		</form>
	</div>
</body>
</html>