package leetcode;
class No49 {
    
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List> map = new HashMap<>();
        for(String s : strs){
            char[] a = s.toCharArray();
            Arrays.sort(a);
            if(map.containsKey(String.valueOf(a))){
                List<String> l1=map.get(String.valueOf(a));
                l1.add(s);
                map.put(String.valueOf(a),l1);
            }else{
                List<String> l2=new ArrayList<>();
                l2.add(s);
                map.put(String.valueOf(a),l2);
            }
        }
        return new ArrayList(map.values());
    }
    
    
}