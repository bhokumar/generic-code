package Threadss;

import java.util.concurrent.CountDownLatch;

public class Latch {

	public static void main(String[] args) {
		CountDownLatch countDownLatch = new CountDownLatch(4);

		for (int idx = 0; idx < 10; idx++) {
			th t = new th(countDownLatch);
			//System.out.println("Stated");
		    Thread tt = new Thread(t);
		    
		    tt.start();
		}
		
		System.out.println("ppppppppwaiting....");
		try {
			countDownLatch.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("pppppppp");
	}

}
