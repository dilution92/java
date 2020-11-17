# 1. 재귀함수

factorial(5)
5! = 5 * (4 * (3 * (2 * 1)))

장점
- 코드 표현이 간단해짐

단점
- 성능 이슈 존재가능
- 콜 스택이 많이 쌓이면 터질 수 있음

## 1.1 재귀함수 작성 시 유의사항

- 탈출 조건 명시 필요

```java
private static int factorial (int i) {
	//탈출 조건
    	if (i ==1) {
			return 1;
		}
		return i * factorial(i-1);
	}

```

꼬리 재귀 최적화(tail recursion optimization)

## 1.2. 문제

1 1 2 3 5 8 13 ....

n번째 항(n>2, n은 3이상)은 n-1번쨰 항과 n-2번쨰 항의 합

An = A(n-1) + A(n-2)

# 2. quickSort

- 추가적인 메모리 필요 없음
- 소팅 속도 빠름

## 2.1. 알고리즘

pivot : 5
5 3 8 4 9 1 6 2 7 

less(작은거) : 3 4 1 2
g(큰거) : 8 9 6 7
less=sort(less)// [1 2 3 4]
greater=sort(greater)
return less+pivot+greater

pivot : 3
3 4 1 2
l : 1 2 
g : 4

less+pivot+greater
[1 2 3 4]

---------------------
pivot:8
8 9 6 7 

l : 6 7 
g : 9