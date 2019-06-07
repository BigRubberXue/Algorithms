package leetcode;
class No169 {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }

    /*
    public int majorityElement(int[] nums) {
        int mar = Integer.MIN_VALUE;
        int count=0;
        for(int i : nums){
            if(count==0){
                mar=i;
                count++;
            }else{
                if(i==mar){
                    count++;
                }else{
                    count--;
                }
            }
        }
        return mar;
    }
    */
}