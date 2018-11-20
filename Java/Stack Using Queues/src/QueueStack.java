import java.util.LinkedList;
import java.util.Queue;

/**
 * Implement a stack using Queues only
 * @author Brian Kenji Aguilar
 * @param <T> any data type
 */
public class QueueStack<T> implements Stack<T> {
	
	Queue<T> q1,q2;
	int size;
	
	public QueueStack() {
		q1= new LinkedList<>();
		q2 = new LinkedList<>();
		size = 0;
	}
	
	
	public int size() {return size;}
	public boolean isEmpty() {return size==0;}

	@Override
	public void push(T x) {
		if(isEmpty()) {
			q1.add(x);
			++size;
		} else if(!q1.isEmpty()) {
			q2.add(x);
			++size;
			while(!q1.isEmpty()) q2.add(q1.remove());
		}else {
			q1.add(x);
			++size;
			while(!q2.isEmpty()) q1.add(q2.remove());
		}
		
	}

	@Override
	public T pop() throws Exception{
		if(isEmpty())
			throw new Exception("Stack is empty");
		--size;
		if(!q1.isEmpty()) return q1.remove();
		return q2.remove();
	}

	@Override
	public T peek() throws Exception {
		if(isEmpty())
			throw new Exception("No Such Element");
		if(!q1.isEmpty()) return q1.element();
		return q2.element();
	}
	
	public String toString() {
		if(!q1.isEmpty()) return q1.toString();
		return q2.toString();
	}

}
