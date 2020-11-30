<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- 특별한 이유가 없는 이상 스크립트는 해드와 해드사이에 실제로는 어디 써도 상관없다.
-->
<script src="https://code.jquery.com/jquery-3.5.1.js" 
		integrity="sha256-QWo7LDvxbWT2tbbQ97B53yJnYU3WhH/C8ycbRAkjPDc=" 
		crossorigin="anonymous"></script>
</head>
<body>
<%
	String inc = "intro.jsp";
	if(request.getParameter("inc") != null) {
		inc = request.getParameter("inc");
	}
%>
<div id="index">
	<header id="header">헤더</header>
	<section id="contents">
		<article class="content">
			<jsp:include page="<%=inc %>"/>
		</article>
		
		<aside class="aside">
		aside
			<img src="http://placehold.it/150X100"/>
		</aside>
	</section>
	<footer id="footer">융합 S/W 개발(주)</footer>
<script type="text/javascript">
	// 모든 기본태그의 마진,패딩 0으로 설정
	$('*').css('margin', '0px');
	$('*').css('padding', '0px');
	// 패딩 증가의 영향을 최소화 하기 위한 조치
	$('*').css('box-sizing', 'border-box');
	
	// index페이지의 넓이와 중앙배치
	$('#index').css('width', '1000px');
	$('#index').css('margin', 'auto');
	$('#index').css('backGround-Color', '#eee');
	
	//header 높이와 바탕색
	$('#index>#header').css('height', '150px');
	$('#index>#header').css('background-color', '#eeeeee');
	$('#index>#header').css('margin-top', '5px');
	
	//contents는 최소높이만
	$('#index>#contents').css('min-height', '250px');
	//height와 min-height의 차이점 : 
	//height는 크기가 고정
	//min-height는 최소가 고정이고 그 이상이면 변동
	
	//footer 높이와 바탕색
	/* $('#index>footer').css('height', '100px');
	$('#index>footer').css('background-color', '#bbb');
	$('#index>footer').css('text-align', 'center');
	$('#index>footer').css('line-height', '100px');
	 */
	//footer 높이와 바탕색 등등을 JSON 표기법으로
	$('#index>#footer').css({
		'height' : '100px',
		'background-color' : '#4488aa',
		'text-align' : 'center',
		'line-height' : '100px'
	});
	 
	$('#index>#contents').css({
		'margin-top' : '5px',
		'margin-bottom' : '5px'
	});
	
	$('#index>#contents>.content').css({
		'width' : '800px',
		'float' : 'left'
	});
	
	$('#index>#contents>.aside').css({
		'width' : '200px',
		'float' : 'left',
		'background-color' : '#00ff00'
	});
	
	// css : <link/>
	// javascript : <script src />
	// jsp
	// 1. 동적 include
	// 2. 정적 include
	$('#index>#contents>.content').css();
		
</script>
</div>
</body>
</html>