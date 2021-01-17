<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome to Home-Web</title>

<%-- jQuery 연결 --%>
<script src="./lib/jquery-3.5.1.js"></script>

<%-- css 연결 --%>
<link rel="stylesheet" type="text/css" href="./css/index.css" >

</head>
<body>
<%
	request.setCharacterEncoding("utf-8");
	
	//inc
	String inc = "intro.jsp";
	if(request.getParameter("inc") != null){
		inc = request.getParameter("inc");
	}

	//sub
	String sub = "./jquery/menu.jsp";
	if(request.getParameter("sub") != null){
		sub = request.getParameter("sub");
	}
%>

<div id="index">
	
	<%@include file="header.jsp" %>
	<section id="contents">
		<article class="content">
			<jsp:include page="<%=inc %>"></jsp:include>
		</article>
		
		<aside class="aside">
		<%-- 로그인 자리 --%>
		
		<%@include file="./member/loginfo.jsp" %>
			<div id="subMenu">
				<jsp:include page="<%=sub %>"></jsp:include>
			</div>
		</aside>
	</section>

	<%-- 푸터 자리 --%>
	<%@include file="footer.jsp" %>
</div>
<%-- javascript 연결 --%>
<script src="./js/index.js"></script>
</body>
</html>