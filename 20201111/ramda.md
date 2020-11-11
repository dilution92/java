# 람다식

(parameter) -> {
    // body
    // return type
}

type lamda(parameter) {
    // body
    // return type
}

@FuntionalInterface
- 메소드는 단 하나

# 실습

- 파라미터
  - string 파라미터 2개
- 반환타입
  - int

(String s1, String s2) -> {
    return s1.length() + s2.length;
}


1. 인터페이트 생성
2. @FunctionalInterface 어노테이션 추가
3. 위의 파라미터, 반환타입 정의에 맞는 메서드 정의