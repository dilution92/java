package thread;

public class HelloThread extends Thread{

	@Override
	public void run() {
		while (true) {
    		System.out.println("�ȳ�");
    		try {
				Thread.sleep(1000);
			} catch (InterruptedException ignore) {

			}
    	}
	}
}
