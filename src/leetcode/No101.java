/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
package leetcode;
class No101 {

    public boolean isSymmetric(TreeNode root) {
        return test(root,root);
    }
    public boolean test(TreeNode l1,TreeNode l2){
        if(l1==null&&l2==null){
            return true;
        }
        if(l1==null||l2==null){
            return false;
        }
        return (l1.val==l2.val)&&test(l1.right,l2.left)&&test(l1.left,l2.right);
        
    }
}