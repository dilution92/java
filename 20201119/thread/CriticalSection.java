package thread;

public class CriticalSection {

	private int data = 1000;

	public boolean extractData(int value) {
		if (data >= value) {
			try {
				Thread.sleep(1000);

			} catch (InterruptedException ignore) {}
			data -= value;
			return true;
		}
		return false;
	}
	
	public int getData ( ) {
		return data;
	}
}
