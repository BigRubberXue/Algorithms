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


class No94{
    /*
    List<Integer> res = new ArrayList<>();
    
    public List<Integer> inorderTraversal(TreeNode root) {
        inList(root);
        return res;
    }
    public void inList(TreeNode r1){
        if(r1==null){
            return;
        }
        inList(r1.left);
        res.add(r1.val);
        inList(r1.right);
    }
    
    */
     List<Integer> res = new ArrayList<>();
     public List<Integer> inorderTraversal(TreeNode root) {
         Stack<TreeNode> tree = new Stack<>();
         TreeNode t = root;
         while(!tree.isEmpty()||t!=null){
             while(t!=null){
                 tree.push(t);
                 t=t.left;  
             }
             if(!tree.isEmpty()){
                 t=tree.pop();
                 res.add(t.val);
                 t=t.right;
             }
         }
         return res;
     }
}