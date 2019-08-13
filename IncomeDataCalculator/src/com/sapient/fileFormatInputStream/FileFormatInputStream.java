package com.sapient.fileFormatInputStream;

import com.sapient.readFile.ReadCSVInputFile;
import com.sapient.readFile.ReadDataStream;

public class FileFormatInputStream {

	public static ReadDataStream getInputStream(String fileFormat) {
		ReadDataStream readDataStream = null;

		if (fileFormat.equals("csv")) {
			readDataStream = new ReadCSVInputFile();
		}

		return readDataStream;
	}
}
