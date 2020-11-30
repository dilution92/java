package dice;

public class PairOfDice {
	private int v1;
	private int v2;
	public PairOfDice(){
		v1 = 1; 
		v2 = 1;
	}

	public void Play() {
		v1 = (int) (Math.random()*6) +1;
		v2 = (int) (Math.random()*6) +1;
	}
	
	public int getV1() {
		return v1;
	}
	
	public int getV2() {
		return v2;
	}
	public int getSum() {
		return v1+v2;
	}
	
	
}
