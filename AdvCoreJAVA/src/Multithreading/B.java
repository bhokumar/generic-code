package Multithreading;

public class B implements Runnable{
	public String str = "B";
	@Override
	public void run() {
		System.out.println(str);
		
	}
}
