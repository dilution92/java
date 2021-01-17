<%@page import="user.model.vo.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<%
User user = (User)request.getAttribute("user");
%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
th,td{width:100px;}
</style>
</head>

<body>
	<h2>회원정보</h2>
	<table border="1">
		<tr>
		<th>회원번호</th><th>회원아이디</th><th>회원이름</th><th>회원나이</th>
		</tr>
	
		<tr>
		<th><%=user.getUserNo() %></th>
		<th><%=user.getUserId() %></th>
		<th><%=user.getUserName() %></th>
		<th><%=user.getUserAge() %></th>
		</tr>
	
	</table>
	<a href="../index.jsp" >메인으로 되돌아가기</a>
</body>
</html>