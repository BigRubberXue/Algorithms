package leetcode;
class No136 {
    public int singleNumber(int[] nums) {
        
        /*
        int ans=0;
        for(int i=0;i<nums.length;i++){
            ans=ans^nums[i];
        }
        return ans;
        
        */
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])==null){
                map.put(nums[i],1);
            }else{
                map.put(nums[i],2);
            }
        }
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])==1){
                return nums[i];
            }
        }
        return nums[nums.length];
        
    }
}