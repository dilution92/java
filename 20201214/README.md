1. sesstion 처리를 사용한 로그인
2. 로그인 처리를 위한 Database 사용부분
3. request(요청정보) 세부 사용법
	- request.getParameter(): 항목이 1개 요소(text, radio, number, date, color, datetime...)
	- request.getParameterValues(): 항목이 2개 이상(chekcbox, select)
	- Enumeration collection 사용(getParameterName
4. 각종 scope(application, session, request, pageContext)
5. 액션태그 (include, forward, useBean, setProperty)


# 현재 페이지 정보를 강제로 새로고침하는 방법

1. 개발자모드 -> network -> disable Cache 체크 박스 선택
2. f5키 대신 -> Ctrl + Shift +R(r)
3. 소스 전체를 오려두기 -> 저장 -> 붙이기 -> 저장
4. 프로젝트 clean: project -> clean