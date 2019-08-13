package InnerClass;

/**
 * Created by manishasingh on 7/27/2017.
 */
public class AnonymousClass {
    public static void main(String[] args) {
        AnonymousInterface type = new AnonymousInterface() {
            @Override
            public void display() {
                System.out.println("ss");
            }
        };

        type.display();
    }
}
