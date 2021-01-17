<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>회원 정보 조회</h1>
<form method="get" action="../searchUser">
	<input type="text" name="userId" placeholder="회원정보입력">
	<input type="submit" value="조회">
</form>
</body>
</html>