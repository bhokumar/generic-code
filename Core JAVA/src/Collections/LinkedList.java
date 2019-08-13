package Collections;

import java.util.concurrent.Future;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by manishasingh on 8/2/2017.
 */
public class LinkedList {
	public static void main(String[] args) {
		practice1();
	}

	public static void practice1() {
		java.util.LinkedList list = new java.util.LinkedList();

		list.add("pp");
		list.add("mm");
		list.addFirst("ll");
		list.addLast("qq");
		list.add("mm");
		list.add(null);
		list.add("ss");

		list.iterator();
		System.out.println(list.indexOf(new String("mm")));
		System.out.println("List = " + list);
	}
}
