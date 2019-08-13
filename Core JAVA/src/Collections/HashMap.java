package Collections;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by manishasingh on 8/16/2017.
 */
public class HashMap {
	public static void main(String[] args) {
		// /* 1. No duplicate keys are allowed. */
		// java.util.HashMap hashMap = new java.util.HashMap();
		// hashMap.put(null, null);
		// for(int idx = 0; idx < 13; idx++) {
		// Employeee employeee = new Employeee();
		// employeee.h = idx;
		// employeee.name = "a" + idx;
		// hashMap.put(idx, employeee.name);
		// }
		//
		// Set<Map.Entry> k = hashMap.entrySet();
		//
		// Iterator itr = k.iterator();
		// while(itr.hasNext())
		// {
		// Map.Entry kh = (Map.Entry)itr.next();
		//
		// }
		//
		// System.out.println(hashMap.putIfAbsent(17, "kk"));
		// System.out.println(hashMap.putIfAbsent(17, "mm"));
		// System.out.println(hashMap);

		java.util.HashMap<Employeee, Integer> hMap = new java.util.HashMap<>();
		Employeee employeee = new Employeee();
		employeee.h = 1;
		employeee.name = "manisha";
		hMap.put(employeee, 1);

//		Employeee employeee1 = new Employeee();
//		employeee1.h = 1;
//		employeee1.name = "manisha";
//		hMap.put(employeee1, 2);

		Employeee employeee2 = new Employeee();
		employeee2.h = 1;
		employeee2.name = "manisha";
		// System.out.println(hMap.size());

		System.out.println(hMap.get(employeee2));
	}
}
