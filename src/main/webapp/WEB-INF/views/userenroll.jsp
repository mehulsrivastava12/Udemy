<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Enrollment</title>
</head>
<body>
	<div>
		<form action="" method="post">
			<div>
				<label for="userId">UserID</label> <input type="text" id="userId"
					placeholder="Enter userId" name="userId" value="${uid}" required>
			</div>

			<div>
				<label for="courseId">CourseID</label> <input type="text"
					id="courseId" placeholder="Enter courseId" name="courseId" value="${cid }" required>
			</div>
			<div>
				<label for="date">Date</label> <input type="date" id="date"
					placeholder="Enter Date" name="Date" value="" required>
			</div>
		</form>
	</div>
</body>
</html>