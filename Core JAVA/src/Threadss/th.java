package Threadss;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

public class th implements Runnable{

	CyclicBarrier countDownLatch;
	public th(CyclicBarrier countDownLatch) {
		this.countDownLatch = countDownLatch;
	}
	@Override
	public void run() {
		try {
			System.out.println("Waiting......");
			//countDownLatch.await();
			System.out.println("Done");
			
			countDownLatch.await();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
