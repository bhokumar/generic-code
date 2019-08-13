package Multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExecutorsClass {

	static int idx = 0;
	public static void main(String[] args) {
//		ExecutorService executorService = Executors.newCachedThreadPool();
//		executorService.execute(new Runnable() {
//			
//			@Override
//			public void run() {
//				System.out.println("1");
//				
//				try {
//					Thread.sleep(1000);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				
//			}
//		});
//		
//		executorService.shutdown();
//		
//		while(!executorService.isTerminated()) {}
//		
//		System.out.println("fdfsdfsd");
		
		ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
		
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(++idx);
				
			}
		};
		
		scheduledExecutorService.scheduleAtFixedRate(r, 10, 1, TimeUnit.SECONDS);
		
//		scheduledExecutorService.scheduleWithFixedDelay(r, 10, 1, TimeUnit.SECONDS);
	}

}
