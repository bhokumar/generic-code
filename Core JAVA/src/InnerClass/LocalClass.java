package InnerClass;

/**
 * Created by manishasingh on 7/27/2017.
 */
public class LocalClass {

    /**
     * 1. If method is static then Local Inner Class can use only static fields and methods.
     *
     * 2. Local Inner Class can have static members if they are constant.
     *
     * 3. Cannot Change method variable inside local class.
     */
    private int a = 10;

    private static void d() {
        System.out.println("fvd");
    }

    public  void   display() {

        final int y = 10;

        class A {
            private static final int a = 20;

            public void display() {
                System.out.println(y);

                LocalClass.this.a = 30;
                LocalClass.d();
            }
        }

        A a = new A();
        a.display();
    }
}
