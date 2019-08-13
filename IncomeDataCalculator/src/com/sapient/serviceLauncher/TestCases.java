package com.sapient.serviceLauncher;
import static org.junit.Assert.*;
import org.junit.Test;
import com.sapient.personDAOHandler.PersonHandler;


public class TestCases {

	@Test
	public void checkIfInputFilePresent() {

		PersonHandler personHandler = new PersonHandler();
		personHandler.setFileName("Sample_Input1.csv");
		personHandler.setFileFormat("csv");
		
		/* 1.  Check Input file present*/
		try {
			personHandler.readPersonInfoFromFileAndinitializePerson();
		} catch (Exception e) {
			
			assertEquals("File " + personHandler.getFileName() + " is not present in system.", e.getMessage());
		}
	}

	/**
	 * 1. Test Case - Generate Output CSV File and Match with your output file
	 */
}
