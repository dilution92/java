<%@ page language="java" contentType="text/html; UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>todo</title>
</head>
<body>
	<%
		String todo = request.getParameter("whattodo");
		String name = request.getParameter("myname");
	%>
	<h1>할 일 : <%= todo %></h1>
	<h1>이름: <%= name %></h1>
</body>
</html>