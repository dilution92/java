package thread;

public class HelloThread extends Thread{

	@Override
	public void run() {
		while (true) {
    		System.out.println("¾È³ç");
    		try {
				Thread.sleep(1000);
			} catch (InterruptedException ignore) {

			}
    	}
	}
}
