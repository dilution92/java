package thread;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) throws InterruptedException {
		//블로킹
		final Scanner sc = new Scanner(System.in);
		sc.next();
		System.out.println("next가 종료되기 전까지 이곳에 못옴");


		//스레드
		final Task task = new Task();
		final Thread thread = new Thread(task);
		thread.start();

		//스레드 상속
		final Thread helloThread = new HelloThread();
		helloThread.start();

		//ThreadPriority
		for(int i=0; i<10; i++) {
			Thread thread1 =new ThreadPriority("Thread-"+(i+1));
			if(i==9) {
				thread.setPriority(Thread.MAX_PRIORITY);
			} else {
				thread.setPriority(Thread.MIN_PRIORITY);
			}
			thread1.start();
		}

		//스래드 상태(라이프사이클)
		final CriticalSection cs = new CriticalSection();
		final Worker w1 = new Worker(cs);
		final Worker w2 = new Worker(cs);
		w1.start();
		w2.start();

		//스래드 상태제어
		final WorkerThread thread2 = new WorkerThread();
		final Watchdog watchdog = new Watchdog(thread);
		watchdog.start();


		//팩토리얼
		final FactorialThread thread3 = new FactorialThread();
		thread3.start();
		System.out.println("start 후");
		thread3.join();
		System.out.println("join 후");
		final long result = thread3.getData();
		System.out.println(result);

	}
}
