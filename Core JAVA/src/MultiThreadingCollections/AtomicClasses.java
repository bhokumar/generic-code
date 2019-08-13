package MultiThreadingCollections;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;

public class AtomicClasses<E> {

	AtomicReference<Node<E>> top = new AtomicReference<Node<E>>();

	public void push(E item) {
		Node<E> newHead = new Node<E>(item);
		Node<E> oldHead;

		oldHead = top.get();
		newHead.next = oldHead;
		top.compareAndSet(oldHead, newHead);
	}

	public E pop() {
		Node<E> oldHead;
		Node<E> newHead;

		oldHead = top.get();
		if (oldHead == null)
			return null;
		newHead = oldHead.next;
		top.compareAndSet(oldHead, newHead);
		return oldHead.item;
	}

	private static class Node<E> {
		public final E item;
		public Node<E> next;

		public Node(E item) {
			this.item = item;
		}
	}

	/**
	 * Atomic Wrapper clases ensure read data. increment data. store data in one
	 * phase.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		practice3();

	}

	public static void practice1() {
		AtomicBoolean atomicBoolean = new AtomicBoolean();
		boolean prev = atomicBoolean.getAndSet(false);
		atomicBoolean.get();
		atomicBoolean.set(false);
		boolean jj = atomicBoolean.compareAndSet(true, false);
		System.out.println(prev + "---" + atomicBoolean.get() + "---" + jj);
	}

	public static void practice2() {
		AtomicInteger atomicInteger = new AtomicInteger();
		System.out.println(atomicInteger.get());
		;
		atomicInteger.set(3);
		System.out.println(atomicInteger.getAndSet(4));
		System.out.println(atomicInteger.compareAndSet(7, 6));
		System.out.println(atomicInteger.getAndAdd(4));
		System.out.println(atomicInteger.addAndGet(5));
		System.out.println(atomicInteger.getAndIncrement());
		System.out.println(atomicInteger.incrementAndGet());

	}

	public static void practice3() {
		// String g = new String("Hi MAnisha Singh");
		// AtomicReference<String> st = new AtomicReference<>();
		// String gg = new String("Hi MAnisha Singh");
		//
		// System.out.println(st.get());
		// System.out.println(st.compareAndSet(st.get(), gg));
		//
		// System.out.println(st.get());

		AtomicClasses<Integer> a = new AtomicClasses<>();

		for (int idx = 0; idx < 10; idx++) {
			a.push(idx);
		}
		
		System.out.println(a.top);
	}
}
