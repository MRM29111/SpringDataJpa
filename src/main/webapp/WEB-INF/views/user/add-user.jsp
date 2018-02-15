
<h1>Add new user</h1>
	
	
	<form method="POST" action="${pageContext.request.contextPath}/user/add">
	First name: <input type="text" name="firstName"> <br />
	Last name: <input type="text" name="lastName"> <br />
	age: <input type="text" name="age"> <br />
	email: <input type="text" name="email"> <br />
	
	<input type="submit" value="Create new User">
</form>
	
	<form action = "${pageContext.request.contextPath}/">
	 <input type = "submit" value = "Main menu">
	</form>
