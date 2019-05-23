package leetcode;
class No611 {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int result = 0;
        for (int i = nums.length - 1; i >= 2; i--) {
            int k = 0;
            int j = i - 1;
            while (k < j) {
                //�����������˵����num[k]��num[j]����������Ҫ�󣬽��ֱ�Ӽ���j - k
                if (nums[k] + nums[j] > nums[i]) {
                    result += j - k;
                    j--;
                } else {
                    //����k�����������ж�
                    k++;
                }
            }
        }
        return result;
    }
}

/*
class Solution {
    public int triangleNumber(int[] nums) {
        int maxL=0;
        if(nums.length<3){
            return 0;
        }
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){
                for(int k=j+1;k<nums.length;k++){
                    if(isTra(nums[i],nums[j],nums[k])){
                        maxL++;
                    }
                }
            }
        }
        return maxL;
    }
    
    public boolean isTra(int x,int y,int z){
        return x+y>z&&x+z>y&&y+z>x;
    }
}
*/