package leetcode;
class No283 {
    public void moveZeroes(int[] nums) {
        int local=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[local]=nums[i];
                local++;
            }
        }
        for(int i=local;i<nums.length;i++){
            nums[i]=0;
        }
    }
}