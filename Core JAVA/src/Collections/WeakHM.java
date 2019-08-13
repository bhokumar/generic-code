package Collections;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.IdentityHashMap;
import java.util.WeakHashMap;

public class WeakHM {

	public static void main(String[] args) {
		/*
		 * An entry in a <tt>WeakHashMap</tt> will automatically be removed when its key
		 * is no longer in ordinary use.
		 */

		Employeee employeee = new Employeee();

		WeakHashMap weakHashMap = new WeakHashMap<>();
		WeakReference<Employeee> weakReference = new WeakReference<Employeee>(employeee);
		weakHashMap.put(weakReference, "manisha");

		employeee = null;

		/**
		 * IdentityHm uses == operator for comparison not equals method.
		 */
		IdentityHashMap identityHashMap = new IdentityHashMap<>();

		System.out.println(weakHashMap);

	}

}
