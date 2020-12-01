<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>manipulation</title>
</head>
<body>
<div id='main'>
   <div id='target'>TARGET</div>
   
   <div id='btn_zone'>
      <input type='button' value='WRAP' id='btnWrap' onclick='abc(this)'/>
      <input type='button' value='APPEND' id='btnAppend'/>
      <input type='button' value='PREPEND' id='btnPrepend'/>
   </div>
</div>

<script>
  // WRAP 버튼에 click event 처리

     // On click 클릭 이벤트를 태그에서 쓴 경우
      function abc(button){// 매개변수를 버튼으로
      //   console.log(button.id); // this가 버튼이니까 그 값이 가지고 있는 밸류값
      var wrap = "<label><input type='checkbox'>확인</label>";
      $('#main>#target').wrap(wrap);
     }
         
     //JQUERY
     var btnAppend = $('#btnAppend')[0]; // 배열을 써야한다
     btnAppend.onclick = function(){
      //  console.log($(this).val());
      var wrap="<br/><label><input type='checkbox'>확인</label>";
      for (var i = 0; i < 5; i++) {
         $('#main>#target').append(wrap);
                        // A라는 환경이 바뀌어서 B라는 환경이 될때(동적으로 바뀔때) 사용
      }
     }
     
     //Javascript
     var btnPrepend = document.getElementById('btnPrepend');
     // $(btnPrepend).css(); 이렇게 작성해도 상관없
     // 제이쿼리가 자바스크립트로 만들어졌기때문
     btnPrepend.onclick = function(){
      //  console.log(this.value)
      var wrap="<label><input type='checkbox'>확인</label>";
      $('#main>#target').prepend(wrap);
     }

     /* 간단하게 되긴하지만 별로 추천하진 않는 코드.   
        <div class='btn_zone'>
         <input type='button' value='WRAP' id='btnWrap' onclick='abc(this)'/>
         <input type='button' value='APPEND' id='btnAppend' onclick='abc(this)''/>
         <input type='button' value='PREPEND' id='btnPrepend' onclick='abc(this)'/>
      </div> 
     */
     
</script>
</body>
</html>