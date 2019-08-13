package Multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class EvenNumber implements Runnable {

	AtomicInteger atomicInteger;

	public EvenNumber(AtomicInteger atomicInteger) {
		this.atomicInteger = atomicInteger;
	}

	@Override
	public void run() {
		synchronized (atomicInteger) {

			for (int idx = 0; idx < 20; idx++) {
				while (atomicInteger.get() % 2 != 0) {
					try {
						atomicInteger.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

				System.out.println(atomicInteger.get());
				atomicInteger.incrementAndGet();

				atomicInteger.notifyAll();

			}
		}
	}

}
