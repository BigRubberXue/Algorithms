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
class No687 {
    public int longestUnivaluePath(TreeNode root) {
        int countMax=Integer.MIN_VALUE;
        if(root==null){
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while(queue.peek()!=null){
            TreeNode test = queue.poll();
            if(test.left!=null){
                queue.offer(test.left);
            }
            if(test.right!=null){
                queue.offer(test.right);
            }    countMax=Math.max(deepSearch(test.left,test.val)+deepSearch(test.right,test.val),countMax);
        }
        return countMax;
    }
    public int deepSearch(TreeNode note,int value){
        if(note==null){
            return 0;
        }
        if(note.val!=value){
            return 0;
        }
        return Math.max(deepSearch(note.left,value),deepSearch(note.right,value))+1;
    }
}