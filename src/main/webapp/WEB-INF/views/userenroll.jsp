<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>
<%@ page import = "java.io.*,java.util.*, javax.servlet.*,java.text.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Enrollment</title>
</head>
<body>
<%DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
String newDate = df.format(new Date()); 
%>
	<div>
		<form action="${pageContext.request.contextPath }/enroll/${uid}"
			method="post">
			<div>
				<label for="userId">User Id</label> <input type="text" id="userId"
					placeholder="Enter User Id" name="userId" value="${uid }" readOnly>
			</div>
			<div>
				<label for="courseId">Course Id</label> <input type="text"
					id="courseId" placeholder="Enter Id Of Course" name="courseId"
					value="${cid }" readOnly>
			</div>
			<div>
				<label for="date">Date</label> <input type="text" id="date"
					placeholder="Enter Date" name="date" value="<%=newDate %>" readOnly>
			</div>
			<div>
				<button type="submit">Submit</button>
			</div>
		</form>
	</div>
</body>
</html>