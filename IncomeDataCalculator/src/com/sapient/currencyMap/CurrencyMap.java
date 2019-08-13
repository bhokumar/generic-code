package com.sapient.currencyMap;

import java.util.Enumeration;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

import com.sapient.fileExcpetion.FileException;
import com.sapient.readFile.ConfigurationFile;

public class CurrencyMap {
	public static ConcurrentHashMap<String, Double> concurrencyMap = new ConcurrentHashMap<>();

	public static void initMap() throws FileException {

		Properties properties = loadCurrencyRates();
		Enumeration enuKeys = properties.keys();
		while (enuKeys.hasMoreElements()) {
			String key = (String) enuKeys.nextElement();
			String value = properties.getProperty(key);
			concurrencyMap.put(key, Double.parseDouble(value));
		}
	}

	private static Properties loadCurrencyRates() throws FileException {
		return new ConfigurationFile().readCurrencyRatesPropFile();
	}

	public static void changeCurrencyValue(String currencyName, String currencyValue) throws FileException {
		concurrencyMap.clear();
		initMap();
	}
}
