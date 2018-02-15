<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
</head>
<body>
	<h1>User's registration page</h1>
	
	<form method="POST" action="${pageContext.request.contextPath}/course/add">
	Title: <input type="text" name="title"> <br />
	Description: <input type="text" name="description"> <br />
	Price: <input type="text" name="price"> <br />
	
	<input type="submit" value="Create User">
</form>
	
	<form action = "${pageContext.request.contextPath}/">
	 <input type = "submit" value = "Main menu">
	</form>
	
</body>
</html>