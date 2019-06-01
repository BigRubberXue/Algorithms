package leetcode;
class No104 {
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int now = deep(root);
        return now;

    }
    public int deep(TreeNode l1){
        int x = 0;
        if(l1.left==null&&l1.right==null){
            return 1;
        }
        if(l1.left!=null){
            x = deep(l1.left)+1;
        }
        if(l1.right!=null){
            return Math.max(x,deep(l1.right)+1);
        }
        return x;
    }
    
}