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
	Sctest sc = new Sctest(); 
	int a = 1;
	request.setAttribute("a", a);
%>
<form action="">
<input type="button" name="btn" value="제발 함수좀">
</form>

<script type="text/javascript">
	var btn = document.getElementByName('btn');
	btn.onclick = function(){
		var
		<%= sc.getint(a) %>
	}
</script>
</body>
</html>