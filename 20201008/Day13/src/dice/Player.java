package dice;

public class Player {
	private String name;
	private int num;
	PairOfDice d;
	
	public Player() {
		d = new PairOfDice();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	@Override
	public String toString() {
		return num+"번 플레이어 " + name ;
	}
	
	
}
