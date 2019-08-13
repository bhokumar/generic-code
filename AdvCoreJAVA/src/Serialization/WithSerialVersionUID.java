package Serialization;

import java.io.Serializable;

public class WithSerialVersionUID implements Serializable{

	public static final long serialVersionUID = 7346834347835457455l;
	private int age;

	private String name;

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
		WithSerialVersionUID child = new WithSerialVersionUID();
		child.setAge(20);
		child.setName("manisha");
		
		FileOperation.writeObject(child, "a.ser");
		WithSerialVersionUID obj = (WithSerialVersionUID)FileOperation.readObject("a.ser");
		System.out.println(obj);
	}
	
	@Override
	public String toString() {
		return "age = " + age + ", name = " + name;
	}
}
