package thread;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) throws InterruptedException {
		//���ŷ
		final Scanner sc = new Scanner(System.in);
		sc.next();
		System.out.println("next�� ����Ǳ� ������ �̰��� ����");


		//������
		final Task task = new Task();
		final Thread thread = new Thread(task);
		thread.start();

		//������ ���
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

		//������ ����(����������Ŭ)
		final CriticalSection cs = new CriticalSection();
		final Worker w1 = new Worker(cs);
		final Worker w2 = new Worker(cs);
		w1.start();
		w2.start();

		//������ ��������
		final WorkerThread thread2 = new WorkerThread();
		final Watchdog watchdog = new Watchdog(thread);
		watchdog.start();


		//���丮��
		final FactorialThread thread3 = new FactorialThread();
		thread3.start();
		System.out.println("start ��");
		thread3.join();
		System.out.println("join ��");
		final long result = thread3.getData();
		System.out.println(result);

	}
}
