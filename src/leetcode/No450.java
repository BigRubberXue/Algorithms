package leetcode;
class No450 {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(isLeafNode(root)){
            if(root.val==key){
                return null;
            }else{
                return root;
            }
        }
        TreeNode res = root;
        TreeNode resRoot = root;
        while(res!=null){
            if(res.val==key){
                break;
            }
            resRoot=res;
            if(res.val>key){
                res=res.left;
            }else{
                res=res.right;
            }
        }
        if(res==null){
            return root;
        }
        //delete
        if(isLeafNode(res.left)){
            res.val=res.left.val;
            res.left=null;
        }else if(isLeafNode(res.right)){
            //移动right节点到删除节点
            res.val=res.right.val;
            res.right=null;
        }else if(isLeafNode(res)){
            if(res.val>resRoot.val){
                resRoot.right=null;
            }else{
                resRoot.left=null;
            }
        }else if(res.left==null||res.right==null){
            // res.left==null?res.right:res.left
            if(res.val>resRoot.val){
                resRoot.right = res.left==null?res.right:res.left;
            }else{
                resRoot.left = res.left==null?res.right:res.left;
            }
        }else{
            TreeNode res_1 = res.left; 
            while(res_1.right!=null&&res_1.right.right!=null){
                res_1=res_1.right;
            }
            TreeNode res_2 = res_1.right;
            if(res_2==null){
                if(res.val>resRoot.val){
                    resRoot.right=res_1;
                }else{
                    resRoot.left=res_1;
                }
                res_1.right=res.right;
            }else{
                if(res_2.left!=null){
                    res_1.right=res_2.left;
                    res.val=res_2.val;
                }else{
                    res_1.right=null;
                    res.val=res_2.val;
                }
            }
        }
        return root;
    }
    
    
    public boolean isLeafNode(TreeNode res){
        if(res!=null&&res.left==null&res.right==null){
            return true;
        }
        return false;
    }
}