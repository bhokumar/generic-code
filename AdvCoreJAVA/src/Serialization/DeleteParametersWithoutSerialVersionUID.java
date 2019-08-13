package Serialization;

import java.io.Serializable;

public class DeleteParametersWithoutSerialVersionUID implements Serializable{

	private int age;
	private String name;
	private double price = 5.6d;
	
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
		DeleteParametersWithoutSerialVersionUID child = new DeleteParametersWithoutSerialVersionUID();
		child.setAge(20);
		child.setName("manisha");
		child.setPrice(6.9d);
//		FileOperation.writeObject(child, "a.ser");
		DeleteParametersWithoutSerialVersionUID obj = (DeleteParametersWithoutSerialVersionUID)FileOperation.readObject("a.ser");
		System.out.println(obj);
	}
	
	@Override
	public String toString() {
		return "age = " + age + ", name = " + name + ", price = " + price;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}
}
