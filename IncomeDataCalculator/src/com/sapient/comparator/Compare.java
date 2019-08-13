package com.sapient.comparator;

import java.util.Collections;
import java.util.List;
import java.util.Comparator;
import com.sapient.personDAO.PersonDAO;

public class Compare {
	public static void compareByCountry(List<PersonDAO> personDAOs) {
		Collections.sort(personDAOs, new Comparator<PersonDAO>() {

			@Override
			public int compare(PersonDAO o1, PersonDAO o2) {

				String x1 = ((PersonDAO) o1).getCountry();
				String x2 = ((PersonDAO) o2).getCountry();
				int sComp = x1.compareTo(x2);
				return sComp;

			}
		});
	}

	public static void compareByGender(List<PersonDAO> personDAOs) {
		Collections.sort(personDAOs, new Comparator<PersonDAO>() {

			@Override
			public int compare(PersonDAO o1, PersonDAO o2) {

				if (o1.getCountry().equals(o2.getCountry())) {
					char x1 = ((PersonDAO) o1).getGender();
					char x2 = ((PersonDAO) o2).getGender();
					if (x1 < x2)
						return -1;
					if (x2 > x1)
						return 1;
					else
						return 0;
				}
				return 0;
			}
		});
	}
}
