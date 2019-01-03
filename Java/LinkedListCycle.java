/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> nodes = new HashSet<ListNode>();
        ListNode temp = head;
        while(temp!=null){
            if(nodes.contains(temp))return true;
            nodes.add(temp);
            temp = temp.next;
        }
        return false;
    }
}