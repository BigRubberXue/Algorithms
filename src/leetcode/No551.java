class No551 {
//学生出勤记录 I
    public boolean checkRecord(String s) {
        //Map<String,Integer> map = new HashMap<>();
        //Set<String> sSet = new HashSet<>();
        if(s.length()<2){
            return true;
        }
        int num_A=0;
        for(int i = 0 ; i<s.length() ; i++){
            char n = s.charAt(i);
            if(n=='A' ){
                if(num_A==1){
                    return false;
                }else{
                    num_A++;
                }  
            }
        }
        int count=0;
        if(s.length()==2){
            return true;
        }
        for(int i = 1 ; i<s.length()-1 ; i++){
            char n = s.charAt(i);
            if(n=='L'&& s.charAt(i-1)=='L' && s.charAt(i+1)=='L'){
                return false;
            }
        }
        if(s.charAt(s.length()-3)=='L'&& s.charAt(s.length()-2)=='L' && s.charAt(s.length()-1)=='L'){
            return false;
        }
        return true;
        
    }
}