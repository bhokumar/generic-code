package Threadss;

import java.util.ArrayList;
import java.util.concurrent.FutureTask;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Tester extends Thread{

	ArrayList list;
	ReentrantLock lock = new ReentrantLock();
	
	
	public Tester(ArrayList list) {
		this.list = list;
		// TODO Auto-generated constructor stub
	}
	public void get(ArrayList list)
	{
		try {
			lock.lockInterruptibly();
			
			Thread.sleep(10000);
			
			System.out.println("rrr");
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	   try {
	
		  
		   lock.unlock();
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	
	@Override
	public void run() {
		try {
			
			lock.lock();
			System.out.println(Thread.currentThread().getName() + " Going to sleep");
			get(list);
			
			lock.unlock();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
//			System.out.println("Sleep  interruted.....");
		}
		
		System.out.println("mmm");
	}

	public void k()
	{
		lock.lock();
		get(list);
		
		lock.unlock();
	}
}
