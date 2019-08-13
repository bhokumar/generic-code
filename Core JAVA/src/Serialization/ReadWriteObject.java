package Serialization;

import java.io.*;

/**
 * Created by manishasingh on 7/28/2017.
 */
public class ReadWriteObject implements Serializable {
	public static Object readObject(String fileName) {
		try {
			ObjectInputStream inputStream = new ObjectInputStream(
					new BufferedInputStream(new FileInputStream(new File(fileName))));
			Object obj = inputStream.readObject();
			System.out.println(obj);
			return obj;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	public static void writeObject(Object rule, String fileName) {
		try {
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(
					new BufferedOutputStream(new FileOutputStream(new File(fileName))));
			objectOutputStream.writeObject(rule);
			objectOutputStream.flush();
			objectOutputStream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
