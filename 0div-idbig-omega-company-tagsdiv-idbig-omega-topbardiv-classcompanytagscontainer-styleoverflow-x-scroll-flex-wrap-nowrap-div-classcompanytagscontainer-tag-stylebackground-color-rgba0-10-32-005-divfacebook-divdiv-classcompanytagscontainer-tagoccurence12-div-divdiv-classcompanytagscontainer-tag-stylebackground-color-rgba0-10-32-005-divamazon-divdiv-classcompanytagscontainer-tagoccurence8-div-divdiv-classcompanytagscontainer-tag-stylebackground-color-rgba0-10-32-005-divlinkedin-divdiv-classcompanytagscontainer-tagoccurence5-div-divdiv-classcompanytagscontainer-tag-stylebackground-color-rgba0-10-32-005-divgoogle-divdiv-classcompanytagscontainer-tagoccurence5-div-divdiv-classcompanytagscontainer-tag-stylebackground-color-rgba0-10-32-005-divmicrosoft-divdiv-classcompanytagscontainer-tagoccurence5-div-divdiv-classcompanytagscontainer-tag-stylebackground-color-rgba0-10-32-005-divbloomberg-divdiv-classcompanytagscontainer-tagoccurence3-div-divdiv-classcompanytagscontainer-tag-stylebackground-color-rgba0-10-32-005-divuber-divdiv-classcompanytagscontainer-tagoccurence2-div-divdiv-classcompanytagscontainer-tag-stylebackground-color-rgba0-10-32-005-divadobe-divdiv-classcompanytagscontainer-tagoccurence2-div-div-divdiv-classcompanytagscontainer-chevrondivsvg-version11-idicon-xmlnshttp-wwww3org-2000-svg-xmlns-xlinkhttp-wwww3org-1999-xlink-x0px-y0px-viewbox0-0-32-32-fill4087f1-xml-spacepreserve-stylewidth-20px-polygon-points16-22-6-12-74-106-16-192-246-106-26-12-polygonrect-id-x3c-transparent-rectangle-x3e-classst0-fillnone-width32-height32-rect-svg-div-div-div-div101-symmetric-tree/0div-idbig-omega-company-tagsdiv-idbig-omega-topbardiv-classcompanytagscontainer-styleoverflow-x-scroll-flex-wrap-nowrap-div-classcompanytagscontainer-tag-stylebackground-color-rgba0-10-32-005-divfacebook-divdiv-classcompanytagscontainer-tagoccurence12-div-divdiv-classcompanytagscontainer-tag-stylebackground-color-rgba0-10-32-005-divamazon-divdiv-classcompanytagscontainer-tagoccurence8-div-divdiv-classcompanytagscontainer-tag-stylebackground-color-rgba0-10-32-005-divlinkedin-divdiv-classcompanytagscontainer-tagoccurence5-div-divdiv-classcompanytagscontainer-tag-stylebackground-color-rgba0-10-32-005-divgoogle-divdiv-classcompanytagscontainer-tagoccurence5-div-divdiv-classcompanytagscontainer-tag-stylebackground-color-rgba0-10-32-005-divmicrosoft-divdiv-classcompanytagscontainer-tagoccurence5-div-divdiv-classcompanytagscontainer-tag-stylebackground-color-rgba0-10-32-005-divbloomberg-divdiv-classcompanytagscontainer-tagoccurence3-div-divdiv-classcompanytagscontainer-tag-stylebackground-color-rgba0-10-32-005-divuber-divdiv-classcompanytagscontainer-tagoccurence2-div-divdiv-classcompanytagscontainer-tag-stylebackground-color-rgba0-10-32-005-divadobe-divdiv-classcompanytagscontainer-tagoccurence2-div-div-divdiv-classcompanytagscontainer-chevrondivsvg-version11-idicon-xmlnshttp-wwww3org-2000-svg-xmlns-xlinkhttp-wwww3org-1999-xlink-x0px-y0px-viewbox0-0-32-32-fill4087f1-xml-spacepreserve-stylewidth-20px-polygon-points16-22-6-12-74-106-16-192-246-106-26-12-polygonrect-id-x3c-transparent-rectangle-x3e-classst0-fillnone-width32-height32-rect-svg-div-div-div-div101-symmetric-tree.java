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
    public boolean isSymmetric(TreeNode root) {
        return help(root,root);
    }
    public static boolean help(TreeNode lefty,TreeNode righty){
        if(lefty==null&&righty==null){
            return true;
        }
        if(lefty!=null&&righty!=null&&lefty.val==righty.val){
            boolean b1=help(lefty.left,righty.right);
            boolean b2=help(lefty.right,righty.left);
            return b1&&b2;
        }
        return false;
    }

}