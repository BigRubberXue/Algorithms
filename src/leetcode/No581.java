package leetcode;
class No581 {
    public int findUnsortedSubarray(int[] nums) {
        if(nums.length<2){
            return 0;
        }
        int[] temp = new int[nums.length];
        for(int x=0;x<nums.length;x++){
            temp[x]=nums[x];
        }
        Arrays.sort(temp);
        int i=0;
        while(temp[i]==nums[i]&&i!=nums.length-1){
            i++;  
        }
        int j = nums.length-1;
        while(temp[j]==nums[j]&&j!=0){
            j--;
        }
        int res = j-i+1;
        return res>0?res:0;
    }
}