package OOPExtendeds;

import java.sql.SQLException;

import OOPExtendeds.SuperClass;

public class SubClass extends SuperClass{

	public static void main(String[] args) {
				
		SuperClass s = new SuperClass();
		SuperClass.A a = s.new A();
	
//		SuperClass superClass1 = new SubClass();
//		superClass1.ff();
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
	
//	@Override
//	public Integer display(){
//		// TODO Auto-generated method stub
//		return 7;
//	}
//
//	@Override
//	protected SubClass ff() {
//		
//		int yy = super.y;
//		System.out.println("Print FF");
//		// TODO Auto-generated method stub
//		return new SubClass();
//	}
	
	public void cc()
	{
		System.out.println("sfjdf");
	}
}
