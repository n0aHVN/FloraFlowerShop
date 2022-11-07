<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
  <h1>xinchao</h1>
    <c:forEach var="category" items="${categories}">
    <h2>${category.category_slug}</h2>
     </c:forEach>
  <br>
  <a href="homework/1/"><h1>homework1_servlet</h1></a>
  <a href="homework/2/"><h1>homework2_el_jstl</h1></a>
  <a href="homework/3/1/"><h1>homework3_1_cookie</h1></a>
     
</body>
</html>