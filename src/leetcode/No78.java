package leetcode;
class No78 {
    
    List<List<Integer>> res = new ArrayList<>();
    
    public List<List<Integer>> subsets(int[] nums) {
        for(int i=0;i<=nums.length;i++){
            for(List<Integer> l1 : sub(nums,i)){
                res.add(l1);
            }
        }
        return res;
    }
    
    public List<List<Integer>> sub(int[] nums,int high){
        List<Integer> ln = new ArrayList<>();
        List<List<Integer>> ret = new ArrayList<>();
        if(high==nums.length){
            ret.add(ln);
            return ret;
        }
        for(int i=high+1;i<=nums.length;i++){
            for(List<Integer> l1 : sub(nums,i)){
                List<Integer> lx = new ArrayList<>();
                lx.add(nums[high]);
                for(Integer l2 : l1){
                    lx.add(l2);
                }
                ret.add(lx);
            }
        }
        return ret;
    }
    
}