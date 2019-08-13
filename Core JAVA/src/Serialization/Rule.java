package Serialization;

import java.io.*;

/**
 * Created by manishasingh on 7/28/2017.
 */
public class Rule  implements Serializable{

    public static final long serialVersionID = 123789346733463354L;

    public  String a ;

    public  int b;

    public static  int bb = -1;

    public transient  int c = 9;

    public int h ;


    public ReadWriteObject readWriteObject = new ReadWriteObject();

    private Rule() {
    	System.out.println("Creating");
//		bb = 8;
//		c = 17;
//		h = 19;
	}
    public static void main(String[] args) {
        Rule rule = new Rule();
        try {

        	rule.h = 20;
       
           A a = new A();
           a.display();
           ReadWriteObject.writeObject(a, "a.ser");
            A aa = (A)ReadWriteObject.readObject("a.ser");
            
            int yk = aa.j;
            
            System.out.println("j = " + yk);
//            System.out.println(ReadWriteObject.readObject("a.ser"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "a = " + a + ", b = " + b + ", bb  = " + bb + ", c = " + c + ", h = " + h ;
    }
}
