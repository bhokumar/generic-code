package StringPack;

import java.util.Date;

public class STR {

	int a = 6;
	String b  = "fsdf";
	
	Date date = new Date(2017, 8, 25);
	
	public static void main(String[] args) {
		
		practice1();
	}

	public static void practice1()
	{
		String str = new String("manishani");
		
		Object obj;
		/**
		 * 1. finalize -  Called by the garbage collector on an object when garbage collection
     * determines that there are no more references to the object.
     * 
     *     2. Using the jmap command line tool, as in the following example:
jmap -dump:format=b,file=E:\aa.dump 8480


netstat -ano | findstr 8080
jmap -dump:format=b,file=E:\aa.dump 15976
jhat aa.dump

2. wait
3. notify
3. notifyAll
4. toString()
5.clone - CloneNotSupportedException  if the object's class does not
     *               support the {@code Cloneable} interface
6. equals
7. hashcode
8. getClass
9. wait(timeout)
10. wait(timeout, nanos)

		 */
		
		
		
	}
	
	
	public void b()
	{
		System.out.println("Calling b");
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		STR str=  new STR();
		str.a = this.a;
		str.b = this.b;
		str.date = this.date;
		
		return str;
	}
	
@Override
protected void finalize() throws Throwable {
	// TODO Auto-generated method stub
	System.out.println("Calling Finalize -------------");
}
}
