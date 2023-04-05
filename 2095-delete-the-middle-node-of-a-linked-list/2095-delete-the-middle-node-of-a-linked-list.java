/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head.next==null){
            return null;
        }
        else if(head.next.next==null){
            head.next=null;
            return head;
        }
        ListNode l=new ListNode(0);
        l.next=head;
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null&&fast.next!=null ){
            l=l.next;   
            slow = slow.next;
            fast = fast.next.next;
        }
        l.next=slow.next;
        return head;
    }
}