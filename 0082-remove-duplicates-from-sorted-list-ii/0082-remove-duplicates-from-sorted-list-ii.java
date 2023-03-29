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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return head;
        }
        ListNode curr = new ListNode (0);
        curr.next=head;
        ListNode returnnode=curr;
        ListNode i=curr.next;
        while(curr.next!=null&&curr.next.next!=null){
            if(i.val==i.next.val){
                int value=i.val;
                while(i!=null&&i.val==value){
                    i=i.next;
                    
                }
                curr.next=i;
            }
            else{
                i=i.next;
                curr=curr.next;
            }
        }
        return returnnode.next;
    }
}