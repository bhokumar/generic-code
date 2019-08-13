package Collections;

import java.util.Comparator;

public class ComparatorByID implements Comparator<Employeee>{

	@Override
	public int compare(Employeee o1, Employeee o2) {
		if(o1.h < o2.h)
			return -1;
		if(o1.h > o2.h)
			return 1;
		return 0;
	}

}
