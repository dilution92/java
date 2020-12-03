<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>one</title>
<style type="text/css"> 

  #one>#result{
 	border: 1px solid #44f;
 	width: 300px;
 	height: 120px;
 	text-align: center;
 	line-height: 120px;
 }
 #one>#btnSend{
 	width: 120px;
 	height: 50px;
 	text-align: center;
 	
 }

</style>
</head>
<body>
<div id="one">
	<div id="result">송금 버튼을 클릭하시면 송금됩니다.</div>
	<input type="button" value="송금" id="btnSend">
</div>
<script type="text/javascript">
	let cnt=0; // 전송횟수
	/* $('#btnSend').click(function(){
		cnt++;
		$('#result').html(cnt + " 회 실행됨");
		$(this).attr('disabled', 'disabled')
	}) */
	 
	/* $('#btnSend').one('click', function(){
		cnt++;
		$('#result').html(cnt + " 회 실행됨");
		
	}) */
	
	$('#btnSend').click(function(){
		if(cnt==1)return false;
		cnt++;
		$('#result').html(cnt + ' 회 송금');
	})

</script>
	
</body>
</html>