package Multithreading;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchExample {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C();

		Thread t = new Thread(a);
		Thread t1 = new Thread(b);
		Thread t2 = new Thread(c);

		t.start();
		t1.start();
		t2.start();
		
		CountDownLatch countDownLatchA = new CountDownLatch(0);
		CountDownLatch countDownLatchB = new CountDownLatch(0);
		CountDownLatch countDownLatchC = new CountDownLatch(0);
	}

}
