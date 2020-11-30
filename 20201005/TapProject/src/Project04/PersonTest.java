package Project04;
//14번 . 현재 소스코드를 실행 시켜 보세요.
//PersonDriver 클래스를 새롭게 생성하시오. 
//Person 클래스를 이용하여, 멤버필드로 생성하세요.
//12~16번째 데이터 초기화는 PersonDriver()생성자에서 하세요.
//18~21번째에 대한 출력문은 print()메소드를 정의하여 출력하시오.
//void main은 간소화하시오(즉, new PersonDriver()만 남도록 코딩하세요)
public class PersonTest {

	public static void main(String[] args) {

		Person person = new Person();
		person.age = 40;
		person.name = "James";
		person.isMarried = true;
		person.numberOfChildren = 3;
		
		System.out.println("age : " + person.age);
		System.out.println("name : " + person.name);
		System.out.println("isMarried : " + person.isMarried);
		System.out.println("numberOfChildren : " + person.numberOfChildren);
	}

}
