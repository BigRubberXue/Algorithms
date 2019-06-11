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
class No543 {
    int dir=0;
    public int diameterOfBinaryTree(TreeNode root) {
        dirs(root);
        return dir;
        
    }
    
    public int dirs(TreeNode root){
        if(root==null){
            return -1;
        }
        int maxL = dirs(root.left)+1;
        int maxR = dirs(root.right)+1;
        if(maxL+maxR>dir){
            dir=maxL+maxR;
        }
        return Math.max(maxL,maxR);
    }
}