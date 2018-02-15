<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<table border="1">
	<tr>
		<th>ID</th>
		<th>Title</th>
		<th>Description</th>
		<th>Price</th>
	</tr>
	
	<c:forEach items="${coursesList }" var="course">
		<tr>
			<td>${course.id}</td>
			<td>${course.title}</td>
			<td>${course.description}</td>
			<td>${course.price}</td>
			<td>
				<a href="${pageContext.request.contextPath}/course/${course.id}/info">Info</a>
			</td>
		</tr>
	</c:forEach>
	
</table>