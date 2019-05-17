package leetcode;

public class No300 {

	public int lengthOfLIS(int[] nums) {
        
        int res = 0;
        if (nums.length < 2) {
            return nums.length;
        }
        //Dp
        //Dp[n]=Dp[x]+1
        //x为比n小的最大数
        int[] Dp = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int get = 0;
            for(int j = 0 ; j < i ; j++){
                if(nums[i]>nums[j]){ 
                   Dp[i]=Math.max(Dp[j],Dp[i]);
                }
            }
            Dp[i]++;
            res=Math.max(Dp[i],res);
        }
        return res;
    }

}