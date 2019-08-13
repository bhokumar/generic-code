package com.sapient.writePersonDetails;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import com.sapient.comparator.Compare;
import com.sapient.personDAO.PersonDAO;
import com.sapient.personDAOHandler.PersonHandler;

public class SavePersonDetails {

	private static String DELIMITERCOMMA = ",";
	private static String DELIMITERNEWLINE = "\n";

	public synchronized static void write(String fileName) {
		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter(new File(fileName));
			writeHeader(fileWriter);
			writeData(fileWriter);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (fileWriter != null)
				try {
					fileWriter.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}

	private static void writeHeader(FileWriter fileWriter) throws IOException {
		fileWriter.write("Country/City Name");
		fileWriter.write(DELIMITERCOMMA);
		fileWriter.write("Gender");
		fileWriter.write(DELIMITERCOMMA);
		fileWriter.write("Average Income(USD)");
		fileWriter.write(DELIMITERNEWLINE);
	}

	private static void writeData(FileWriter fileWriter) throws IOException {
		Iterator<PersonDAO> iterator = PersonHandler.personMap.keySet().iterator();

		ArrayList<PersonDAO> list = new ArrayList<>();
		while (iterator.hasNext()) {
			PersonDAO personDAO = iterator.next();
			personDAO.setAmount(personDAO.calculateAverageIncome() / personDAO.getCount());
			list.add(personDAO);
		}

		Compare.compareByCountry(list);
		Compare.compareByGender(list);

		for (int idx = 0; idx < list.size(); idx++) {
			PersonDAO personDAO = list.get(idx);
			fileWriter.write(personDAO.getCountry());
			fileWriter.write(DELIMITERCOMMA);
			fileWriter.write(personDAO.getGender());
			fileWriter.write(DELIMITERCOMMA);
			fileWriter.write(personDAO.getAmount() + "");
			fileWriter.write(DELIMITERNEWLINE);
		}
	}
}
