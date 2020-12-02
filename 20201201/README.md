## Scope

var, let, const의 차이점

1. var는 함수 레벨 스코프이고 let, const는 블럭 레벨 스코프.
2. var로 선언한 변수는 선언 전에 사용 가능. let, const는 에러가 발생
3. var는 재선언 가능. let, const는 이미 존재하는 변수와 같은 이름의 변수를 또 선언하면 에러가 납니다.
4. var, let은 변수 선언시 초기 값을 주지 않아도 되지만 const는 반드시 초기값을 할당해야 함.
5. var, let은 값 재할당 가능. 
   const는 한번 할당한 값은 변경불가(단, 객체 안에 프로퍼티가 변경되는 것까지 막지는 못함).

- a=10; 이렇게 해도 변수 a는 선언된것
- a=10; (전역형 변수)
- var 의 선언이유 : 로컬변수(지역형)
- let a=10; : 로컬변수(지역형) + 재선언 불가.
- const 는 상수 선언.(ex: PI)

* var 와 let 은 변수 이며 const는 상수이다.


## JDK(SDK) JRE의 차이

- JDK(Java Development Kit) 
- JRE(Java Runtime Environment)

- 자바는 바이트코드언어
- 사용자 작성언어 => 컴파일(JDK) => 중간언어 => 인터프리팅(JRE) => 컴퓨터
  - JVM(Java Virtual Machine)은 JRE에 포함되어 있다.

## Include

include 란 현재의 문서에 다른 문서, 즉 다른 파일의 내용을 포함시켜 출력하는 것

1. 정적 include

    jsp가 컴파일되기 전에 include한 파일(common.jsp)이 부모 페이지에 삽입되어 컴파일된다.
- 사용법 : `<%@include file="/inc/common.jsp" %>`
- 장점 : include 페이지에서 선언한 변수를 부모페이지에서 별도의 변수 선언없이 사용이 가능하다.
- 단점 : 부모 페이지에 include한 파일이 많을경우 inlucde 페이지에서 선언된 변수를 추적해야해 유지보수할때 귀찮다.

2. 동적 include

    사용자가 부모페이지 호출시 실행되어질 시점에 include한 파일이 삽입된다.

- 사용법 : `<jsp:include page="/inc/common.jsp" flush="true" />`
- 장점 : 부모페이지와 include 페이지는 변수를 공유하지 않으므로 유지 보수시에 편하다.
- 단점 : 부모페이지에서 include한 파일에서 선언한 변수를 사용시 `<jsp:param name="userName" value="<%=userName%>"/>` 과 같이 부모페이지에서 지정해 주어야 한다.


# Traverse

## manipulation

    지정된 요소의 전후 안 팍에 요소를 추가하는 일반적인 기능

- 종류
    - wrap(html) | wrap(elem)
    - append(content) | appendTo(expr)
    - prepend(content) | prependTo(expr)
    - before(content) | after(content)
    - clone()
    - insertBefore(expr) | insertAfter(expr)
    - remove(expr)
    - empty()

