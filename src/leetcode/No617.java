package leetcode;
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class No617 {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1==null&&t2!=null){
            return t2;
        }
        if(t2==null&&t1!=null){
            return t1;
        }
        if(t1==null&&t2==null){
            return t1;
        }
        t1.val+=t2.val;
        mergeTrees(t1.left,t2.left);
        mergeTrees(t1.right,t2.right);
        if(t1.left==null){
            t1.left=t2.left;
        }
        if(t1.right==null){
            t1.right=t2.right;
        }
        return t1;
    }
}