package leetcode;
class No46 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        
        list = ch(nums,0,new int[nums.length]);
        return list;
    }
    public List<List<Integer>> ch(int[] nums,int has,int[] got){
        List<List<Integer>> list = new ArrayList<>();
        if(has==nums.length){
            return list;
        }
        if(has==nums.length-1){
            int x = 0;
            while(true){
                if(got[x]==0){
                    break;
                }
                x++;
            }
            List<Integer> ll = new ArrayList<>();
            ll.add(nums[x]);
            list.add(ll);
            return list;
        }
        for(int i=0;i<nums.length;i++){
            if(got[i]==1){
                continue;
            }else{
                got[i]=1;
                for(List<Integer> l1 : ch(nums,has+1,got)){
                    List<Integer> ll = new ArrayList<>();
                    for(Integer l2 : l1){
                        ll.add(l2);
                    }
                    ll.add(nums[i]);
                    list.add(ll);
                }
                got[i]=0;
            }
        }
        return list;
    }
    
}