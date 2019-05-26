package leetcode;
class No3 {
    public int lengthOfLongestSubstring(String s) {
        List<Character> st = new ArrayList<>();
        int maxL=0;
        for(int i=0;i<s.length();){
            if(st.contains(s.charAt(i))){
                st.remove(0);
            }else{
                st.add(s.charAt(i));
                i++;
            }
            maxL=Math.max(maxL,st.size());
        }
        return maxL;
    }
}