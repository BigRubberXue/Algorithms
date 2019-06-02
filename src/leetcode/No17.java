package leetcode;
class No17 {
    char[][] keep = {{'a','b','c','0'},{'d','e','f','0'},{'g','h','i','0'},{'j','k','l','0'},{'m','n','o','0'},
                         {'p','q','r','s','0'},{'t','u','v','0'},{'w','x','y','z','0'}};
    public List<String> letterCombinations(String digits) {
        List<String> list =  new ArrayList<>();
        if(digits.length()<1){
            return list;
        }
        //char[] dig = digits.toCharArray();
        list = com(digits,0);
        return list;
    }
    public List<String> com(String s,int d){
        List<String> list =  new ArrayList<>();
        char now = s.charAt(d);
        int local = Integer.parseInt(String.valueOf(s.charAt(d)))-2;
        if(d==s.length()-1){
            int x=0;
            while(keep[local][x]!='0'){
                list.add( keep[local][x]+"");
                x++;
            }
            return list;
        }
        for(String str : com(s,d+1)){
            int x=0;
            while( keep[local][x]!='0'){
                list.add( keep[local][x]+str);
                x++;
            }
        }
        return list;
    }
}