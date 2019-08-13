package Multithreading;

public class A implements Runnable{
public String str = "A";
@Override
public void run() {
	System.out.println(str);
	
}
}
