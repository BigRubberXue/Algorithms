package leetcode;
class No39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        res=x(0,candidates.length-1,candidates,target);
        return res;
    }
    
    public List<List<Integer>> x(int low,int high,int[] cand,int target){
        List<List<Integer>> list = new ArrayList<>();
        if(target<cand[low]){
            return list;
        }
        int local = 0;//0~local
        if(cand[high]<=target){
            local=high;
        }else{
            while(cand[local]<target){
                local++;
            }
        }
        for(int i=low;i<=local;i++){
            if(cand[i]==target){
                List<Integer> l2 = new ArrayList<>();
                l2.add(cand[i]);
                list.add(l2);
            }
            for(List<Integer> l1 : x(i,local,cand,target-cand[i])){
                if(l1.size()!=0){
                    List<Integer> l2 = new ArrayList<>();
                    l2.add(cand[i]);
                    for(Integer lnum : l1){
                        l2.add(lnum);
                    }
                    list.add(l2);
                }
            }
            
        }
        return list;
    }
    
    
    
}