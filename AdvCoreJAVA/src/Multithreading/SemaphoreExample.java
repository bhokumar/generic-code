package Multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class SemaphoreExample {

	public static void main(String[] args) {
		AtomicInteger atomicInteger = new AtomicInteger(1);
		EvenNumber evenNumber  = new EvenNumber(atomicInteger);
		OddNumber oddNumber = new OddNumber(atomicInteger);
		
		Thread t1 = new Thread(evenNumber);
		Thread t2 = new Thread(oddNumber);
		
		t1.start();
		t2.start();
	}

}
