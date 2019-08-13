package Threadss;

import java.util.ArrayList;

public class Consumer implements Runnable{
	
	ArrayList l;
	
	public Consumer(ArrayList l) {
		this.l = l;
	}

	@Override
	public void run() {
		
		
		while(true) {
		// TODO Auto-generated method stub
		produce();}
	}
	
	synchronized void produce()
	{
		synchronized (l) {
		try
		{
		if(l.size() == 0)
		{
			
				try {
					System.out.println("Waiting");
					l.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
		
		
			
			System.out.println(l.remove(l.size() - 1));
			l.notifyAll();
		}
	
	
	catch(Exception e)
	{
		e.printStackTrace();
	}}}
}
