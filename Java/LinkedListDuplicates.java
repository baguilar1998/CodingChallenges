import java.util.HashSet;

public class LinkedListDuplicates {
	public static Node<Integer> removeDuplicates(Node<Integer> head){
		HashSet<Integer> val = new HashSet<Integer>();
		Node<Integer> temp = head;
		
		while(temp!=null) {
			if(!val.contains(temp.getData())) {
				val.add(temp.getData());
			}
			
			Node<Integer> temp2 = temp;
			while(temp2!=null) {
				if(!val.contains(temp2.getData()))break;
				temp2=temp2.getNext();
			}
			temp.setNext(temp2);
			temp = temp.getNext();
		}
		
		return head;
	}
	public static void main(String[] args) {
		
		LinkedList<Integer> testList = new LinkedList<Integer>();

		testList.addTail(3);
		testList.addTail(4);
		testList.addTail(3);
		testList.addTail(2);
		testList.addTail(6);
		testList.addTail(1);
		testList.addTail(2);
		testList.addTail(6);
		System.out.println(testList);
		System.out.println(removeDuplicates(testList.head));
		System.out.println(testList);
		
	}
}
class Node<T> {
   private T data;
   private Node<T> next;

   public Node() {
      data = null;
      next = null;
   }

   public Node(T d, Node<T> n) {
      data = d;
      next = n;
   }

   public T getData() {
      return data;
   }

   public Node<T> getNext() {
      return next;
   }

   public void setData(T d) {
      data = d;
   }

   public void setNext(Node<T> n) {
      next = n;
   }

   // Node testing methods

   public String toString() {
      Node<T> seenBefore = this;
      String ans = "";
      int count = 0;
      Node<T> node = this;
      while (node != null) {
         ans += node.getData();
         ans += "-->";
         node = node.getNext();
         if (++count % 2 == 0) seenBefore = seenBefore.getNext();
         if (node == seenBefore) {
            ans += " ... ";
            break;
         }
      }
      return ans + "=";
   }
}
class LinkedList<T> {
   // instance variables
   Node<T> head, tail;
   private int size;

   // constructor
   public LinkedList() {
      head = tail = null;
      size = 0;
   }

   // utility methods

   public int size() {
      return size;
   }

   public boolean isEmpty() {
      return size == 0;
   }

   // methods to change the list

   public void addHead(T d) {
      Node<T> n = new Node<T>(d, head);
      head = n;
      size++;
      if (tail == null)
         tail = head;
   }

   public void addTail(T d) {
      Node<T> n = new Node<T>(d, null);
      if (tail == null)
         head = tail = n;
      else {
         tail.setNext(n);
         tail = n;
      }
      size++;
   }

   public T removeHead() throws Exception {
      if (head == null)
         throw new Exception("Empty List");
      Node<T> n = head;
      head = head.getNext();
      if (head == null)
         tail = head;
      size--;
      return n.getData();
   }

   public void delete() {
	  while(!isEmpty()) {
		  head = head.getNext();
		  --size;
	  }
	  
   }
   
   // LinkedList testing methods:

   public String toString() {
      String ans = "";
      Node<T> n = head;
      ans += "(H)-->";
      while (n != null) {
         ans += n.getData();
         ans += "-->";
         n = n.getNext();
      }
      return ans + "(T)";
   }
  }