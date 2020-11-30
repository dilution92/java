package oop.sample;
public class Point { // 클래스 헤더
	private int posX;// 멤버필드
	private int posY; // 멤버필드
	// 메소드
	
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
	// 생성자
	public Point ( ) {
		System.out.println("기본생성자 실행");
	}
	public Point (int posX, int posY) {
		this(); // 기본생성자를 불러온다. 가장 윗줄에다 호출
		this.posX = posX;
		this.posY = posY;
	}


}
