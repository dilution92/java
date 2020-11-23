<%@page import="java.util.Optional"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>환경설정 넘모 어렵다</title>
	</head>
	<body>
		<h1>테스트 테스트!!</h1>
		<%!
			private static String printDate(){
			final Date date = new Date();
			final SimpleDateFormat sdf
			= new SimpleDateFormat("yyyy-mm-dd hh:mm:ss(E)");
			return sdf.format(date);
		}
		%>
		<%!
		private long factorial(long n){
			long result = 1;
			while(n >=1){
				result *= n--;
			}
			return result;
		}
		%>
		<%
			// path
			String nValue = request.getParameter("n");
		String n = Optional
				.ofNullable(nValue)
				.orElse("1");
			long result = factorial(Long.valueOf(n));
		%>
		
		<h1>보자보자 어디보자</h1>
		<p>현재 시간: <%= printDate() %></p>
		결과: <%= result %>
		
		<form action="todo.jsp" method="post">
		<label for="whattodo">할 일: </label>
		<input type="text" id="whattodo" name="whattodo"/>
		<label for="myname">이름: </label>
		<input type="text" id="myname" name="myname"/>
		<input type="submit"/>
	</form>
		
		
		
	</body>
</html>