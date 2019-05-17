package leetcode;

class No931{
public int minFallingPathSum(int[][] A) {
        //x=j-1<0?Integer.MAX_VALUE:dp[i+1][j-1]
        //y=dp[i+1][j]
        //z=j+1>A[0].length?Integer.MAX_VALUE:dp[i+1][j+1]
        //dp[i][j]=min(x,y,z)+A[i][j]
        int m = A.length;
        int n = A[0].length;
        int[][] dp=new int[m][n];
        for(int i=0;i<n;i++){
            dp[m-1][i]=A[m-1][i];
        }
        for(int i=m-2;i>=0;--i){
            for(int j=0;j<=n-1;++j){
                int x=j-1<0?Integer.MAX_VALUE:dp[i+1][j-1]; 
                int y=dp[i+1][j];
                int z=j+1>A[0].length-1?Integer.MAX_VALUE:dp[i+1][j+1];
                dp[i][j]=Math.min(Math.min(x,y),z)+A[i][j]; 
            }
        }
        
        int res=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            res=Math.min(res,dp[0][i]);   
        }
        
        return res;
        
    }
}