package ExceptionHandling;

public class ExceptionDoc {

	/**
	 * 
	 * 
	 * 
	 * Throwable - 
	 *     1. Error
	 *     2. Exception
	 * 
	 * Error - 
	 * 
	 * java.lang.VirtualMachineError : The most common virtualMachineErrors are StackOverFlowError and OutOfMemoryError.
java.lang.AssertionError
java.lang.LinkageError  : The common LinkageError are NoClassDefFoundError and subclasses of IncompatibleClassChangeError. The most frequent IncompatibleClassChangeErrors are NoSuchMethodError, NoSuchFieldError, AbstractMethodError, IllegalAccessError and InstantiationError.
All sub classes of Error class are unchecked type of exceptions. i.e They occur during run time only.

throws - If a method is capable of throwing an exception that it could not handle, then it should specify that exception using throws keyword. It helps the callers of that method in handling that exception. The syntax for using throws keyword is,

CheckedException - 

1. ClassNotFountException
FileNotFoundException
SQL
IO

Uncheked - 

NumberFormatException 

n Java, both ClassNotFoundException and NoClassDefFoundError occur when a particular class is not found at run time. But, they occur at different scenarios. ClassNotFoundException is an exception which occurs when you try to load a class at run time using Class.forName() or loadClass() methods and mentioned classes are not found in the classpath. On the other hand, NoClassDefFoundError is an error which occurs when a particular class is present at compile time but it was missing at run time. In this tutorial, we will see the differences between ClassNotFoundException Vs NoClassDefFoundError in java and when they occur.


Errors are mainly caused by the environment in which an application is running. For example, OutOfMemoryError happens when JVM runs out of memory. Where as exceptions are mainly caused by the application itself. For example, NullPointerException occurs when an application tries to access null object.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
