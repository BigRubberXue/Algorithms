package leetcode;
class No198 {
    public int rob(int[] nums) {
        //dp[i]=Math.max(dp[i-1],dp[i-2]+nums[i])
        if(nums.length<1){
            return 0;
        }
        int cmaxL=nums[0];
        if(nums.length==1){
            return cmaxL;
        }
        int maxL=Math.max(cmaxL,nums[1]);
        for(int i=2;i<nums.length;i++){
            int temp=maxL;
            maxL=Math.max(maxL,cmaxL+nums[i]);
            cmaxL=temp;
        }
        return maxL;
    }
}