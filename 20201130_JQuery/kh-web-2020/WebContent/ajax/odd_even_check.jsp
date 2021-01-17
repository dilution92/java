<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
/*ajax를 통해 전체 페이지가 새로고침 되게 하지 않으려면, 

1) 서버에서 처리할 내용을 UI에서 분리
2) 서버는 처리된 내용을 화면에 출력하는 로직을 추가한다.
3)  ui단에서는 XMLHttpRequest 객체를 사용하여 서버의 처리 결과를 가져온다. */
	// file name : odd_even_check.jsp
	
	String temp = request.getParameter("su");
	String msg = ""; //결과메세지
	int su = 0;
	if(temp !=null && !temp.equals("")){
		su = Integer.parseInt(temp);
		if(su%2==0){
			msg = su + "는 짝수입니다.";
		}else{
			msg = su + "는 홀수입니다.";
		}
	}
	
	out.print(msg);
%>