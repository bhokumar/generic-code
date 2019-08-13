package ExceptionHandling;

public class NestedTry {

	public static void main(String[] args) {
		try
		{
		try {
			try {
				
				Integer i = new Integer("sdfsdf");
				
				String str = null;
				str.hashCode();

				System.out.println("gdfgdfgdf");
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("2");
			}
		} catch (NullPointerException e) {
			System.out.println("ttt");
		}
		}
		catch(NumberFormatException e)
		{
			System.out.println("Number Format ");
		}

	}

}
