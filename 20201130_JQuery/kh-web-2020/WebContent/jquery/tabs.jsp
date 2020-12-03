<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>tabs</title>
<link rel="stylesheet" type="text/css" 
href="https://code.jquery.com/ui/1.12.1/themes/south-street/jquery-ui.css">
<script src='https://code.jquery.com/ui/1.12.1/jquery-ui.js'></script>
</head>
<body>
<div id="tabs">
	<!-- 상단 탭 메뉴 -->	
	<ul>
		<li><a href="#web">WEB Programming</a></li>
		<li><a href="#app">App Programming</a></li>
		<li><a href="#framework">FrameWork Programming</a></li>
		<li><a href="#office">Office</a></li>
		<li><a href="#bigData">Big Data</a></li>
	</ul>
	
	<!-- 각 탭에 해당하는 컨텐츠 내용들 -->
	<div id="web">web programming은...</div>
	<div id="app">app applictation은...</div>
	<div id="framework">framework란....</div>
	<div id="office">사무 자동화에 필요한....</div>
	<div id="bigData">빅 데이터 처리 및 검색이란....</div>
</div>
<script type="text/javascript">
	$('#tabs').tabs();
</script>

</body>
</html>