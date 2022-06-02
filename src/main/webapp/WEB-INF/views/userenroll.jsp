<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>
<%@ include file="./base.jsp"%>
<%@ page import="java.io.*,java.util.*, javax.servlet.*,java.text.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Enrollment</title>
</head>
<body class="bg-light">
	<%
	DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
	String newDate = df.format(new Date());
	%>
	<div class="text-center card mt-5 mr-5"
		style="width: 500px; margin-left: 450px;">
		<h3 class="mb-4 mt-4">Enrollment Form</h3>
		<form action="${pageContext.request.contextPath }/enroll/${uid}"
			method="post">
			<div class="form-group ">
				<input type="hidden" id="userId" placeholder="Enter User Id"
					name="userId" value="${uid }" readOnly>
			</div>
			<div class="form-group" style="margin-left: -18px">
				<input type="hidden" id="courseId" placeholder="Enter Id Of Course"
					name="courseId" value="${cid }" readOnly>
			</div>
			<div class="form-group">
				<label for="date" style="margin-right: 45px; margin-left: 20px">Date</label>
				<input class="mb-4" type="text" id="date" placeholder="Enter Date"
					name="date" value="<%=newDate%>" readOnly>
			</div>
			<div class="form-group">
				<label for="title" style="margin-right: 50px; margin-left: 20px">Title</label>
				<input type="text" id="title" placeholder="Enter Title" name="title"
					value="${title }" readOnly>
			</div>
			<div>
				<input type="hidden" id="id" placeholder="Enter Instructor Id"
					name="id" value="${id }" readOnly>
			</div>
			<div>
				<button class="btn btn-outline-info" type="submit">Submit</button>
			</div>
		</form>
	</div>
</body>
</html>