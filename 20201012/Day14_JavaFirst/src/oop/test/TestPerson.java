package oop.test;
import oop.sample.vo.Person;
public class TestPerson {
	public static void main (String [ ] args) {
		Person p1 = new Person( );
		Person p2 = new Person("È«±æµ¿", 25, '³²');
		p1.display ( );
		p2.display ( );
	}
}