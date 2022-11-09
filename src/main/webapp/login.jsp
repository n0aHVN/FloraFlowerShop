<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.io.PrintWriter"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="loginpage" method="post">
		<div>
			<input name="user_id" type="text" >
		</div>
		<div>
			<input name ="password" type="password">
		</div>
			<input type="submit" value = "Login">
	</form>
	
	<div>
<% if (request.getAttribute("errorLogin")!=null) {%>
	<p>Invalid username or password!!!</p>
	<%} %>
	</div>
		
	<div>
		<a href = "/FloraFlowerShop/registerpage">Register new account</a>
	</div>
</body>



</html>