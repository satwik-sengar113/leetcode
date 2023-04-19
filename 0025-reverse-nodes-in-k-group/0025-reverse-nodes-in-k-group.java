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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || k==1){
            return head;
        }    
        int count=0;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr=dummy,pre=dummy,nxt=dummy;
        while(curr.next!=null){
            count++;
            curr=curr.next;
        }
        while(count>=k){
            curr=pre.next;
            nxt=curr.next;
            for(int i = 1 ;i<k;i++ ){
                curr.next=nxt.next;
                nxt.next=pre.next;
                pre.next=nxt;
                nxt=curr.next;
            }
            pre=curr;
            count-=k;
        }
        return dummy.next;
        
    }
}