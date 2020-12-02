<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>serialize</title>
</head>
<body>
	 <div id='serialize'>
      <form name='frm_serialize' method='post' id='frm_serialize'>
         <label>아이디</label>
         <input type='text' name='mid' value='a001'><br/>
         <label>이름</label>
         <input type='text' name='mName' value='홍길동' /><br/>
         <label>연락처</label>
         <input type='text' name='phone' value='010123234'><br/>
         
         <input type='submit' value='전송'>
         
      </form>

   </div>
	<script type="text/javascript">
	// $('#frm_serialize')[0].onsubmit = function(){} //js
	//$('#frm)serialize').submit(function(){}) // jq
      
      $('#frm_serialize').submit(function(){
         let data = $(this).serialize();
         console.log(data);
         return false;      // submit 기능 중지.
      })    //jq 스타일
		
		// 만들어진 serialize.jap 페이지를 menu.jsp에 링크를 추가하여 통합 페이지상에서 테스트
		//?@@@@@@@@@@@@
	</script>
</body>
</html>