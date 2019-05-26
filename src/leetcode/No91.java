package leetcode;
class No91 {
    public int numDecodings(String s) {
        char[] ch = s.toCharArray();
        if(ch[0]=='0'){
            return 0;
        }
        if(s.length()==1){
            return 1;
        }
        int[] dp=new int[s.length()];
        dp[0]=1;
        if(Integer.parseInt(ch[0]+""+ch[1])<=26&&ch[1]!='0'){
            dp[1]=2;
        }else if(Integer.parseInt(ch[0]+""+ch[1])<26){
            dp[1]=1;
        }else if(ch[1]=='0'){
            return 0;
        }else{
            dp[1]=1;
        }
        for(int i=2;i<s.length();i++){
            //dp[i]=dp[i-1];
            //dp[i]=Integer.parseInt(ch[i-1]+""+ch[i])>26?dp[i]:dp[i]+dp[i-2]; 
            if(ch[i]=='0'){
                if(Integer.parseInt(ch[i-1]+"")>2||Integer.parseInt(ch[i-1]+"")==0){
                    return 0;
                }else{
                    dp[i]=dp[i-2];
                }
            }else if(ch[i-1]=='0'){
                dp[i]=dp[i-1];
            }else{
                dp[i]=Integer.parseInt(ch[i-1]+""+ch[i])>26?dp[i-1]:dp[i-1]+dp[i-2];
            }
        }
        return dp[s.length()-1];
    }
}