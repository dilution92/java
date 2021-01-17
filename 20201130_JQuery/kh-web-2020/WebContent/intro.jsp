
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>오이오이 여긴 타이틀이라구</title>
<!-- 
<script src="https://code.jquery.com/jquery-3.5.1.js" 
		integrity="sha256-QWo7LDvxbWT2tbbQ97B53yJnYU3WhH/C8ycbRAkjPDc=" 
		crossorigin="anonymous"></script> -->
		
<script src='./lib/jquery-3.5.1.js'></script>
</head>
<body>
<%  // 스크립틀릿(scriptlet) : java coding area
	// System.out.println()
	// javascript : document.write(), console.log()
	out.print("hi jQuery");

%>
<h1 id="header">jQuery Test를 위한 태그1111</h1>
<ul>
	<li><a href='index.jsp?inc=./jquery/filter.jsp'>filter</a></li>
	<li><a href='index.jsp?inc=./jquery/traverse.jsp'>TRAVERSE</a></li>
</ul>

<script>
$('#header').css('color', '#f00'); // #header{ color : #f00; } 정적이다.

</script>
</body>
</html>