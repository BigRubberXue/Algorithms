package leetcode;
class No75 {
    public void sortColors(int[] nums) {
        int low = 0;
        int high = nums.length-1;
        int local = 0;
        while(local<=high){
            if(nums[local]==2){
                int temp = nums[local];
                nums[local] = nums[high];
                nums[high] = temp;
                high--;
            }else if(nums[local]==0){
                int temp = nums[local];
                nums[local]=nums[low];
                nums[low]=temp;
                low++;
                local++;
            }else{
                local++;
            }
        }
    }
}