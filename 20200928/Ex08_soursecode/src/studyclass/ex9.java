package studyclass;
import java.util.Scanner;
class Check{
	Scanner sc = new Scanner(System.in);
	int num = 3;
	String [] id = new String[num];
	String str;
	public Check(){
		for(int i = 0; i<id.length; i++) {
			id[i] = "a"+(i+1);
		}
	}
	void ch() {
		System.out.println("id를 입력하세요. : ");
		str = sc.next();
	}
	void print() {
		for(int i = 0; i<id.length; i++) {
			if(str.equals(id[i])) {
				System.out.println("일치합니다.");
				ch();
			}else {
				System.out.println("틀렸습니다. 다시 입력해주세요.");
				ch();
			}
		}
	}
}

public class ex9 {

	public static void main(String[] args) {

		Check c = new Check();
		c.ch();
		c.print();

	}

}
