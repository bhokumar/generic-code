package ExceptionHandling;

/**
 * Created by manishasingh on 7/27/2017.
 */
public class Error {
    public static void main(String[] args) {
        Error error = new Error();

        try
        {
            throw new java.lang.Error("dsfsdf");

        }
        catch(java.lang.Error e)
        {
            e.printStackTrace();
        }
        System.out.println("dsds");
    }
}
