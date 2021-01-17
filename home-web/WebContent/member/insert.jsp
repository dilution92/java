<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel='stylesheet' type='text/css' href='./css/member.css'>
<script src='./js/member.js'></script>
<script src='http://dmaps.daum.net/map_js_init/postcode.v2.js'></script>
</head>
<body>
<div id="member">
	<h2>회원관리</h2>
	<form name="frm_member" class="insert" method="post">
		<label>아이디</label>
		<input type="text" name="mid" size="10" maxlength="10" required="required" pattern="[\w!\-$]{3,10}"/>
		<br/>
		
		<label>성명</label>
		<input type="text" name="name" size="12" required="required" pattern="[a-zA-Z가-힣]{2,20}"/>
		<br/>
		
		<label>암호</label>
		<input type="password" name="pwd" size="14" required="required" pattern="[\w!\-$]{4,10}"/>
		<br/>		
		
		<label>암호확인</label>
		<input type="password" name="pwdConfirm" size="14"/>
		<br/>
		
		<label>이메일</label>
		<input type="email" name="email" size="35"/>
		<br/>
		
		<label>연락처</label>
		<input type="text" name="phone" size="15" pattern="[0-9]{2,3}-[0-9]{3,4}-[0-9]{4}"/>
		<br/>
		
		<label>우편번호</label>
		<input type="text" name="zipcode" size="6" required="required" />
		<input type="button" name="btnZipcode" value="우편번호검색" id="btnFindZip">
		<br/>
		
		<label>주소</label>
		<input type="text" name="address" size="60" required="required" />
		<br/>
		
		<label>사진</label>
		<input type="file" name="photo" id="btnPhoto"/>
		<img src="http://placehold.it/200x140" id="photo" width="200px" height="140px">
		<hr/>
		
		<div class='btns'>
			<input type='button' value='저장' id='btnSave' />
			<input type='button' value='목록으로' id='btnSelect' />
			
			<input type='hidden' name='findStr' value='${param.findStr }' />
			<input type='hidden' name='nowPage' value='${param.nowPage }' />
			
		</div>
		
	</form>
	
</div>
<script>member()</script>
</body>
</html>