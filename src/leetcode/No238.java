package leetcode;
class No238 {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int l=1;
        for(int i=0;i<res.length;i++){
            res[i]=l;
            l*=nums[i];
        }
        l=1;
        for(int j=res.length-1;j>=0;j--){
            res[j]*=l;
            l*=nums[j];
        }
        return res;
    }
}