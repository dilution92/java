<%@page import="member.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:useBean id="dao" class="member.MemberDao"/>
<jsp:useBean id="vo"  class="member.MemberVo"/>

<%--vo객체가 가지고 있는 모든 setter를 사용하여 값을 대입 --%>
<jsp:setProperty property="*" name="vo"/>

<%
	boolean b = dao.login(vo.getMid(), vo.getPwd());
	
	if(b){
		session.setAttribute("mid", vo.getMid());
		response.sendRedirect("../index.jsp");
	}else{
		//로그인 실패
%>
	<script type="text/javascript">
		alert('fail');
		location.href='../index.jsp';
	</script>	
<%} %>
