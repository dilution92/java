
/**
 �ڹ� Ŭ������ ���� API ��ť��Ʈ �ۼ� �׽�Ʈ�� Ŭ����
 */
 public class TestDoc{
	 /**
	  �̸� ����� �������
	  */
	 private String name;
	 
	 /**
	  ���� ����� �������
	  */
	 private int age;
	 
	 /**
	  ��ü ������ ������� �ʱ�ȭ�� �Ű����� �ִ� ������/
	  */
	 public TestDoc(String name, int age) {
		 this.name = name;
		 this.age = age;
	 }
	 /**
	  ��������� ���� ���� �ܼ� ȭ�鿡 ��½�Ű�� �޼ҵ�
	  */
	 public void print() {
		 System.out.println(name+","+age);
	 }
	 
  }
