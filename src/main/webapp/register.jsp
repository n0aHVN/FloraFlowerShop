<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Register Page</h1>
<form action="register.jsp">
	<div>
		<p>Username:</p>
		<input name="user_id" type="text">
	</div>
	<div>
		<p>Password:</p>
		<input name="password" type="text">
	</div>

	<div>
		<p>Fullname:</p>
		<input name="fullname" type="text">
	</div>
	
	<div>
		<p>Email::</p>
		<input name="email" type="email">
	</div>
	
	<div>
		<p>Phone:</p>
		<input name="phone" type="text">
	</div>

	<div>
		<input name="submit" type="submit">
	</div>
</form>
</body>
</html>