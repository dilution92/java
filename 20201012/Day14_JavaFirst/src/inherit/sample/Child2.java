package inherit.sample;
public class Child2 extends Parent2 {
public Child2() {
super(); // 부모 기본 생성자 호출
System.out.println("자식 기본 생성자");
}
 @Override
public void out() {
super.out(); // 부모 메소드 out() 호출
System.out.println("자식 out() 메소드");
}
}