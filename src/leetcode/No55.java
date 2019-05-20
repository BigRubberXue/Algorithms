package leetcode;
class No55 {
    public boolean canJump(int[] nums) {
        if(nums.length==1){
            return true;
        }
        int local=nums[0];
        for(int i=0;i<nums.length;++i,--local){
            if(i==0){
                if(local>0){
                    continue;
                }else{
                    return false;
                }
            }else{
                if(nums[i]>local){
                    local=nums[i];
                }
            }
            if(local==0&&i<nums.length-1){
                return false;
            }
        }
        return true;
    }
}