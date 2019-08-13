package Serialization;

import java.io.Serializable;

public class ReadResolve extends Parentt  {
	private int age;
	private static String fName;
	private transient String name;
	private final transient double price;
	private final String currency;
	private static final boolean mode = true;
	public ReadResolve() {
		price = 3.7;
		currency = "INR";
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		withoutImplementSerializable();
	}

	public static void withoutImplementSerializable() {
		ReadResolve child = new ReadResolve();
		child.setAge(20);
		child.setName("manisha");
        child.fName = "Chandan";
		FileOperation.writeObject(child, "a.ser");
		Example obj = (Example) FileOperation.readObject("a.ser");
		System.out.println(obj);
	}

	@Override
	public String toString() {
		return "age = " + age + ", name = " + name + ", fName = " + fName + ", price = " + price + ", currency = " + currency + ", mode = " + mode;
	}

	public static String getfName() {
		return fName;
	}

	public static void setfName(String fName) {
		ReadResolve.fName = fName;
	}

	public double getPrice() {
		return price;
	}

	public String getCurrency() {
		return currency;
	}
}

class Parentt implements Serializable{
	public static final long serialVersionUID = 7346834347835457455l;
	public Parentt() {
		System.out.println("gggggggggggggggg");
	}
}