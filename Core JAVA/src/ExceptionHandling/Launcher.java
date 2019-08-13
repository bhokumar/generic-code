package ExceptionHandling;

/**
 * Created by manishasingh on 7/26/2017.
 */
public class Launcher {
    public static void main(String[] args)  {
        double a = 5/0;

        System.out.println(a);
        ExceptionHandler exceptionHandler = new ExceptionHandler();

        try {
            int i = 0;
            System.out.println(i++ + ++i + i++ + i++ + ++i + i++);
            System.out.println("Updated = " + i);
          
        }
        catch(ArithmeticException e) {
            System.out.print("World");
        }
        exceptionHandler.tt();
    }
}
