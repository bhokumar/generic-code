package com.sapient.readFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import com.sapient.fileExcpetion.FileException;

public abstract class ReadDataStream {
	public abstract void readDataFromFile(String str) throws FileException, FileNotFoundException, IOException;

	public boolean isFileExist(String fileName) {
		File file = new File(fileName);

		if (file.exists())
			return true;

		return false;
	}
}
