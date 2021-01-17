<%@page import="user.model.vo.User"%>
<%@page import="java.util.ArrayList"%>
<%@page import="user.model.dao.UserDao"%>
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
	int userNo = 0;
	if (request.getParameter("userNo") != null){
		userNo = Integer.parseInt(request.getParameter("userNo"));
	}
%>
	<div>
		<table>
				<thead>
 					<tr>
 						<th style="bakcground-color: #eeeeee; text-align: center;">회원번호</th>
 						<th style="bakcground-color: #eeeeee; text-align: center;">회원아이디</th>
 						<th style="bakcground-color: #eeeeee; text-align: center;">회원이름</th>
 						<th style="bakcground-color: #eeeeee; text-align: center;">회원나이</th>
 					</tr>
 				</thead>
 				<tbody>
 				<%
 					UserDao dao = new UserDao();
 					User user = (User)request.getAttribute("user");
 				%>
 					<tr>
 						<td><%=  user.getUserNo() %></td>
 						<td><%=  user.getUserId() %></td>
 						<td><%=  user.getUserName() %></td>
 						<td><%=  user.getUserAge() %></td> 
 					</tr>
 				</tbody>
 		</table>
 		<a href="../index.jsp" >메인으로 되돌아가기</a>
	</div>
</body>
</html>