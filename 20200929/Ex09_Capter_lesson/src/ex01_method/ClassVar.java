package ex01_method;

class InstCnt {
	int instNum = 0;   // Ŭ���� ���� (static ����)

	InstCnt() {
		instNum++;  
		System.out.println("�ν��Ͻ� ����: " + instNum);
	}
} 
public class ClassVar {
	public static void main(String[] args) {
		InstCnt cnt1 = new InstCnt();
		InstCnt cnt2 = new InstCnt();
		InstCnt cnt3 = new InstCnt();

	}
}
