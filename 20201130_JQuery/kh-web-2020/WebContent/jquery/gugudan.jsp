<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	// 파라미터 dan을 전달 받아 해당 구구단을 출력하는 코드
	String temp = request.getParameter("dan");
	if(temp != null && !temp.equals("")){
		int dan = Integer.parseInt(temp);
		int result= 0;
		String str = dan +"단";
		for(int i=1; i<10; i++){
			result = dan * i;
			str += "</br>" + i + "*" + dan + "=" + result ; 
		}
		out.print(str);
	}
%>