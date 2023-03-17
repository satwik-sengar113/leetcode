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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null) return list2;
        if(list2 == null) return list1;
        ListNode h3 = null;
        if(list1.val<list2.val){
            h3=list1;
            list1=list1.next;
        }
        else{
            h3=list2;
            list2=list2.next;
        }
        ListNode head=h3;
        while(list1!=null&&list2!=null){
            if(list1.val < list2.val){
                h3.next=list1;
                list1=list1.next;
                h3=h3.next;
            }
            else{
                h3.next=list2;
                list2=list2.next;
                h3=h3.next;
            }
        }
        if(list1!= null) h3.next = list1;
        if(list2 != null) h3.next = list2;
        return head;
    }
}