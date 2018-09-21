class SumOfLists{
    	//If the lists were in reversed order O(n)
	public static LinkedList<Integer> sumOfLists(LinkedList<Integer> list1, LinkedList<Integer> list2){
		Node<Integer> it1 = list1.head;
		Node<Integer> it2 = list2.head;
		
		LinkedList<Integer> answer = new LinkedList<Integer>();
		
		Integer remainder =0;
		
		while(it1!=null && it2!=null) {
			Integer sum = it1.getData()+it2.getData()+remainder;
			
			if(it1.getNext()==null && it2.getNext()==null) {
				while(sum!=0) {
					answer.addTail(sum%10);
					sum/=10;
				}
			}
			else if(sum>=10) {
				remainder = sum/10;
				answer.addTail(sum%10);
			}else {
				answer.addTail(sum);
			}
			it1=it1.getNext();
			it2=it2.getNext();
		}
		
		return answer;
		
		
	}
	
	//If the lists were in regular order O(n)
	public static Node<Integer> sumOfLists(Node<Integer> list1, Node<Integer> list2){
		if(list1.getNext()==null && list2.getNext()==null) {
			Node<Integer> n = new Node<Integer>(list1.getData()+list2.getData(),null);
			return n;
		}
		Node<Integer>sum = sumOfLists(list1.getNext(),list2.getNext());
		Node<Integer> currentNode = new Node<Integer>(list1.getData()+list2.getData(),sum);
		if(sum.getData()>=10) {
			Integer remainder = sum.getData()/10;
			sum.setData(sum.getData()%10);
			currentNode.setData(currentNode.getData()+remainder);
		}
		return currentNode;
	}
}