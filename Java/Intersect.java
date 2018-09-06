class Intersect {

    /*
    Given 2 singly linked lists, determine if the two lists intersect. Return
    true if they do intersect, otherwise false
    */

    //O(n) time based on how the linked-list is structured
  public static <T> boolean doesIntersect(LinkedList<T> l1, LinkedList<T> l2){
    Node<T> temp;
    Node<T> traverse;
    //If the first list is bigger than the second one, get the
    //tail node of the second list and traverse through the first one
    if(l1.size()>=l2.size()){
      temp=l2.getTail();
      traverse=l1.getHead();
      while(traverse!=null){
        if(traverse.equals(temp))return true;
        traverse=traverse.getNext();
      }
    //If the second list is bigger than the first one, get the
    //tail node of the first list and traverse through the second one
    } else if(l2.size()>=l1.size()){
      temp=l1.getTail();
      traverse=l2.getHead();
      while(traverse!=null){
        if(traverse.equals(temp))return true;
        traverse=traverse.getNext();
      }
    }
    return false;
  }

  public static void main(String[] args) {
    LinkedList<Integer> list1 = new LinkedList<Integer>();
    list1.addTail(1);
    list1.addTail(2);
    list1.addTail(3);
    LinkedList<Integer> list2 = new LinkedList<Integer>();
    list2.addHead(3);
    list2.setTail(list1.getTail());
    System.out.println(list1);
    System.out.println(list2);
    System.out.println(doesIntersect(list1,list2));
  }

}
class LinkedList<T> {
   // instance variables
   private Node<T> head, tail,prevTail;
   private int size;

   // constructor
   public LinkedList() {
      head = tail = prevTail=null;
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
      prevTail=head;
      head = n;
      size++;
      if (tail == null){
        tail =prevTail = head;
      }
   }

   public void addTail(T d) {
      Node<T> n = new Node<T>(d, null);
      if (tail == null)
         head = tail = n;
      else {
         tail.setNext(n);
         prevTail=tail;
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

  public Node<T> getTail(){return tail;}
  public Node<T> getHead(){return head;}
  public void setTail(Node<T> t){
      prevTail.setNext(t);
      tail=t;
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