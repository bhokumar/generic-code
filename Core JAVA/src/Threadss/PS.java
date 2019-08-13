package Threadss;

import java.util.ArrayList;

public class PS {

	public static void main(String[] args) { 
		
		try
		{
		ArrayList l = new ArrayList();
		Producer p = new Producer(l);
		
		Consumer c = new Consumer(l);
		
		Thread t = new Thread(p);
		Thread t1 = new Thread(c);
		
		t.start();
		t1.start();
		}
	
		catch(Exception | Error e)
		{
			e.printStackTrace();
		}
	}

}
