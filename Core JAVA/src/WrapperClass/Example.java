package WrapperClass;

import java.util.concurrent.Semaphore;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		practice1();
	}

	private static void practice1()
	{
		Semaphore s = new Semaphore(1);
		s.acquire();
	}
}
