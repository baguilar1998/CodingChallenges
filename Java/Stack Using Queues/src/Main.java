
public class Main {
	public static void main(String [] args) {
		Stack<Integer> stack = new QueueStack<>();
		System.out.println(stack);
		stack.push(1);
		System.out.println(stack);
		stack.push(2);
		System.out.println(stack);
		stack.push(3);
		System.out.println(stack);
		stack.push(4);
		System.out.println(stack);
		try {
			stack.pop();
			stack.pop();
			stack.pop();
			stack.pop();
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println(stack);
	}
}
