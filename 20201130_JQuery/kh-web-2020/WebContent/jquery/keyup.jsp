<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>keyup</title>
<style>
   #result{
      border: 2px solid #aaa;
      border-radius: 10px;
      padding: 15px;
      width: 350px;
      height: 200px;
      background-color: #eee;
      box-shadow: 2px 2px 4px #999;
      overflow: auto;
      }
</style>
</head>
<body>
<div id='keyup'>
   <label>생년월일</label>
   <input type='text' id='birth' placeholder='YYYYMMDD'>
   <label>-</label>
   <input type='text' id='gender' size='4'>
   <p/>
   <div id='result'></div>
</div>
<script>
// 원형 $('#keyup>#birth').keyup(); 이제 이벤트가 발생했을때 뭐할껀데!?를 입력
$('#keyup>#birth').keyup(function(ev){ 
   // 매개변수는 특별한 일이 없는 이상 사용자 임의변수! 아무거나 넣어라~ 보통 event 넣음
   //이벤트가 발생한 키값을 가져오자
   var str = ev.keyCode;
   $('#result').text(str);
   console.table(ev);
   
   // 입력된 문자열의 길이를 계산하여 8자이면 커서를 성별을 입력하는 항목으로 이동
   if($(this).val().length >= 8){
   // 이벤트가 발생한 자기자신 // ==8이나 >=8
      $('#gender').focus().select();
   }
});
	// 성별이 입력되면 홀수이면 '남자', 짝수이면 '여자'를 결과참에 출력
$('#keyup>#gender').keyup(function(){
	var gen = Number($(this).val());
	var str = '';
	if(gen%2==0){
		str = '여성입니다.';
	}else{
		str = '남성입니다.';
	}
	$('#result').html(str);
}); 
	
</script>

</body>
</html>