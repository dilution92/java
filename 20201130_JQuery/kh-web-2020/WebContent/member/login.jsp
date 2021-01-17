<%@page import="java.io.PrintWriter" %>
<%@page import="bean.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


	<jsp:useBean id="dao" class="bean.MemberDao"/>
	<jsp:useBean id="vo" class="bean.MemberVo"/>
	
	<%--vo객체가 가지고 있는 모든 setter를 사용하여 갑을 대입 --%>
	<jsp:setProperty property="*" name="vo"/>
	
	
	
<% 
//	vo.setMid(request.getParameter("mid")); 이런 코드들이 위 코드에 들어가 있다.
	
//	response.setContentType("text/html;charset=utf-8");
//	request.setCharacterEncoding("utf-8"); // 한글이 깨지는 경우

//  하나씩 받아서 쓰는 경우.
//	String mid = request.getParameter("mid");
//	String pwd = request.getParameter("pwd");
	


	//database에 존재 유무를 체크
	
	/* session.setAttribute("mid", mid); //("속성명",속성값)
	response.sendRedirect("../index.jsp"); */
	
	//MemberDao dao = new MemberDao();
	boolean b = dao.login(vo.getMid(), vo.getPwd());
	
	if(b){
		session.setAttribute("mid", vo.getMid()); //("속성명",속성값)
		response.sendRedirect("../index.jsp");
	}else{
		//로그인 실패
		%> 
		<script>
			alert('fail');
			location.href='../index.jsp';
		</script>
		
	<% }%>

	