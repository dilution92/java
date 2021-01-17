<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.5.1.js" 
	        integrity="sha256-QWo7LDvxbWT2tbbQ97B53yJnYU3WhH/C8ycbRAkjPDc=" 
	        crossorigin="anonymous"></script>
</head>
<body>
<h1>회원 정보 조회</h1>
<div id="search">
	<form action="/searchUser" method="post" name="frm"> <%--servlet urlpattern과 action은 반드시 일치해야 한다. --%>
		<input type="search" placeholder="회원번호입력">
		<input type="submit" value="조회">
	</form>
</div>
</body>
</html>