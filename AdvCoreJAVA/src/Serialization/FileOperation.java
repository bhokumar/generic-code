package Serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileOperation {
	public static void writeObject(Object obj, String fileName) {
		try {
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(new File(fileName)));
			objectOutputStream.writeObject(obj);
			objectOutputStream.flush();
			objectOutputStream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Object readObject(String fileName) {
		try {
			ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(new File(fileName)));
			Object obj = objectInputStream.readObject();
			objectInputStream.close();

			return obj;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
