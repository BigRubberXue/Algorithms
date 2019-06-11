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
class No538 {
    
    int maxL=0;
    
    public TreeNode convertBST(TreeNode root) {
        if(root==null){
            return root;
        }
        convertBST(root.right);
        root.val+=maxL;
        maxL=root.val;
        convertBST(root.left);
        return root;
    }
}