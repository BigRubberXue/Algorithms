package leetcode;
class No354 {
    public int maxEnvelopes(int[][] envelopes) {
        
        /*dp[n]=dp[x]+1
        *xÎª·ûºÏÖµ
        *dp[x]=Math.max(dp[1.....x-1]);
        *
        *while(w>w;h>h){dp[n]=dp[x]+1}
        *
        */
        if(envelopes.length==0){
            return 0;
        }
        Arrays.sort(envelopes,(o1,o2)-> {
            if(o1[0]!=o2[0]){
                return o1[0]-o2[0];
            }else{
                return o1[1]-o2[1];
            }
            
        });
        int[] dp = new int[envelopes.length];
        int count=0;
        for(int[] i : envelopes){
            for(int j=0;j<count;j++){
                if(envelopes[count][0]>envelopes[j][0]&&envelopes[count][1]>envelopes[j][1]){
                    dp[count]=Math.max(dp[count],dp[j]);
                }
            }
            dp[count]++;
            count++;   
        }
        Arrays.sort(dp);
        return dp[envelopes.length-1];
    }
}