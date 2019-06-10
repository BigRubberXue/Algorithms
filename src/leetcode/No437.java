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
class No437 {
    public int pathS(TreeNode root, int sum) {
        if(root==null){
            return 0;
        }
        int max=0;
        if(sum==root.val){
            max++;
        }
        max+=pathS(root.left,sum-root.val);
        max+=pathS(root.right,sum-root.val);
        return max;
    }
    
    public int pathSum(TreeNode root, int sum) {
        if(root==null){
            return 0;
        }
        int max = 0;
        max+=pathS(root,sum);
        max+=pathSum(root.left,sum);
        max+=pathSum(root.right,sum);
        return max;
    }
    
}