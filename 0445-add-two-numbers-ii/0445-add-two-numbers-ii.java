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
     public ListNode reverse(ListNode head){
            ListNode prev = null;
            ListNode curr = head;
            ListNode temp = null;
            while(curr != null){
                temp=curr.next;
                curr.next=prev;
                prev=curr;
                curr=temp;
            }
            return prev;
        }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       
        ListNode rl1=reverse(l1);
        ListNode rl2=reverse(l2);
        ListNode dummy=new ListNode(0);
        ListNode tail=dummy;
        int carry=0;
        while(rl1!=null || rl2!=null){
            int x=(rl1!=null)?rl1.val:0;
            int y=(rl2!=null)?rl2.val:0;
            int sum=carry+x+y;
            carry=sum/10;
            tail.next=new ListNode(sum%10);
            tail=tail.next;
            if(rl1!=null) rl1=rl1.next;
            if(rl2!=null) rl2=rl2.next;
        }
        if(carry>0)
            tail.next=new ListNode(carry);
        l1=reverse(dummy.next);
        return l1;    
    }
}