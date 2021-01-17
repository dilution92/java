<%@ page language="java" contentType="text/html; charset=UTF-8"

pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Insert title here</title>

<style>

label{

width:100px;

display: inline-block;

}

</style>

</head>

<body>

<h1>로그인</h1>

<form action="/login" method="post">

<label for="memberId">아이디</label><input type="text" id="memberId" name="memberId" required><br>

<label for="memberPw">비밀번호 </label><input type="password" id="memberPw" name="memberPw" required><br>

<input type="submit" value="전송">

</form>

</body>

</html>
