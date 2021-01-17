<%@page import="com.google.gson.JsonElement"%>
<%@page import="com.google.gson.JsonParser"%>
<%@page import="com.google.gson.JsonObject"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학원 조회 페이지</title>
<script type="text/javascript" src="http://code.jquery.com/jquery-3.3.1.js"></script>
</head>
<body>

<form action="/searchKH" name="frm" method="post">
	<input type="text" name="search" id="search">
	<input type="button" value="조회" id="submit">
</form>

<%
	String str =(String) request.getAttribute("gstr");
	JsonParser parser = new JsonParser();
	JsonElement ele = parser.parse(str);
	JsonObject obj = ele.getAsJsonObject();
	
	request.setAttribute("obj", obj);
	if(obj == null){
%>
	<li>정보가 없습니다.</li>
<%} else{%>	
	<li>${obj.get(khName}</li>
	<li>${obj.get(addr}</li>
	<li>${obj.get(fax}</li>
<%} %>
</body>
<script type="text/javascript">
$(document).ready(function() {
    $('#submit').click(function(){
       AjaxConPost();
    })
    function AjaxConPost(){
       ajax({
            type:"post",
            url:"/searchKH",
            data:"",
        	contentType:"application/x-www-form-urlencoded; charset=UTF-8",
            success : function(data) {
            	$('#search').html(data);
            },
            error : function(xhr, status, error) {
                 alert("에러발생");
            }
        });   
    }
 });
</script>
</html>