package Collections;

import java.util.Comparator;

public class ComparatorByName implements Comparator<Employeee>{


	@Override
	public int compare(Employeee o1, Employeee o2) {
		return o1.name.compareTo(o2.name);
	}

}
