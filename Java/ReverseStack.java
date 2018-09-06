import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseStack {
	
	/*
	 * Reverse stack assuming that the only two methods that
	 * are implemented in the stack class are push() and pop()
	 * Queues can be used for this, but assume the only two 
	 * methods that are implemented in a Queue is enqueue()
	 * and dequeue()
	 */
	public static <T> void reverseStack(Stack<T> s) {
		Queue<T> reverse = new LinkedList<T>();
		
		while(true) {
			try {
				reverse.add(s.pop());
			}catch(Exception e) {
				break;
			}
		}
		
		while(true) {
			try {
				s.push(reverse.remove());
			}catch(Exception e) {
				break;
			}
		}
	}
	
	public static void main(String [] args) {
		Stack<Character> c = new Stack<Character>();
		c.push('A');
		c.push('B');
		c.push('C');
		System.out.println(c);
		reverseStack(c);
		System.out.println(c);

	}

}