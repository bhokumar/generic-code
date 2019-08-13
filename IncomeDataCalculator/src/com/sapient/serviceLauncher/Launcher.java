package com.sapient.serviceLauncher;

import java.io.IOException;
import java.util.Properties;

import com.sapient.currencyMap.CurrencyMap;
import com.sapient.fileExcpetion.FileException;
import com.sapient.personDAOHandler.PersonHandler;
import com.sapient.readFile.ConfigurationFile;
import com.sapient.writePersonDetails.SavePersonDetails;

public class Launcher {

	public static void main(String[] args) {
		calculateIncomeDataInUSD();
	}

	public static void calculateIncomeDataInUSD() {
		Properties properties;
		try {
			initCurrencyRates();
			properties = loadConfiguration();
			PersonHandler personHandler = new PersonHandler();
			personHandler.setFileFormat(properties.getProperty("fileFormat"));
			personHandler.setFileName(properties.getProperty("input_file") + "." + personHandler.getFileFormat());
			personHandler.readPersonInfoFromFileAndinitializePerson();

			if (PersonHandler.personMap.size() > 0)
				SavePersonDetails.write(properties.getProperty("output_file") + "." + personHandler.getFileFormat());
		} catch (FileException | IOException e) {
			System.out.println(e.getMessage());
		}
	}

	private static void initCurrencyRates() throws FileException {
		CurrencyMap.initMap();
	}

	private static Properties loadConfiguration() throws FileException {
		return new ConfigurationFile().readConfiguration();
	}

}
