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
    public boolean isPalindrome(ListNode head) {
       if(head.next==null){
           return true;
       } 
       ListNode fast=head;
       ListNode slow= head;
       while(fast!=null&&fast.next!=null){
           fast=fast.next.next;
           slow=slow.next;
       }
       ListNode temp=null;
       ListNode prev=null;
       ListNode curr=slow;
       while(curr!=null){
           temp=curr.next;
           curr.next=prev;
           prev=curr;
           curr=temp;
       }
       ListNode left=head;
       ListNode right=prev;
       while(right!=null){
           if (right.val != left.val){  
                return false;   
            }
            left= left.next;
            right= right.next;
       }
       return true;
    }
}