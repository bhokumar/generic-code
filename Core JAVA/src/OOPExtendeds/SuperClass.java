package OOPExtendeds;

import java.io.IOException;
import java.sql.SQLException;

public class SuperClass {

	private int i;
	
	public class A{
		public A()
		{
			
		}
		
		public void dd()
		{
			
		}
	}
	public SuperClass()
	{
		System.out.println("iiiiiiiiiiiiii");
	}
	
	public SuperClass(int c)
	{
		System.out.println("iiiiiiiiiiiiiijjjjjjjjjjjjjj");
	}
	public int y ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	protected Integer display() throws SQLException, IOException
	{
		return 4;
	}

	protected SuperClass ff()
	{
		System.out.println("Print Super Class");
		return new SuperClass();
	}
}
