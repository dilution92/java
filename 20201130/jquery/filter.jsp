<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>filter</title>
<script src="https://code.jquery.com/jquery-3.5.1.js" 
		integrity="sha256-QWo7LDvxbWT2tbbQ97B53yJnYU3WhH/C8ycbRAkjPDc=" 
		crossorigin="anonymous"></script>
</head>
<body>
<div id="filter">
	<fieldset>
		<legend>filter</legend>
		<ul>
			<li>선택된 요소중 필요한 요소만을 걸러내는 방법 </li>
			<li>접두문자 ':'을 사용한다. </li>
			<li>필터와 필터를 연결하여 사용할 수 있다. </li>
			<li>종류 => :eq(index) 해당 인덱스, :even 짝수, :odd 홀수, :first 처음, :last 마직막,gt(index) 인덱스보다 큰,lt(index) 인덱스보다 작은 </li>
		</ul>
	</fieldset>
	
	<ol>
		<li>백두산</li>
		<li>금강산</li>
		<li>설악산</li>
		<li>치악산</li>
		<li>내장산</li>
		<li>속리산</li>
		<li>맛동산</li>
		<li>한라산</li>
	</ol>
	
	<div id="items">
		<div>111(index=0)</div>
		<div>222(index=1)</div>
		<div>333(index=2)</div>
		<div>444(index=3)</div>
		<div>555(index=4)</div>
		<div>666(index=5)</div>
	</div>
</div>

<script type="text/javascript">
	// ul태그 안의 첫번째 li
	$('#filter>ol>li:first').css('color', '#f00');
	$('#filter>ol>li:odd').css('font-weight', 'bolder');
	//인덱스 번호는 0번부터 시작한다.
	
	// items안에 있는 div의 바탕색을 홀짝수로 나뉘어 표시되도록 구성
   $('#filter>#items>div:odd').css({
	   'background-color' : '#a55',
	   'color' : '#0ff'
   });
   $('#filter>#items>div:even').css({
	   'background-color' : '#55a',
	   'color' : '#ff0'
	
   });

</script>



</body>
</html>