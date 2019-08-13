package Multithreading;

public class UnCaughtExceptionHandler implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		UnCaughtExceptionHandler unCaughtExceptionHandler = new UnCaughtExceptionHandler();
		
		Thread t = new Thread(unCaughtExceptionHandler);
		t.start();
		t.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
			
			@Override
			public void uncaughtException(Thread t, Throwable e) {
				System.out.println("Oopsssss");
				
			}
		});
	}
}
