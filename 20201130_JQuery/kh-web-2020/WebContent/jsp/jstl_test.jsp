<%@page import="bean.MemberVo"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jstl_test</title>
</head>
<body>
<div id="jstl_test">
	<h2>jstl(Java Standard Tag Library)의 제어문</h2>
	<%
		String name = "hong gil dong";
		int score = 99;
		
		pageContext.setAttribute("page_name", name);
		pageContext.setAttribute("page_score", score);
		
		request.setAttribute("req_name", name);
		request.setAttribute("req_score", score);
	
	%>	
	
	<h3>c:out ==> jstl을 사용한 출력문</h3>
	<li>Name : <c:out value="${pageScope.page_name }" default="이름을 입력하세요."></c:out></li>
	<li>Score : <c:out value="${pageScope.page_score }" default="0점."></c:out></li>
	
	<li>Name(req) : <c:out value="${requestScope.req_name }"></c:out></li>
	<li>Score(req) : <c:out value="${requestScope.req_score }"></c:out></li>
	
	<li>Name : <c:out value="${page_name }"></c:out></li>
	<li>Score : <c:out value="${page_score }"></c:out></li>
	
	
	<h3>c:set | c:remove | c:out</h3>
	
	<c:set var="score" value="100"></c:set>
	<li>Score 1 : <c:out value="${score }"></c:out> </li>
	<c:remove var="score"/>
	<li>Score 2 : <c:out value="${score }" default="변수가 삭제됨"></c:out> </li>
	
	<h3>c:if</h3>
	<li>
		<c:if test="${req_score>=90 }">
			<font color="red">장학생</font>
		</c:if>
	</li>
	
	
	<fieldset>
	<h3>c:if 사용하여 해결</h3>
	<div>
		kor, eng변수에 임의 값을 대입하여 request영역에 저장한 후 두 수의 합이 180이상이면 '우등생'을 출력하시오.
	</div>
	
	<%
		int kor = 95;
		int eng = 90;
		request.setAttribute("req_kor", kor);
		request.setAttribute("req_eng", eng);
	%>
	<li>
		<c:if test="${req_kor + req_eng >= 180}">
			<font color="red">우등생</font>
		</c:if>
	</li>
	</fieldset>

	<h3>c:choose | c:when | c:otherwise</h3>
	<xmp>
		[c:choose]
			[c:when test='조건식'] T [/:when]
			[c:when test='조건식'] T [/:when]
			...
			[c:ohterwise]
				맞는조건식이 없는경우
			[/c:ohterwise]
		[c:choose]
 	</xmp>
	<fieldset>
		<div>
			구매수량, 단가를 임의의 변수에 저장하여 scope담고, 구매금액(구매수량*단가)에 따라 사은품이 지급되도록 choose문을 기술하시오.<br/>
			- 1000원 이상 : 화장지 <br/>
			- 10000원 이상 : 자전거 <br/>
			- 100000원 이상 : 아파트 <br/>
		</div>
		<hr/>
		
		<h3>방법 1(JSP)</h3>
		<%
			int price = 5000;
			int quantity = 10;
			int total = price*quantity;
		request.setAttribute("reqPrice", price);
		request.setAttribute("reqQuantity", quantity);
		request.setAttribute("total", total);
		%>
		<c:choose>
			<c:when test="${total >= 100000}">아파트 서비스~</c:when>
			<c:when test="${total >= 10000}">자전거 서비스~</c:when>
			<c:when test="${total >= 1000}">화장지 서비스~</c:when>
			<c:otherwise>
				사은품 없음
			</c:otherwise>
		</c:choose>
		
		<h3>방법 2</h3>
		<c:set var='ea' value="100"></c:set>
		<c:set var='price' value="500"></c:set>
		<c:set var='ea' value='${ea*price }'></c:set>
			<c:choose>
			<c:when test="${total >= 100000}">아파트 서비스~2</c:when>
			<c:when test="${total >= 10000}">자전거 서비스~2</c:when>
			<c:when test="${total >= 1000}">화장지 서비스~2</c:when>
			<c:otherwise>
				사은품 없음~22
			</c:otherwise>
		</c:choose>
	</fieldset>
	
	<h3>c:forTokens</h3>
	<xmp>
	[c:forTokens var='변수명' items'토큰문자열' delims='구분자']
	
	[/c:forTokens]
	</xmp>
	<c:forTokens var="item" items="개나리, 진달래, 코스모스, 장미, 국화, 수국화, 연꽃, 무궁화, 해바리기, 동백꽃 " delims=",">
		<li> <c:out value="${item }"></c:out></li>
	</c:forTokens>
		
	<h3>c:forEach</h3>
	<xmp>
		[c:forEach var='변수명' items'배열 | Collection' begin='시작값' end='끝값' step='증가값' varStatus='상태값']
		...
		[/c:forEach]
	</xmp>
	
	<fieldset>
		<legend>
			forEach를 사용하여 1~100까지의 홀수를 출력하시오.
		</legend>
		<c:forEach var="i" begin='1' end="100" step="2">
			<c:out value="${i }"></c:out>
			<!--그냥 ${i}만 사용해도 가능하다 -->
		</c:forEach>
	</fieldset>
	
	<fieldset>
		<legend>
			List[MemberVo] 타입의 데이터를 scope에 저장하고 forEach문을 사용하여 화면에 출력하시오.
		</legend>
		<%
			List<MemberVo> list = new ArrayList<MemberVo>();
			MemberVo v1 = new MemberVo();
			v1.setMid("park");
			v1.setPhone("010-1111-1111");
			list.add(v1);
			
			v1.setMid("Jeong");
			v1.setPhone("010-2222-2222");
			list.add(v1);
			
			v1.setMid("Kim");
			v1.setPhone("010-3333-3333");
			list.add(v1);
			
			request.setAttribute("list", list);
		%>
	
		<c:forEach var="vo" items="${list}" >
			<li>${vo.mid } : ${vo.phone } </li>
		</c:forEach>
	</fieldset>
	
</div>
</body>
</html>