package Collections;

import java.util.TreeMap;
import java.util.TreeSet;

public class Treemap {

	public static void main(String[] args) {
		
		Employeee e = new Employeee();
		e.h = 1;
		e.name = "manisha";
		
		Employeee e1 = new Employeee();
		e1.h = 2;
		e1.name = "ee";
		
		ComparatorByID comparatorByID = new ComparatorByID();
		
		TreeMap<Employeee, String> map = new TreeMap<Employeee, String>(comparatorByID);
		map.put(e, "a");
		map.put(e1, "n");
		
		
		System.out.println(map);
		
		TreeSet set = new TreeSet<>();
		set.add(null);
	}
}
