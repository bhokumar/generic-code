package com.sapient.personDAOHandler;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

import com.sapient.fileExcpetion.FileException;
import com.sapient.fileFormatInputStream.FileFormatInputStream;
import com.sapient.personDAO.PersonDAO;
import com.sapient.readFile.ReadDataStream;

public class PersonHandler {

	public static ConcurrentHashMap<PersonDAO, PersonDAO> personMap = new ConcurrentHashMap<>();

	private String fileFormat;

	private String fileName;

	public void readPersonInfoFromFileAndinitializePerson() throws FileNotFoundException, FileException, IOException {

		ReadDataStream readDataStream = FileFormatInputStream.getInputStream(fileFormat);

		readDataStream.readDataFromFile(fileName);
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileFormat() {
		return fileFormat;
	}

	public void setFileFormat(String fileFormat) {
		this.fileFormat = fileFormat;
	}

	@Override
	public String toString() {
		return "fileFormat = " + fileFormat + ", fileName = " + fileName;
	}
}
