package ex01_method;

public class Tv {
	String color;  // 색깔
	boolean power; // 전원상태(on/off)
	int channel;   // 채널
	void power() { power = !power; } // 전원on/off
	void channelUp() {channel++;}      // 채널 높이기
	void channelDown() {channel--;}    // 채널 낮추기

	public static void main(String[] args) {
		
		Tv t = new Tv();
		t.channel = 7;
		t.channelDown();
		System.out.println(t.channel);
	}

}
