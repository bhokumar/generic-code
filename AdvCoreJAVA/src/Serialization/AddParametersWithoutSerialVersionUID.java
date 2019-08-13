package Serialization;

import java.io.Serializable;

public class AddParametersWithoutSerialVersionUID implements Serializable{

	private int age;
	private String name;
	private double price = 5.6d;
	private String dep;
	
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
		AddParametersWithoutSerialVersionUID child = new AddParametersWithoutSerialVersionUID();
		child.setAge(20);
		child.setName("manisha");
		child.setPrice(6.9d);
		child.setDep("Axway");
//		FileOperation.writeObject(child, "a.ser");
		AddParametersWithoutSerialVersionUID obj = (AddParametersWithoutSerialVersionUID)FileOperation.readObject("a.ser");
		System.out.println(obj);
	}
	
	@Override
	public String toString() {
		return "age = " + age + ", name = " + name + ", price = " + price + ", Dep = " + dep;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}

	public String getDep() {
		return dep;
	}

	public void setDep(String dep) {
		this.dep = dep;
	}
}
