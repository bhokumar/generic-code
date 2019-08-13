package InnerClass;

/**
 * Created by manishasingh on 7/27/2017.
 */
public class Super {
    private int a = 10;

    private static class A{
        private int b = 20;

        private static void display()
        {
            System.out.println("private");

        }
    }

    public void display()
    {
        A.display();
        System.out.println();

        System.out.println("ddd" + a);
    }
}
