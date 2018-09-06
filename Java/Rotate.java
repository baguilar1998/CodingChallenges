public class Rotate{
    /**
    * Given a singly linked list, rotate the linked list counter-clockwise by k nodes. 
    * Where k is a given positive integer. For example, if the given linked list is 
    * 10->20->30->40->50->60 and k is 4, the list should be modified to 
    * 50->60->10->20->30->40. Assume that k is smaller than the count of nodes in linked list.
    * @param list the given linked list
    * @param k the number of nodes you want to rotate
    */
    public static <T> void rotate(LinkedList<T> list, int k) throws Exception{
		if(k == 0) return;
		if( k > list.size()) throw new Exception("Not a valid size");
		Node<T> temp = list.head;
		int count = 1;
		while(k != count) {
			temp = temp.getNext();
			++count;
		}
		list.tail.setNext(list.head);
		list.head = temp.getNext();
		temp.setNext(null);
		list.tail=temp;
    }

    public static void main(String [] args){
        LinkedList<Integer> testList = new LinkedList<Integer>();
		for(int i=1; i<=6; ++i) testList.addTail(i*10);
		System.out.println(testList);
		try {
			rotate(testList,2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(testList);
		
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