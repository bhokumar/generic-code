package Multithreading;

public class BasicOfThread implements Runnable{

	public BasicOfThread() {
		
	}
	
	public static void main(String[] args) {
		BasicOfThread basicOfThread = new BasicOfThread();
		Thread t = new Thread(basicOfThread);
		t.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Printing.....");
			e.printStackTrace();
		}
		t.interrupt();
		
		System.out.println(t.isInterrupted() + ", 000000 " + t.interrupted());
	}

	@Override
	public void run() {
		for(int idx = 0; idx < 1000000; idx++)
		{
			try {
				Thread.sleep(1000);
				System.out.println(idx);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
