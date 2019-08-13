package Multithreading;

public class C implements Runnable{
	public String str = "C";

	@Override
	public void run() {
		System.out.println(str);
		
	}
}
