<%@page import="domain.Todo"%>
<%@page import="repository.TodoRepository"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
request.setCharacterEncoding("UTF-8");
String whatTodo = request.getParameter("whattodo");
String myName = request.getParameter("myname");

final Todo todo = new Todo(whatTodo, myName);
TodoRepository.getInstance().saveTodo(todo);
response.sendRedirect("index.jsp");
%>
<h1><%= whatTodo %></h1>
<h1><%= myName %></h1>
</body>
</html>