<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>toggle</title>
<style type="text/css">
	#target {
		width: 400px;
		height: 150px;
		border: 2px solid #bbb;
		font-weight: bolder;
		text-align: center;
		line-height: 100px;
		position: relative;
	}
	
	#btnToggle{
		width: 120px;
		height: 30px;
		line-height: 30px;
		position: relative;
	}
	
	.target_on {
		background-color: #ff0;
		color: #f00;
		
	}
	
	.target_off{
		background-color: #000;
		color: #fff;
		
	}
	
	
</style>
</head>
<body>
<div id="toggle"> <!-- 적지 않아도 되나  src:라이브러리경로 는 설정해줘야한다. -->
	<div id="target"></div>
	<br/>
	<input type="button" value="ON/OFF" id="btnToggle">
	<div>aasdfasdf</div>
</div>

<script type="text/javascript">
/* 	$(document).ready(function(){
		//이것이 정석이긴 함. 하지만 간략히 쓸수 있다.
	}); */
	$('#btnToggle').on('click', function(){
		$('#target').toggle(even, odd,);
	});
	
	function even(){
		$('#target').attr('class', 'target_on');
	};
	
	function odd(){
		$('#target').attr('class', 'target_off');
	};
	
</script>
</body>
</html>