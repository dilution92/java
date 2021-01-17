<%@page import="gb.GuestBookVo"%>
<%@page import="gb.GuestBookDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	request.setCharacterEncoding("utf-8");

/* 	자바로 작업하는 경우
	GuestBookDao dao = new GuestBookDao();
	GuestBookVo	vo = new GeustBookVo();
	
	vo.setMid(request.getParameter("mid"));
	vo.setDoc(request.getParameter("doc"));
	vo.setPwd(request.getParameter("pwd"));
	vo.setSerial(Integer.parseInt(request.getParameter("serial")));
	
	String msg = dao.insert(vo); */
%>

<jsp:useBean id="dao" class="gb.GuestBookDao" />
<jsp:useBean id="vo" class="gb.GuestBookVo"/>
<jsp:setProperty property="*" name="vo"/>

<%
	String msg = dao.update(vo); 
	request.setAttribute("msg",	msg);

%>
<script>
	alert('${msg}');
	location.href='../index.jsp?inc=./guestbook/select.jsp';
</script>


    
