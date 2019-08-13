package Threadss;

import java.util.ArrayList;

public class Producer implements Runnable{
	
	ArrayList l;
	
	public Producer(ArrayList l) {
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
		if(l.size() == 100)
		{
			
				try {
					System.out.println("llllllll");
					l.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		
		
			
			System.out.println("Produced");
			l.add(1);
			l.notifyAll();
		}
	
		catch(Exception e) {e.printStackTrace();}}}
}
