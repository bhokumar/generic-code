package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class CollectionsClasss {

	public static void main(String[] args) {
	
		ArrayList list = new ArrayList<>();
		list.add("manish");
		list.add("manish1");
		list.add("manish2");
		list.add("manish3");
		reverse(list);
		System.out.println(list);
	
		List t = Collections.unmodifiableList(list);
		t.add("kk");
		System.out.println(list == t);
		
        
	}
	
	private static void reverse(ArrayList list)
	{
		ListIterator fwd = list.listIterator();
		ListIterator rev = list.listIterator(list.size());
		
		for(int i=0, mid=list.size()/2; i<mid; i++)
		{
			Object oj1 = fwd.next();
			fwd.set(rev.previous());
			rev.set(oj1);
		}
		
		
	}

}
