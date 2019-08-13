package com.sapient.readFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.sapient.fileExcpetion.FileException;

public class ConfigurationFile {

	private String configFileName = "src/com/sapient/resources/application.properties";

	public Properties readConfiguration() throws FileException {
		if (!isFileExist())
			throw new FileException("Configuration File " + configFileName + " is not present in the application.");

		Properties properties = null;
		InputStream in = null;
		try {

			in = new FileInputStream(new File(configFileName));
			properties = new Properties();
			properties.load(in);
		} catch (FileNotFoundException e) {
			throw new FileException("Configuration File " + configFileName + " is not present in the application.");
		} catch (IOException e) {
			throw new FileException("Configuration File " + configFileName + " can be accessed in another attempt.");
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		return properties;
	}

	public Properties readCurrencyRatesPropFile() throws FileException {
		configFileName = "src/com/sapient/resources/currencyRates.properties";

		return readConfiguration();
	}

	private boolean isFileExist() {
		File file = new File(configFileName);
		return file.exists();
	}
}
