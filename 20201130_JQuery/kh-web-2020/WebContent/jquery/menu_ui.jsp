<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>menu_ui</title>
<link rel="stylesheet" type="text/css" 
href="https://code.jquery.com/ui/1.12.1/themes/south-street/jquery-ui.css">
<script src='https://code.jquery.com/ui/1.12.1/jquery-ui.js'></script>
<style type="text/css">
	#menu{
		width: 120px;
	}
</style>
</head>
<body>
<div id="menu_ui">
	<ul id="menu">
		<li><a herf='#' class="ui-state-disabled">강이름</a></li>
		<li><a herf='#'>산이름</a></li>
		<li><a herf='#'>과일명</a></li>
		<li>
			<a herf='#'>동물명</a>
			<ul>
				<li><a herf='#'></a>사자</li>
				<li><a herf='#'></a>호랑이</li>
				<li><a herf='#'></a>강아지</li>
				<li><a herf='#'></a>고양이</li>
				<li><a herf='#'></a>코끼리</li>
			</ul>
		</li>
	</ul>

</div>

<script type="text/javascript">
	$('#menu').menu();
</script>
</body>
</html>