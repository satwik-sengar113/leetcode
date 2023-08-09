/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        List<Integer> li1 = new ArrayList<Integer>();
        preorder(p,li1);
        List<Integer> li2=new ArrayList<Integer>();
        preorder(q,li2);
        boolean ans=li1.equals(li2);
        return ans; 
    }
    public static void preorder(TreeNode root,List<Integer> li){
        if(root==null){
            li.add(-1);
            return;
        }
        li.add(root.val);
        preorder(root.left,li);
        preorder(root.right,li);
    }
}