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
class No337{
    public int rob(TreeNode root) {
        int[] res = maxRoot(root);
        return Math.max(res[0],res[1]);
    }
    public int[] maxRoot(TreeNode root){
        if(root==null){
            return new int[2];
        }
        int[] max = new int[2];
        int[] leftchild = maxRoot(root.left);
        int[] rightchild = maxRoot(root.right);
        max[0]=Math.max(leftchild[0],leftchild[1])+Math.max(rightchild[0],rightchild[1]);
        max[1]=leftchild[0]+rightchild[0]+root.val;
        return max;
    }
}