package Threadss;

import java.util.concurrent.CyclicBarrier;

public class CyclicBarier {

	public static void main(String[] args) {
		CyclicBarrier cyclicBarrier = new CyclicBarrier(2, new Runnable() {
			
			@Override
			public void run() {
				System.out.println("mmmm");
				
			}
		});

		th t = new th(cyclicBarrier);
	Thread t1 = new Thread(t);
	Thread t2 = new Thread(t);
	Thread t3 = new Thread(t);
	Thread t4 = new Thread(t);
	t1.start();
	t2.start();
	t3.start();
	t4.start();
	}

}
