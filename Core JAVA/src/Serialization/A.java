package Serialization;

import java.io.Serializable;

/**
 * Created by manishasingh on 7/28/2017.
 */


 class B implements Serializable{
  int j = 10;	
  
  public B()
  {
	System.out.println("B");  
  }
  
  public void display()
  {
	  j=11;
  }
}
public class A extends B {
    public int y;

    public BB b;
    
    public A()
    {
    	System.out.println("C");
    }

    @Override
    public String toString() {
        return "y = " + y ;
    }
    
    
    class D{
    	String n;
    }
}
