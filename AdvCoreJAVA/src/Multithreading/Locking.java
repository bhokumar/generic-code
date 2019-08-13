package Multithreading;

import java.util.HashMap;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Locking {

	public static void main(String[] args) throws InterruptedException {
		ReentrantLock k = new ReentrantLock(true);
		Condition condition = k.newCondition();
		HashMap<String, String> hashMap = new HashMap<>();

		k.lock();
		while (hashMap.get("manisha") != null)
			condition.await();
		hashMap.put("a", "manisha");
		k.unlock();

		hashMap.remove("manisha");

		if (hashMap.get("manisha") == null)
			k.lock();
		try {
			condition.notifyAll();
		} finally {
			k.unlock();
		}
	}

}
