package OOPExtendeds;

public class InheritanceParent {
	
	private int i;
	
	int h;
	
	protected String j;
	
	String p;
	
	private static int k;
	
	protected InheritanceParent(){
		i = 11;
		h = 21;
		j = "pp1";
		p = "manisha1";
		k = 88;
		
		System.out.println("kkkkkkkkkkk");
	}

	static{
		k = 9;
		
		System.out.println("nnnnnnnnnnnnn");
	}
	{
		i = 1;
		h = 2;
		j = "pp";
		p = "manisha";
		k = 99;
		
		System.out.println("llllllllllll");
	}
}
