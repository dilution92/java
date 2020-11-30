# jQuery

- html + CSS + javascript를 통합한 하나의 라이브러리
- 굉장히 수운 접근 방법을 제공한다. --> 전체 처리 속도 감소.
- 모든 javascript 문법은 그대로 사용 가능.
- 대소문자 구별
- '' or "" 구별하지 않음
- 라이브러리를 사용하는 방법
  - CDN
  - 라이브러리를 해당 프로젝트 내에 복사해서 사용
- jQuery는 모든 것이 함수화 되어 있어 함수에 대한 이해가 높을 수록 jQuery의 이해도가 높아질 수 있다.


EX) id = 'abc'인 요소를 선택
```javascript
var id = document.getElementByid('abc');
function :
    var getId =function(id) {
        return document.getElementByid(id);
    }
    var id = getId('abc');

```

```javascript
var id = $('#abc'); // jQuery
```

## 선택된 요소중 필요한 요소만을 걸러내는 방법 
- 접두문자 ':'을 사용한다. 
- 필터와 필터를 연결하여 사용할 수 있다. 
- 종류 => :eq(index) 해당 인덱스, :even 짝수, :odd 홀수, :first 처음, :last 마직막,gt(index) 인덱스보다 큰,lt(index) 인덱스보다 작은



# CSS
- id : #ele {...} --> $().css()
- class : .ele
 - #ele > ele
 - #ele ele
 - #ele[]

# DOM(Document Object Model)

html을 트리구조로 표현한 것. 
- selectors, Attributes, Traversing, Manipulation, CSS
- Event, Effectsm, Ajax

# JSON

## 표기 방법

1. KEY:VALUE => {KEY:VALUE, KEY:VALUE,...}
2. 배열 => [v1, v2, v3, ...]
3. 혼합형 
   - 배열안에 map : [{ }, { }, ....]
   - map 안에 배열 : {key : [,,,,] }


# MVS

- M : Model(데이터)
- V : view(UI, UX)
- C : Control(code)

## 다른 jsp 파일을 컨텐트에 포함시키기

- css : `<link/>`
- javascript : `<script src />`
- jsp
 1. 동적 include
 2. 정적 include

`<%
	String inc = "intro.jsp";
	if(request.getParameter("inc") != null) {
		inc = request.getParameter("inc");
	}
%>`


* index.jsp?inc=./jquery/filter.jsp를 통해 파라미터값을 받아와서 링크를 연결