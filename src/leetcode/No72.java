package leetcode;
class No72 {
    public int minDistance(String word1, String word2) {
        int word1L = word1.length();
        int word2L = word2.length();
        int[][] dp = new int[word1L+1][word2L+1];
        for(int i=0;i<word1L+1;i++){
            dp[i][0]=i;
        }
        for(int i=0;i<word2L+1;i++){
            dp[0][i]=i;
        }
        for(int i=1;i<word1L+1;i++){
            for(int j=1;j<word2L+1;j++){
                if(word1.charAt(i-1)==word2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1];
                }else{
                    dp[i][j]=1+Math.min(dp[i-1][j],Math.min(dp[i][j-1],dp[i-1][j-1]));
                }
            }
        }
        return dp[word1L][word2L];
    }
}
