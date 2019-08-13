package OOPs;

import java.io.IOException;
import java.sql.SQLException;

public class SubClass extends SuperClass{

	public static void main(String[] args) throws IOException{
				
		SubClass superClass1 = new SubClass();
		superClass1.display();
//		
//		/* Case 2 */
//		SubClass subClass1 = (SubClass)(new SuperClass());
//		subClass1.ff();
//		
//		/* Case 3 */
//		SuperClass superClass = (new SuperClass());
//		superClass.ff();
////		
////		/* Case 4 */
//		SubClass superClass11 = (new SubClass());
//		superClass11.ff();

	}
	
	@Override
	public Integer display() throws IllegalMonitorStateException{
		// TODO Auto-generated method stub
		return 7;
	}


	
	public void cc()
	{
		System.out.println("sfjdf");
	}
}
