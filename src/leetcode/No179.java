package leetcode;

import java.util.Arrays;
import java.util.Comparator;

class No179{
    public String largestNumber(int[] nums) {
        String[] numsS = new String[nums.length];
        String res = new String();
        for(int i=0;i<nums.length;i++){
            numsS[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(numsS,new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
                return -(o1+o2).compareTo(o2+o1);
            }
        });
        for(int i=0;i<numsS.length;i++){
            res=res+numsS[i];
        }
        if(res.charAt(0) =='0'){
            return "0";
        }
        return res;
    }
}