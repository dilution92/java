<%@page import="domain.Todo"%>
<%@page import="java.util.List"%>
<%@page import="repository.TodoRepository"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>할 일 목록 보기</title>
</head>
<body>
<ul>
<%
List<Todo> list = TodoRepository.getInstance().getTodoList();
for (Todo todo : list) {
%>
	<li>이름:<%= todo.getMyName() %>|할일:<%= todo.getWhatToDo() %><li>
<%
}
%>
todo 목록 갯수
<%= list.size() %>
</ul>
</body>
</html>