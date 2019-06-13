package leetcode;
class No448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[] ints = new int[nums.length+1];
        for(int i:nums){
            ints[i]=1;
        }
        List<Integer> res = new ArrayList<>();
        int local=1;
        while(local!=nums.length+1){
            if(ints[local]!=1){
                res.add(local);
            }
            local++;
        }
        return res;
    }
/*
public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<>();
        
        Arrays.sort(nums);
        int local=1;
        for(int temp : nums){
            if(temp==local){
                local++;
                continue;
            }else if(temp>local){
                while(local!=temp){
                    res.add(local);
                    local++;
                }
                local++;
            }
 
        }
        while(local<=nums.length){
            res.add(local);
            local++;
        }

        return res;
    }

*/



}