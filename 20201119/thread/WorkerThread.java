package thread;

public class WorkerThread extends Thread{
	
	
	@Override
	public void run() {
		long sum = 0;
		final long t1 = System.currentTimeMillis();
		for (int i=0;  i<2000000000; i++) {
			sum +=1;
		}
		try {
			Thread.sleep(3000);
		} catch (InterruptedException ignore) {
			// TODO: handle exception
		}
		for (int i=0;  i<2000000000; i++) {
			sum +=1;
		}
	}
}
