package ExceptionHandling;

import java.io.IOException;

public class ExceptionHandling
{
    public static void main(String[] args)
    {
    	
      methodOne();
       
    }
 
   public static void methodOne()
   {
	   method2(); 
   }
   
   public static void method2()
   {
	   try
	   {
	   method3(); 
	   }
	   catch(ArrayIndexOutOfBoundsException e)
	   {
		   System.out.println("dfgdfgdddddg");
	   }
   }
   
   public static void method3()
   {
	   throw new IOException("gdfgdfgdgdg");
   }
   
    static void methodWithThrow() 
    {
    	String s = null;
//        System.out.println(s.length());   //This statement throws NullPointerException
        
        throw  new IllegalMonitorStateException("sdfsdf");
       
        
//        
//        try
//        {
//            String s = null;
//            System.out.println(s.length());   //This statement throws NullPointerException
//        }
//        catch(NullPointerException ex)
//        {
//            System.out.println("NullPointerException is caught here");
// 
//            throw ex;     //Re-throwing NullPointerException
//        }
    }
}
