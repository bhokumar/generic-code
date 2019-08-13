package OOPs;

import OOPExtendeds.InheritanceParent;

public class Inheritance extends InheritanceParent{

	public static void main(String[] args) {
		/**
		 * s inheritance defines the relationship is-a between a superclass and its subclasses, aggregation defines the relationship has-a
		 Object objRef = stringRef; // (4)
Both references denote the same String object after the assignment. One might be tempted to invoke methods exclusive to the String
subclass via the superclass reference objRef, as illustrated at (5).
System.out.println("(5): " + objRef.length()); // (5) Not OK.
However, this will not work as the compiler does not know what object the reference objRef is denoting. It only knows the class of the
reference.

Method overriding - Same signature, same return type

The method invoked is dependent on the type of the actual object denoted by the reference at runtime

Method overriding - 
The new method definition must have the same method signature (i.e., method name and parameters) and the same return
type.
Whether parameters in the overriding method should be final is at the discretion of the subclass (see Section 3.22, p. 94). A
method's signature does not encompass the final modifier of parameters, only their types and order.
The new method definition cannot narrow the accessibility of the method, but it can widen it (see Section 4.9, p. 137).
The new method definition can only specify all or none, or a subset of the exception classes (including their subclasses)
specified in the throws clause of the overridden method in the superclass (see Section 5.9, p. 201).

A subclass cannot override fields of the superclass, but it can hide them

Overloading occurs when the method names are the same, but the parameter
lists differ.
		 */
		practice2();
	}

	private static void practice1()
	{
		String str = new String("manisha");
		
		System.out.println(str.getClass());
		
		Object obj = str;
		
		System.out.println(obj.getClass());
		
		System.out.println(obj.equals("manisha"));
		
		String y = new String("manisha");
		
		System.out.println(y.hashCode() + "---" + obj.hashCode());
		System.out.println(obj.equals(new String("manisha")));
		
		System.out.println(str.equals(y));
	}
	
	private static void practice2()
	{
		InheritanceParent p = new Inheritance();
	
	}
	
	private void dd()
	{
		
	}
}
