package access.sample;


//java 파일에는 public 클래스가 반드시 존재해야 한다.
//소스파일 이름과 동일한 클래스가 반드시 존재!!! + public 무조건!!!!
public class PrivateSample {
	//클래스 : 멤버필드, 생성자, 메소드로 구성
	private  int num;
	
	public PrivateSample() {
		
	}

	public int getNum() {
		return num;

	}

	public void setNum(int num) {
		if(num>10) {
			this.num = -1;
		}else {
			this.num = num;
		}
	}
}
