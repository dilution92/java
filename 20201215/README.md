# jsp:useBean, jsp:setProperty

```java
<jsp:useBean id="dao" class="bean.MemberDao"/>
```


 - EE Java object class는 Bean
 - class="bean.MemberDao" = ()생성자

jsp 액션태그 *** 이거 찾아서 메모
include
forword
```java
	<jsp:useBean id="dao" class="bean.MemberDao"/>
	<jsp:useBean id="vo" class="bean.MemberVo"/>
	
	<%--vo객체가 가지고 있는 모든 setter를 사용하여 갑을 대입 --%>
	<jsp:setProperty property="*" name="vo"/>
```
 - `<jsp:setProperty property="*" name="vo"/>` 하나 만으로
 `vo.setMid(request.getParameter("mid")` 이런 프로퍼티들이 다 들어가 있다.

# jstl 라이브러리 설치 및 사용예(pdf:134)(조건, 반복문)

# GuestbookVo,GuestBookDao 제작(4대 쿼리)

# MVC Model2 방식 이해(pdf:26)

# MemberVo, MemberDao 제작(4대 쿼리: CRUD)


