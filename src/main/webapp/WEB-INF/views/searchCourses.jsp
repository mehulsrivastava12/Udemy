<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>
<%@ include file="./base.jsp"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="java.io.*,java.util.*, javax.servlet.*,java.text.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Courses</title>
</head>
<body>
	<%
	DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
	String newDate = df.format(new Date());
	%>
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
								<td><button type="button" class="btn btn-outline-primary"
										data-toggle="modal" data-target="#${p.cid }">Enroll
										Now</button></td>
								<div class="modal fade" id="${p.cid }" tabindex="-1"
									role="dialog" aria-labelledby="exampleModalLabel"
									aria-hidden="true">
									<div class="modal-dialog" role="document">
										<div class="modal-content">
											<div class="modal-header">
												<h5 class="modal-title" id="exampleModalLabel">Enrollment
													Form</h5>
												<button type="button" class="close" data-dismiss="modal"
													aria-label="Close">
													<span aria-hidden="true">&times;</span>
												</button>
											</div>
											<div class="modal-body">
												<form
													action="${pageContext.request.contextPath }/enroll/${uid}"
													method="post">
													<div class="form-group ">
														<input type=hidden id="userId" placeholder="Enter User Id"
															name="userId" value="${uid }" readOnly>
													</div>
													<div class="form-group" style="margin-left: -18px">
														<input type="hidden" id="courseId"
															placeholder="Enter Id Of Course" name="courseId"
															value="${p.cid }" readOnly>
													</div>
													<div class="form-group">
														<label for="date"
															style="margin-right: 45px; margin-left: 20px">Date</label>
														<input class="mb-4" type="text" id="date"
															placeholder="Enter Date" name="date" value="<%=newDate%>"
															readOnly>
													</div>
													<div class="form-group">
														<label for="title"
															style="margin-right: 50px; margin-left: 20px">Title</label>
														<input type="text" id="title" placeholder="Enter Title"
															name="title" value="${p.title }" readOnly>
													</div>
													<div>
														<input type="hidden" id="id"
															placeholder="Enter Instructor Id" name="id"
															value="${p.instructor_id }" readOnly>
													</div>
													<div class="modal-footer">
														<button type="button" class="btn btn-secondary"
															data-dismiss="modal">Cancel</button>
														<button type="submit" class="btn btn-outline-info">Enroll
															Now</button>
													</div>
												</form>
											</div>
										</div>
									</div>
								</div>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</div>
</body>
</html>