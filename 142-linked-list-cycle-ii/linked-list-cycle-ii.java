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
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null ) {
            return head ;
        }
        ListNode slow = head; 
        ListNode fast = head;

        while (fast != null && fast.next != null) 
      {
            slow = slow.next;   
            fast = fast.next.next; 
            
            if (slow == fast) {      
                break;
            }
        }      
        while(head.next!=null &&slow.next!=null){
            
            
        if(slow==head){

            return head;
        }
        head=head.next;
            slow=slow.next;}  

        return null;  
    }
}