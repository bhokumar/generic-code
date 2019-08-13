package Multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class OddNumber implements Runnable {

	AtomicInteger atomicInteger;

	public OddNumber(AtomicInteger atomicInteger) {
		this.atomicInteger = atomicInteger;
	}

	@Override
	public void run() {
		synchronized (atomicInteger) {
			for (int idx = 0; idx < 20; idx++) {
				while (atomicInteger.get() % 2 == 0) {
					try {
						atomicInteger.wait();
					} catch (InterruptedException e) {
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
