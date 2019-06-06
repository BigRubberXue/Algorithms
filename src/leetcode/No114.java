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
class No114 {
    public void flatten(TreeNode root) {
        TreeNode head = root;
        while(head!=null){
            if(head.left!=null){
                TreeNode temp = head.left;
                TreeNode temR = head.left;
                head.left=null;
                while(temR.right!=null){
                    temR=temR.right;
                }
                temR.right=head.right;
                head.right=temp;
            }
            head=head.right;
        }
    }
}