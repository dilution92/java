<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>manipulation</title>
</head>
<body>
<div id="main">
	<div id="target">TARGET</div>
	
	<div id="btn_zone">
		<input type="button" value="WRAP" id="btnWrap" onclick="abc(this)">
		<input type="button" value="APPEND" id="btnAppend"/>
		<input type="button" value="PREPEND" id="btnPrepend">
	</div>
	
</div>
<script type="text/javascript">
// WRAP 버튼에 click event 처리
	
	//On click 클릭 이벤트를 태그에 서 쓴 경우
	function abc(button){//매개변수를 버튼으로 설정
	// console.lob(button.id); this 가 버튼이니까 그 값이 가지고 있는 밸류값
	var wrap = "<label><input type='checkbox'>확인</label>";
	$('#main>#target').wrap(wrap);
	}
	
	//JQUERY
	var btnAppend = $('#btnAppend')[0];
	btnAppend.onclick = function(){
		//console.log($(this).val());
	var wrap="<br/><laber><input type='checkbox'>확인</laber>";
	for(var i =0; i<5; i++){
		$('#main>#target').append(wrap);
		}
	}
	
	//Javascript
	var btnPrepend = document.getElementById('btnPrepend');
	btnPrepend.onclick = function(){
		var wrap = "<label><input type='checkbox'>확인<label>";
		$('#main>#target').prepend(wrap);
	}
	
	
	
	
</script>
</body>
</html>