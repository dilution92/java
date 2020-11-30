package lotto;

public class LottoDriver {
	int [] num1;
	Lotto[]t;
	double max;
	public LottoDriver() {
		num1 = new int[6];
		t = new Lotto[45];
		Play();
		arr();
		print();
	}

	public void Play() {
		for (int i = 0; i < t.length; i++) {
			t[i] = new Lotto();
			t[i].num = ((Math.random()*45)+1)*1.00;
		}
	}
	public void arr() {
		for(int j=0; j<num1.length; j++) {
			max=0;
			for(int i=0; i<t.length; i++) {
				if(t[i].num > max) {
					max = t[i].num;
					num1[j] = i+1;
					t[i].num =0.0;
				}
			}
		}
	}
	public void print() {
		for (int n = 0; n < num1.length; n++) {
			System.out.print((n+1)+"¹ø"+"\t");
			System.out.println(num1[n]+"\t");
		}
	}
}
