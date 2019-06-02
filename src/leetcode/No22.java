package leetcode;
class No22 {
    
    /*
    List<String> list = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        if(n<1){
            return list;
        }
        loadS("",0,0,n);
        return list;
    }
    
    public void loadS(String s,int l,int r,int n){
        if(s.length()==n*2){
            list.add(s);
            return ;
        }
        if(l<n){
            loadS(s+"(",l+1,r,n);
        }
        if(r<l){
            loadS(s+")",l,r+1,n);
        }
    }
    
    */
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        if(n==0){
            list.add("");
            return list;
        }
        for(int lt=0;lt<n;lt++){
            for(String left :generateParenthesis(lt)){
                for(String right : generateParenthesis(n-1-lt)){
                    list.add("("+left+")"+right);
                }
            }
        }
        return list;
    }
    
}