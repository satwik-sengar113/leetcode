/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten (Node head) {
    if(head == null) return head;
    
    Node prev = new Node(0, null, head, null);
    flattenHelper(prev, head);
    head.prev = null;
    return head;
}

private Node flattenHelper(Node prev, Node node) {
    if (node == null) return prev;
    
    prev.next = node;
    node.prev = prev;
    prev = node;
    
    Node next = node.next; 
    Node tail = flattenHelper(node, node.child); 
    node.child = null; 
    return flattenHelper(tail, next);       
}
}