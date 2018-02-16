<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<table border="1">
	<tr>
		<th>ID</th>
		<th>FirstName</th>
		<th>LastName</th>
		<th>age</th>
		<th>Email</th>
	</tr>
	
	<c:forEach items="${usersList }" var="user">
		<tr>
			<td>${user.id}</td>
			<td>${user.firstName}</td>
			<td>${user.lastName}</td>
			<td>${user.age}</td>
			<td>${user.email}</td>
			<td>
				<a href="${pageContext.request.contextPath}/user/${user.id}/info">Info</a>
			</td>
		</tr>
	</c:forEach>
	
</table>