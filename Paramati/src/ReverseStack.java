import java.util.Stack;

public class ReverseStack {

	public static void main(String[] args) {
		ReverseStack reverseStack = new ReverseStack();

		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		System.out.println(stack);
		reverseStack.reverse(stack, stack.size());
		
		System.out.println(stack);
	}
	
	public void reverse(Stack<Integer> stack, int size)
	{
		if(size == 0)
			return;
		
       Integer p = stack.pop();
       reverse(stack, --size);
      
       System.out.println( "gffd" + p);
	}

	public void reve1(Integer p , Stack<Integer> stack)
	{
		if(stack.isEmpty())
			return;
		
		stack.push(p);
		
		
	}
}
