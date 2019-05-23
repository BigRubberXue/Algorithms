package leetcode;
class No386{
    public List<Integer> lexicalOrder(int n) {
        String[] list = new String[n];
        for(int i=0;i<n;i++){
            list[i]=(i+1)+"";
        }
        Arrays.sort(list,(o1,o2)->{
            return o1.compareTo(o2);
        });
        List<Integer> nlist = new ArrayList<>();
        for(String s:list){
            nlist.add(Integer.valueOf(s).intValue());
        }
        return nlist;
    }
}