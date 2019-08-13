package com.sapient.readFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import com.sapient.fileExcpetion.FileException;
import com.sapient.personDAO.PersonDAO;
import com.sapient.personDAOHandler.PersonHandler;

public class ReadCSVInputFile extends ReadDataStream {

	private static String DELIMITER = ",";

	private BufferedReader reader;

	@Override
	public synchronized void readDataFromFile(String fileName) throws FileException, IOException {

		try {
			boolean isFileExist = isFileExist(fileName);

			if (!isFileExist)
				throw new FileException("File " + fileName + " is not present in system.");

			 reader = new BufferedReader(new FileReader(
					fileName));
			
			String pesronInfo = reader.readLine();
			while ((pesronInfo = reader.readLine()) != null) {
				String[] splitPersonInfo = pesronInfo.split(DELIMITER);

				PersonDAO personDAO = new PersonDAO();
				personDAO.setGender(splitPersonInfo[2].charAt(0));
				personDAO.setCurrency(splitPersonInfo[3]);
				personDAO.setAmount(Double.parseDouble(splitPersonInfo[4]));
				personDAO.setCount(1);
				String str = splitPersonInfo[1].trim().equals("") ? splitPersonInfo[0] : splitPersonInfo[1];
				personDAO.setCountry(str);
				
				if(PersonHandler.personMap.get(personDAO) == null) {
					PersonHandler.personMap.put(personDAO, personDAO);
				}else {
					PersonDAO personDAO1 = PersonHandler.personMap.get(personDAO);
					personDAO1.incAmount(personDAO.getAmount());
					personDAO1.incCount();
					PersonHandler.personMap.put(personDAO1, personDAO1);
				}
			}

		} finally {
			if (reader != null)
				reader.close();
		}
	}

}
