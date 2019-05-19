package leetcode;
class No791{

    public String customSortString(String S, String T) {
        int local=0;
        char[] T_res=T.toCharArray();
        for(int i=0;i<S.length();i++){
            char n=S.charAt(i);
            for(int j=0;j<T.length();j++){ 
                if(T_res[j]==n){
                    char temp = T_res[local];
                    T_res[local]=T_res[j];
                    local++;
                    
                    T_res[j]=temp;
                }
            }
        }
        String v=String.valueOf(T_res); 
        return v;
    }

}
