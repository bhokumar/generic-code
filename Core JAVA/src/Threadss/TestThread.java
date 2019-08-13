package Threadss;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;


public class TestThread {

	public static void main(String[] args) {
		
		/**
		 * 1. yield - A hint to the scheduler that the current thread is willing to yield
     * its current use of a processor. The scheduler is free to ignore this
     * hint.    
     * 
     * 
     * It is rarely appropriate to use this method. It may be useful
     * for debugging or testing purposes, where it may help to reproduce
     * bugs due to race conditions. It may also be useful when designing
     * concurrency control constructs such as the ones in the
     * {@link java.util.concurrent.locks} package.
     * 
     * 
     * 2. sleep - Causes the currently executing thread to sleep. Does not release monitor lock.
     * 
     * 3. stop - This method is inherently unsafe.  Stopping a thread with
     *       Thread.stop causes it to unlock all of the monitors that it
     *       has locked. If any object that it has locked in an inconsistent state then it will be visible to other threads.
     *       
     * 4. interrupt - If this thread is blocked in an invocation of the {@link
     * Object#wait() wait()}, {@link Object#wait(long) wait(long)}, or {@link
     * Object#wait(long, int) wait(long, int)} methods of the {@link Object}
     * class, or of the {@link #join()}, {@link #join(long)}, {@link
     * #join(long, int)}, {@link #sleep(long)}, or {@link #sleep(long, int)},
     * methods of this class, then its interrupt status will be cleared and it
     * will receive an {@link InterruptedException}.
     *
     *
     *  5. interrupted - Tests whether the current thread has been interrupted.  The
     * <i>interrupted status</i> of the thread is cleared by this method. 
     * 
     * 6. isInterrupted - Tests whether the current thread is interrupted
     * 
     * 7. destroy - This method was originally designed to destroy this
     *     thread without any cleanup. Any monitors it held would have
     *     remained locked. throw new NoSuchMethodError();
     *     
     * 8. isAlive - 
     * 
     * 9. suspend - If the thread is alive, it is suspended and makes no further
     * progress unless and until it is resumed. This method has been deprecated, as it is
     *   inherently deadlock-prone.  If the target thread holds a lock on the
     *   monitor protecting a critical system resource when it is suspended, no
     *   thread can access this resource until the target thread is resumed. If
     *   the thread that would resume the target thread attempts to lock this
     *   monitor prior to calling <code>resume</code>, deadlock results.  Such
     *   deadlocks typically manifest themselves as "frozen" processes.
     *   
     *   10 . join- wait for thread to die.
     *   
     *   Reentrant vs synchronized - 
     *     http://javarevisited.blogspot.in/2013/03/reentrantlock-example-in-java-synchronized-difference-vs-lock.html
		 */
		
		
		
		practice1();
		/**
		 * Concurrency Model - 
		 * 
		 * 1. Parallel Worker 
		 * 
		 * 2. Assembly Line
		 */

	}
	
	public static void practice1()
	{
		/**
		 * 
		 */
		
		ArrayList list = new ArrayList<>();
		Tester tester = new Tester(list);
		
		Thread t = new Thread(tester);
		Thread t1 = new Thread(tester);
		t.start();
		t1.start();
		
		t.interrupt();
//		tester.k();
		
//		Tester[] t = new Tester[3];
//		t[0] = tester;
//		t[1] = tester1;
//		t[2] = tester2;
//	
//		t[0].start();
//		try {
//			t[0].sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		System.out.println("dfgfdg");
		
//		try {
//			t[0].join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println(t[0].isInterrupted());
		
		ExecutorService executorService = Executors.newFixedThreadPool(2);
//		
//		for(int idx = 0; idx < t.length; idx++)
//		{
//		  Future future = executorService.submit(t[idx]);
////		  try {
//////			System.out.println(future.get());
////		} catch (InterruptedException | ExecutionException e) {
////			// TODO Auto-generated catch block
////			e.printStackTrace();
////		}
////		 
//		}
//		
//		executorService.shutdown();
//		executorService.submit(t[0]);
//		while(!executorService.isTerminated()) {}
			
		
		ReentrantLock reentrantLock;
	}

}
