package access.sample;


//java ���Ͽ��� public Ŭ������ �ݵ�� �����ؾ� �Ѵ�.
//�ҽ����� �̸��� ������ Ŭ������ �ݵ�� ����!!! + public ������!!!!
public class PrivateSample {
	//Ŭ���� : ����ʵ�, ������, �޼ҵ�� ����
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
