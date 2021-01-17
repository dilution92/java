<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>loginfo</title>
<script src="./js/login.js"></script>
</head>
<body>
<div id="loginfo">
<%
	//session.setAttribute("mid", "kim");
	//session.removeAttribute("mid");
	if(session.getAttribute("mid") == null){
%>
	<%-- 로그인 이전 화면 --%>
	<form name="frm_log" method="post">
		<label for="mid">아이디</label>
		<br/>
		<input type="text" id="mid" name="mid" size="14" pattern="^[A-Z][A-Za-z0-9]{8,20}$" value="kim">
		<br/>
		<label for="pwd">암호</label>
		<br/>
		<input type="password" id="pwd" name="pwd" size="14" value="1111">
		<br/>
		<input type="button" id="btnLogin" value="로그인">
	</form>
	
	<br/>
	<a href="">아이디 | 암호 찾기</a>
	
	<% }else{ %>
	
		<%--로그인 이후 화면 --%>
		<span><%=session.getAttribute("mid") %></span>
		<input type="button" id="btnLogout" value="로그아웃">
	
	<% } %>
</div>
<script type="text/javascript">
	logInOut()
</script>
</body>
</html>