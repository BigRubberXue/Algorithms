package leetcode;
class No1 {
    public int[] twoSum(int[] nums, int target) {
        int x=0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            x=nums[i];
            if(map.containsKey(target-x)){
                int y=map.get(target-x);
                return new int[]{y,i};
            }else{
                map.put(x,i);
            }
        }
        return new int[]{0,0};
    }
}