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
    public ListNode swapNodes(ListNode head, int k) {
       int count = 0, size = 0;
        ListNode curr = head;
        while(curr != null){
            size++;
            curr = curr.next;
        }
        ListNode start = head;
        ListNode end = head;
        while(count != k - 1){
            count++;
            start = start.next;
        }
        int i = 0;
        while(i < size - k){
            i++;
            end = end.next;
        }
        int temp = start.val;
        start.val = end.val;
        end.val = temp;
        return head; 
    }
}