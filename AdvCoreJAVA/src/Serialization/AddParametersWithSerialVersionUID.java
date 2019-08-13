package Serialization;

import java.io.Serializable;

public class AddParametersWithSerialVersionUID implements Serializable{

	public static final long serialVersionUID = 7346834347835457455l;
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
		AddParametersWithSerialVersionUID child = new AddParametersWithSerialVersionUID();
		child.setAge(20);
		child.setName("manisha");
		child.setPrice(6.9d);
		child.setDep("Axway");
//		FileOperation.writeObject(child, "a.ser");
		AddParametersWithSerialVersionUID obj = (AddParametersWithSerialVersionUID)FileOperation.readObject("a.ser");
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
