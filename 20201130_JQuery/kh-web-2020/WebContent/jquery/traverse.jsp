<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src='./lib/jquery-3.5.1.js'></script>
</head>
<body>
	<div id="traverse">
		<h1>TRAVERSE</h1>
		<fieldset>
			<legend>traverse</legend>
			<ul>
				<li>traverse는 '.'을 찍어서 표현한다.</li>
				<li>명령어는 filter와 traverse가 매우 유사하거나 상충되기 때문에 
					개인적 취향에 따라 사용 빈도수가 달라질 수 있다. </li>
				<li>종류 => .eq(index) 해당 인덱스, .first 처음, .last 마지막, .slice(start [, end]) </li>
				<li>method => .children(expr), .find(expr), .parent(expr), .next(expr), .prev(expr) </li>
			</ul>
		</fieldset>
		<ul>
			<li>백두산</li>
			<li>금강산</li>
			<li>설악산</li>
			<li>치악산</li>
			<li>내장산</li>
			<li>속리산</li>
			<li>맛동산</li>
			<li>한라산</li>
		</ul>
		
		<!-- .parent() example code -->
		<div id="div1">
			<input type="button" value="x" class="btn1"/>
		</div>
		
		<div id="div2">
			<input type="button" value="x" class="btn2">
		</div>
		
	</div>
	<script type="text/javascript">
		$('#traverse>ul>li').first().css('color', '#f00');
		$('#traverse>ul>li').filter(':odd').css('color', '#00f');
		$('#traverse>ul>li').slice(1,4).css('font-family', '궁서체');
		
		// div1, div2 넓이와 높이을 지정
		// btn1, btn2 넓이와 높이를 지정
		$('#traverse>#div1').css({
			'width' : '200px',
			'heigth': '100px'
		});
		
		$('#traverse>#div2').css({
			'width' : '200px',
			'heigth': '100px'
		});
		
		$('#traverse>#div1>.btn1').css({
			'width' : '100px',
			'height': '100px'
		});
		
		$('#traverse>#div2>.btn2').css({
			'width' : '100px',
			'height': '100px'
		});
		
		//btn1, btn2의 이번트 처리
		var btn1 = $('.btn1')[0];
		btn1.onclick = function(){
			//alert('btn1이 클릭됨')
			var p = $(btn1).parent();
			$(p).css('background-color', '#88f')
		}
		
		var btn2 = $('.btn2')[0];
		btn2.onclick = function(){
			$(btn2).parent().css('background-color', '#f88')
		//	$(this).parent().css('background-color', '#f88')
		}
	</script>
</body>
</html>