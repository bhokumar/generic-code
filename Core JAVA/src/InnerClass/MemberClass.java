package InnerClass;

/**
 * Created by manishasingh on 7/27/2017.
 */
public class MemberClass {
    private final int a = 20;

    public final void ss()
    {
        System.out.println("ssadasd");

        MemberSubClass m = new MemberSubClass();
        m.display();
    }
    private static  class MemberSubClass{
        private int a = 10;

        private void display()
        {
            System.out.println("a = " + a + ", Outer a = " + this.a);
//            MemberClass.this.ss();
        }
    }
}
