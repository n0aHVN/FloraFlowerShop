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
    <a href="hihi"><h1>Lay du lieu trong bang Category trong postgres</h1></a>
  <br>
  <a href="homework/5/"><h1>homework5_servlet</h1></a>
  <a href="homework/6/"><h1>homework6_el_jstl</h1></a>
  <a href="homework/7/1/"><h1>homework7_1_cookie</h1></a>
  <a href="homework/7/2/"><h1>homework7_2_hiddenfields</h1></a>
  <a href="homework/8/"><h1>homework8_EL</h1></a>
  <a href="homework/9/1/"><h1>homework9_1_JSTL</h1></a>
  <a href="homework/9/2/"><h1>homework9_2_JSTL</h1></a>
  
     
</body>
</html>