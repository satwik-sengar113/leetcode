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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode ite = list1;
        ListNode ap = list1;
        ListNode bp = list1;
        for(int i =0; i<=b ; i++){
            ite=ite.next;
            if(i==a-2){
                ap=ite;
            }
        }
        bp=ite;
        ap.next=list2;
        ite=list2;
        while(ite.next!=null){
            ite=ite.next;
        }
        ite.next=bp;
        return list1;
    }
}