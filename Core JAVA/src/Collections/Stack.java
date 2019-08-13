package Collections;

/**
 * Created by manishasingh on 8/1/2017.
 */
public class Stack {

    /* All Methods are synchronized. */
    public static void main(String[] args) {
        practice1();
    }

    public static void practice1()
    {
        java.util.Stack stack = new java.util.Stack();

        stack.push("a");
        stack.push("b");

        System.out.println(stack.pop());

        System.out.println(stack);

        System.out.println(stack.peek());
    }
}
