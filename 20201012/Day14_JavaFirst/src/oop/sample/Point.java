package oop.sample;
public class Point { // Ŭ���� ���
	private int posX;// ����ʵ�
	private int posY; // ����ʵ�
	// �޼ҵ�
	
	public int getPosX() { 
		return posX; 
	}
	public void setPosX(int posX) {
		this.posX = posX; 
	}
	public int getPosY() { 
		return posY; 
	}
	public void setPosY(int posY) {
		this.posY = posY; 
	}
	// ������
	public Point ( ) {
		System.out.println("�⺻������ ����");
	}
	public Point (int posX, int posY) {
		this(); // �⺻�����ڸ� �ҷ��´�. ���� ���ٿ��� ȣ��
		this.posX = posX;
		this.posY = posY;
	}


}
