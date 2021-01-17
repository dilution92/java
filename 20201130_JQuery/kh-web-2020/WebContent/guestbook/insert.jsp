<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<form name="frm_gb_insert" method="post" id="frm_gb_insert">
	<label>작성자</label>
	<input type="text" name="mid" class="mid" readonly="readonly" value="${sessionScope.mid }"/>
	<label>작성일</label>
	<output class="mdate"><%=new Date().toLocaleString() %></output>
	<br/>
	<textarea name="doc" rows="5" cols="80"></textarea>
	
	<div class="btns">
		<input type="password" name="pwd">
		<input type="button" value="저장" id="btnInsert">
 	</div>
 	
</form>