package leetcode;
class No53 {
    public int maxSubArray(int[] nums) {
        //dp[i]=Math.max(nums[i],dp[i-1]+nums);
        //return max(dp[]);
        if(nums.length<1){
            return 0;
        }
        int[] dp = new int[nums.length];
        dp[0]=nums[0];
        int max=Integer.MIN_VALUE;
        for(int i=1;i<nums.length;i++){
            dp[i]=Math.max(nums[i],dp[i-1]+nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            max=Math.max(dp[i],max);
        }
        return max;
    }
}