package thread;

public class Watchdog extends Thread{

	private final Thread target;

	public Watchdog(Thread target) {
		this.target = target;
	}

	@Override
	public void run() {
		while(true) {
			final State state =	target.getState();
			System.out.println("target thread state: "+ state);

			if(state.NEW.equals(state)) {
				target.start();
			}
			
			if(State.TERMINATED.equals(state)) {
				System.out.println("감시 종료");
				break;
			}
			
			try {
				Thread.sleep(400);
				
			} catch (InterruptedException ignore) {}
		}
	}
}
