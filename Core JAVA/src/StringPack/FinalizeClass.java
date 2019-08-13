package StringPack;

public class FinalizeClass{

	/**
	 * private static class Blah
	{
	  public void finalize() { System.out.println("finalizing!"); }
	}

	private static void f() throws Throwable
	{
	   Blah blah = new Blah();
	   blah.finalize();
	}

	public static void main(String[] args) throws Throwable
	{
	    System.out.println("start");
	    f();
	    System.gc();
	    System.out.println("done");
	}
	
	 * @param args
	 */
	public static void main(String[] args) {
		STR s = new STR();
		
try {
	STR ss = (STR)s.clone();
	
	System.out.println(s.date + " " + ss.date);
} catch (CloneNotSupportedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	
//		try {
//			s.finalize();
//		} catch (Throwable e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		
//		
//		System.gc();
//		try
//		{
//		s.b();
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//		}
//		
		
		System.out.println("STOP");

	}
	


}
