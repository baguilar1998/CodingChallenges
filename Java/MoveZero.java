class MoveZero{
    /**
     * Takes a linked-list and moves all elements that have a 0 
     * as data to the front of the list
     */
    public static void move0(LinkedList<Integer> l) {
		Node<Integer> temp = l.head;
		while(temp!=null) {
			if(temp.getNext().getData()==0) {
				Node<Integer> get0 = temp.getNext();
				temp.setNext(get0.getNext());
				get0.setNext(l.head);
				l.head=get0;
			}
			temp = temp.getNext();
		}
	}
}