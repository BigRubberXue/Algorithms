package leetcode;
class No26 {
    public int removeDuplicates(int[] nums) {
        int count=0;
        for(int i=1;i<nums.length;++i){
            if(nums[i-1]==Integer.MAX_VALUE){
                int k = i;
                while(nums[--k]==Integer.MAX_VALUE);
                if(nums[k]==nums[i]){
                    nums[i]=Integer.MAX_VALUE;
                    count++;
                }
            }
            else if(nums[i]==nums[i-1]){
                nums[i]=Integer.MAX_VALUE;
                count++;
            }
        }
        Arrays.sort(nums);
        return nums.length-count;
    }
}