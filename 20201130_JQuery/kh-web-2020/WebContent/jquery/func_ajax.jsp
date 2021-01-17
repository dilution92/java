<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>func_ajax</title>
</head>
<body>
<div id='func_ajax'>
   <h2>ajax in jQuery을 사용한 구구단</h2>
   <form name='frm' method='post' id='frm'>
   <label>단수를 입력하세요 : </label>
   <input type='text' size='4' name='dan' value='9' />
   <input type='button' value='구구단 실행' id='btnRun'/>
   </form>
   
   <div id='result'></div>
</div>
<script>
$('#btnRun').on('click', function(){
   let param = $('#frm').serialize();
   $.ajax({
      //요청정보
      type : 'get',
      url : './jquery/gugudan.jsp',
      data: param,
      
      //수신정보
      dataType : 'html',                  // function뒤 괄호 안은 사용자 정의변수
      success : function(receiveData, status){// receiveData가 받아서 success가 값을 받아서 실행
         $('#result').append(receiveData); //append라서 계속 추가됨. .html로 하면 기존 내용 업데이트됨.
      },
      error : function(xhr, status, error){
         alert(status);
      }
   });//파라미터 맵구조로 전달받음.
});

</script>
</body>
</html>