<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Login page</h1>

<form action = "${pageContext.request.contextPath}/login">
	 Login:<input type = "text" name = "login">
	Password: <input type = "text" name = "firstName"> <br />
		<input type = "submit" value = "Sign in"> <br />
	</form>

</body>
</html>