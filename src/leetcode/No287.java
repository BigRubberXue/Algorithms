package leetcode;
class No287 {
    public int findDuplicate(int[] nums) {
        int length = nums.length;
        int left = 1;
        int right = length - 1;
        while (left<right) {
            int mid = left + (right-left)/2;
            int count = 0;
            for(int i=0;i<length;i++) {
                if(nums[i]<=mid){
                    count++;
                }
            }
            if(count>mid){
                right=mid;
            } else {
                left=mid+1;
            }
        }
        return left;

        
        /*
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if((nums[i]^nums[j])==0){
                    return nums[i];
                }
            }
        }
        return 0;
        
        */
    }
}